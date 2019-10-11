package CreationalPattern.FactoryDesignPattern;


/**
 * @author Edmond-Kacaj
 * <p>
 * Lets take a example
 * we need to compress some file
 * but we need to compress in different type like
 * ZIP
 * TAR
 * RAR
 * <p>
 * we now Java is cross platform so work on Linux Mac , Windows
 * <p>
 * and if System is
 * <p>
 * Linux compress in TAR
 * Windows compress in ZIP
 * MAC compress in TAR
 * <p>
 * <p>
 * <p>
 * Here we create a interface which have a method doCompress
 */
public interface ICompressFile {

    void doCompress();


}
