package GoFDesignPatterns.StructuralDesignPatterns.Facade.Example1DBConnection;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getMyOracleDBConnection(){
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }
    public void generateOracleHTMLReport(String tableName, Connection con){
        //get data from table and generate html report
    }
}