package structuralpattern.facadepattern.ver1.reports;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * We need to make Possibly to create a rapport for a client For DB Oracle , and report can generate in Html,Pdf,Doc
 * Here we have method we want to call from client
 */
public class OracleRaport {

    private static String CONNECTION_STRING = " mysql://localhostDB ";

    public OracleRaport() {
    }


    public static String getMysqlConnection() {
        return CONNECTION_STRING;
    }


    public void generateHtml(String tableName, String connection) {
        System.out.println(
            String.format(" Table %s  for Oracle in HTML is  generated successfully  ", tableName));
    }


    public void generatePdf(String tableName, String connection) {
        System.out.println(
            String.format(" Table %s  for Oracle in PDF is  generated successfully  ", tableName));
    }


    public void generateDoc(String tableName, String connection) {
        System.out.println(
            String.format(" Table %s  for Oracle in DOC is  generated successfully  ", tableName));
    }
}
