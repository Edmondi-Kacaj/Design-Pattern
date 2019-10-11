package CreationalPattern.FactoryDesignPattern;


/**
 * Here is the Business Logic for Windows
 * but this is just a example and i just print a meesage
 *
 * @author Edmond-Kacaj
 */
public class WindowsCompress implements ICompressFile {

    @Override public void doCompress() {
        System.out.println(" This is a Windows and file are compresed in ZIP ...... ");
    }

}
