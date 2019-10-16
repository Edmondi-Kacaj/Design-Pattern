package structuralpattern.facadepattern.ver1;

import structuralpattern.facadepattern.ver1.reports.*;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Facade Pattern is a structural pattern and is used when we have a complex system and we need for client
 * to make it easy, so we hide the complexity from client and give them a simple way to interact with system
 * so we create a class call Facade with a simplify code.
 */
public class ClientMainCLass {

    public static void main(String[] args) {

        // let's simulate client now
        // this time is without Facade

        // Mysql
        System.out.println("----------- Without Facade -----------------------");
        String connection = MysqlRaport.getMysqlConnection();
        MysqlRaport mysqlRaport = new MysqlRaport();
        mysqlRaport.generatePdf("User ", connection);

        // Oracle

        String oracleConnection = OracleRaport.getMysqlConnection();
        OracleRaport oracleRaport = new OracleRaport();
        oracleRaport.generateHtml(" Courses ", connection);

        //' now with facade the client don't know anything about how the system work
        // and is more easy to use

        System.out.println("----------- With Facade -----------------------");

        // Mysql
        GenerateRaportFacade.GenerateRapports(DBType.MYSQL, RaportType.PDF, "User");
        // Oracle
        GenerateRaportFacade.GenerateRapports(DBType.ORACLE, RaportType.HTML, "Course");

    }


}
