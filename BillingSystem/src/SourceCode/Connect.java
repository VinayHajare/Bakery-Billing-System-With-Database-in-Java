package SourceCode;

import java.sql.*;

/**
 *
 * @author Vinay Hajare
 */ 
public class Connect {
    public static Connection dbConnection() throws Exception
            {
              Connection con;
              Class.forName("com.mysql.jdbc.Driver");
              //connection url, username & password
              String url = "jdbc:mysql://localhost:3306/bakery";
              String user = "root";
              String password = "system";
              //establishing connection
              con = (Connection) DriverManager.getConnection(url,user,password);
              return con;
            }
}
