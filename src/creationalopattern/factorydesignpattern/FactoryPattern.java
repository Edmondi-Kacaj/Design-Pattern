package creationalopattern.factorydesignpattern;

/**
 * Create the Enum because enum is Singleton , so we use Enum
 * Or we can Use SingletonPattern for That
 * Or we need to make Static Method getCompress
 * <p>
 * in  this method we make possibili to chese which type of compress we want
 *
 * @author Edmond-Kacaj
 */
public enum FactoryPattern {

    INSTANCE;

    public ICompressFile getCompress(CompressFactoryType compressFactoryType) {
        switch (compressFactoryType) {
            case ZIP:
                return new WindowsCompress();
            case RAR:
                return new LinuxCompress();
            case TAR:
                return new MacCompress();
            default:
                throw new IllegalArgumentException(" We support only ZIP,RAR,TAR ");
        }
    }

}
