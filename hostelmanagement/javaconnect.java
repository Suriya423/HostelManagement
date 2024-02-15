package hostelmanagement;
import java.sql.*;
public class javaconnect {
    public static Connection connectdb() throws SQLException
    {
        Connection con = null;
        try
        {
            con =DriverManager.getConnection("jdbc:derby://localhost:1527/projectmini","mini","mini");
            return con;
        }catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
