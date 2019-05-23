package advanceJavaProgramming.jdbcApplicaction;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
public class JdbcExample 
{
	public static void main(String args[])
	{
		Connection con=null;
		Statement stmt=null;
		String qry="insert into DatabaseEmp.emp values(5,'arzan',98000)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Class Is Loaded...");
			
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Root@123");
			System.out.println("Connection Established With Database Server...");
			
			stmt=(Statement) con.createStatement();
			System.out.println("Plateform Created...");
			
			stmt.executeUpdate(qry);
			System.out.println("Data Inserted...");
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(stmt!=null)
			{
				try
				{
					stmt.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try
				{
					con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				System.out.println("Close All Costly Resources...");
			}
		}
	}
}
