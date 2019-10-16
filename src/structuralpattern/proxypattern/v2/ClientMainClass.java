package structuralpattern.proxypattern.v2;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Let's think we have a class which run command on system
 * and we want to create a client to call those commands , but we can't let client to call those commands.
 * because if client run command to delete hard-disk , can be fatal for our system ,
 * so we create a proxy class , in this class we call commands which we want to call from client
 * <p>
 * lets do it
 */
public class ClientMainClass {

    public static void main(String[] args) {
        RunCommandSystem runCommandSystem = new ProxyWindowsCommand("Edmond", "Med!@1.s");

        try {
            runCommandSystem.runCommand("remove");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
