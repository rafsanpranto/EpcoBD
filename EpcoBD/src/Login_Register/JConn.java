
package Login_Register;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JConn {
    
    private static final String servername = "localhost";
    private static final String username = "root";
    private static final String dbname = "epcobd";
    private static final int portnumber = 3306;
    private static final String password = "";
    
    public static Connection getConnection()
    {
        Connection conn = null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            conn = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + JConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
    
}
