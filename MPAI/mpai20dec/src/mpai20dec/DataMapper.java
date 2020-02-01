package mpai20dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataMapper {
	private static String url = "jdbc:derby://localhost:1527/mpai;";
	private static String tabAngajati = "Angajat";
	private Connection conn = null;
	private Statement stmt = null;
	
	public DataMapper() {
		this.createConnection();
	}
	
	public void createConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			//Get a connection
			conn = DriverManager.getConnection(url);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void insertAngajat(Angajat angajat)
    {
        try
        {
            stmt = conn.createStatement();
            int id = stmt.executeUpdate("insert into " + tabAngajati + "(nume, salariu) values ('" + angajat.name + "'," + angajat.salary +")");
            angajat.setId(id);
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
    public ArrayList<Angajat> selectAngajati()
    {
        try
        {
        	ArrayList<Angajat> query = new ArrayList<Angajat>();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select * from " + tabAngajati);
            ResultSetMetaData rsmd = results.getMetaData();
            int numberCols = rsmd.getColumnCount();
            for (int i=1; i<=numberCols; i++)
            {
                //print Column Names
                System.out.print(rsmd.getColumnLabel(i)+"\t\t");  
            }

            System.out.println("\n-------------------------------------------------");

            while(results.next())
            {
                int id = results.getInt(1);
                String name = results.getString(2);
                int salary = results.getInt(3);
                Angajat angajat = new Angajat(id, name, salary);
                query.add(angajat);
                System.out.println(id + "\t\t" + name + "\t\t" + salary);
            }
            results.close();
            stmt.close();
            return query;
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
            return null;
        }
    }
    
    public boolean deleteAngajat(int id) {
    	try {
    		stmt = conn.createStatement();
            stmt.executeUpdate("delete from " + tabAngajati + " where (id=" + id + ")");
            stmt.close();
            return true;
    	}
    	catch(SQLException sqle) {
    		sqle.printStackTrace();
    		return false;
    	}
    }
    
    public ArrayList<Angajat> selectAngajatiByCondition(String getQuery)
    {
        try
        {
        	ArrayList<Angajat> query = new ArrayList<Angajat>();
            stmt = conn.createStatement();
            String queryString = "select * from " + tabAngajati;
            if(getQuery != null)
            	queryString += getQuery;
            ResultSet results = stmt.executeQuery(queryString);
            ResultSetMetaData rsmd = results.getMetaData();
            int numberCols = rsmd.getColumnCount();
            for (int i=1; i<=numberCols; i++)
            {
                //print Column Names
                System.out.print(rsmd.getColumnLabel(i)+"\t\t");  
            }

            System.out.println("\n-------------------------------------------------");

            while(results.next())
            {
                int id = results.getInt(1);
                String name = results.getString(2);
                int salary = results.getInt(3);
                Angajat angajat = new Angajat(id, name, salary);
                query.add(angajat);
                System.out.println(id + "\t\t" + name + "\t\t" + salary);
            }
            results.close();
            stmt.close();
            return query;
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
            return null;
        }
    }
}
