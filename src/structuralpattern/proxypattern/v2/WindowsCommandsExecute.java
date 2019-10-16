package structuralpattern.proxypattern.v2;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class WindowsCommandsExecute implements RunCommandSystem {


    @Override
    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
