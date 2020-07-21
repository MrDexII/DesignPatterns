package GoFDesignPatterns.StructuralDesignPatterns.Facade.Example1DBConnection;

import java.sql.Connection;

public class FacadePatternTest {

    public static void main(String[] args) {
        String tableName = "Employee";

        //generate MySql HTML report and Oracle PDF report without using Facade
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getMyOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        //generate MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);
        HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, tableName);
    }
}
