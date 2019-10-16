package structuralpattern.proxypattern.v2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class ProxyWindowsCommand implements RunCommandSystem {

    boolean isAdmin = false;
    private RunCommandSystem runCommandSystem;

    public ProxyWindowsCommand(String user, String pass) {
        if ("Edmond".equals(user) && "Med!@1.".equals(pass))
            this.isAdmin = true;
        runCommandSystem = new WindowsCommandsExecute();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (this.isAdmin) {
            this.runCommandSystem.runCommand(cmd);
        } else {
            if (this.deniedCommand(cmd)) {
                throw new Exception(" Only admin can execute this command");
            } else {
                this.runCommandSystem.runCommand(cmd);
            }

        }
    }


    private boolean deniedCommand(String cmd) {
        AtomicBoolean check = new AtomicBoolean(false);
        Arrays.asList("remove", "copy", "move", "del").forEach(s -> {
            if (s.trim().startsWith(cmd)) {
                check.set(true);
            }
        });

        return check.get();
    }


}
