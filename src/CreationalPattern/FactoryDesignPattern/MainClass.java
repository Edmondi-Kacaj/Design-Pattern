package CreationalPattern.FactoryDesignPattern;

public class MainClass {

    public static void main(String[] args) {

        // here we call the class in base of Imput
        ICompressFile iCompressFile = FactoryPattern.INSTANCE.getCompress(CompressFactoryType.ZIP);
        iCompressFile.doCompress();


    }

}
