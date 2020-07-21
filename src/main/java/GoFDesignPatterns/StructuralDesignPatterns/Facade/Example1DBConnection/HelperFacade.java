package GoFDesignPatterns.StructuralDesignPatterns.Facade.Example1DBConnection;

import java.sql.Connection;

public class HelperFacade {
    public static void generateReport(DBTypes dbType, ReportTypes reportTypes, String tableName) {
        Connection con;
        switch (dbType) {
            case MYSQL:
                con = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportTypes) {
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(tableName, con);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, con);
                        break;
                }
                break;
            case ORACLE:
                con = OracleHelper.getMyOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportTypes) {
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, con);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, con);
                        break;
                }
                break;
        }
    }
}
