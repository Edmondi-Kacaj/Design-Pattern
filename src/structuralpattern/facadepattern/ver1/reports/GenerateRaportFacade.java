package structuralpattern.facadepattern.ver1.reports;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class GenerateRaportFacade {

    private GenerateRaportFacade() {
        throw new IllegalStateException("Utility class");
    }

    public static void GenerateRapports(DBType dbType, RaportType raportType, String tableName) {
        String connection = null;
        switch (dbType) {
            case MYSQL: {
                connection = MysqlRaport.getMysqlConnection();
                MysqlRaport mysqlRapports = new MysqlRaport();
                switch (raportType) {
                    case DOC: {
                        mysqlRapports.generateDoc(tableName, connection);
                        break;
                    }
                    case PDF: {
                        mysqlRapports.generatePdf(tableName, connection);
                        break;
                    }
                    case HTML: {
                        mysqlRapports.generateHtml(tableName, connection);
                        break;
                    }
                    default:
                        throw new IllegalArgumentException(" We support only PDF,DOC,HTML");
                }
                break;
            }
            case ORACLE: {
                connection = OracleRaport.getMysqlConnection();
                OracleRaport oracleraports = new OracleRaport();
                switch (raportType) {
                    case DOC: {
                        oracleraports.generateDoc(tableName, connection);
                        break;
                    }
                    case PDF: {
                        oracleraports.generatePdf(tableName, connection);
                        break;
                    }
                    case HTML: {
                        oracleraports.generateHtml(tableName, connection);
                        break;
                    }
                    default:
                        throw new IllegalArgumentException(" We support only PDF,DOC,HTML");
                }
                break;
            }
            default:
                throw new IllegalArgumentException(" We support only MySql and Oracle ");
        }

    }



}
