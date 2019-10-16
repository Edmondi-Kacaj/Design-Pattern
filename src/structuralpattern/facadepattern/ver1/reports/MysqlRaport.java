package structuralpattern.facadepattern.ver1.reports;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * We need to make Possibly to create a rapport for a client For DB Mysql , and report can generate in Html,Pdf,Doc
 * Here we have method we want to call from client
 */
public class MysqlRaport {

    private static String CONNECTION_STRING = " mysql://localhostDB ";

    public MysqlRaport() {

    }


    public static String getMysqlConnection() {
        return CONNECTION_STRING;
    }


    public void generateHtml(String tableName, String connection) {
        System.out.println(
            String.format(" Table %s  for MySQL in HTML is  generated successfully  ", tableName));
    }


    public void generatePdf(String tableName, String connection) {
        System.out.println(
            String.format(" Table %s  for MySQL in PDF is  generated successfully  ", tableName));
    }


    public void generateDoc(String tableName, String connection) {
        System.out.println(
            String.format(" Table %s  for MySQL in DOC is  generated successfully  ", tableName));
    }
}
