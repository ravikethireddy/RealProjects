package h2test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.SortedMap;
import java.util.TreeMap;

public class H2db {
// local change comment from repo again from repo test learn local
	   // JDBC driver name and database URL 
	   static final String JDBC_DRIVER = "org.h2.Driver";   
	   static final String DB_URL = "jdbc:h2:~/test";  
	   
	   //  Database credentials 
	   static final String USER = "sa"; 
	   static final String PASS = ""; 
	public SortedMap<String, String> getData(){
			SortedMap<String, String> data = new TreeMap<>();
			 Connection conn = null; 
		      Statement stmt = null; 
		      try { 
		         // STEP 1: Register JDBC driver 
		         Class.forName(JDBC_DRIVER); 
		         
		         // STEP 2: Open a connection 
		         System.out.println("Connecting to database..."); 
		         conn = DriverManager.getConnection(DB_URL,USER,PASS);  
		         
		         // STEP 3: Execute a query 
		         System.out.println("Connected database successfully..."); 
		         stmt = conn.createStatement(); 
		         String sql = "SELECT id, question, answer FROM QUESTIONS"; 
		         ResultSet rs = stmt.executeQuery(sql); 
		         
		         // STEP 4: Extract data from result set 
		         while(rs.next()) { 
		            // Retrieve by column name 
		            int id  = rs.getInt("id"); 
		            String question = rs.getString("question"); 
		            String answer = rs.getString("answer");  
		            data.put(question, answer);
		         } 
		         // STEP 5: Clean-up environment 
		         rs.close(); 
		      } catch(SQLException se) { 
		         // Handle errors for JDBC 
		         se.printStackTrace(); 
		      } catch(Exception e) { 
		         // Handle errors for Class.forName 
		         e.printStackTrace(); 
		      } finally { 
		         // finally block used to close resources 
		         try { 
		            if(stmt!=null) stmt.close();  
		         } catch(SQLException se2) { 
		         } // nothing we can do 
		         try { 
		            if(conn!=null) conn.close(); 
		         } catch(SQLException se) { 
		            se.printStackTrace(); 
		         } // end finally try 
		      } // end try 
		      return data;
	}
	
	public void deleteAndInsertData(SortedMap<String, String> data) {
		Connection conn = null; 
	      Statement stmt = null; 
	      try { 
	         // STEP 1: Register JDBC driver 
	         Class.forName(JDBC_DRIVER);  
	         
	         // STEP 2: Open a connection 
	         System.out.println("Connecting to database..."); 
	         conn = DriverManager.getConnection(DB_URL,USER,PASS);  
	         
	         // STEP 3: Execute a query
	         System.out.println("Creating table in given database..."); 
	         stmt = conn.createStatement();  
	         String sql = "DELETE FROM QUESTIONS"; 
	         stmt.executeUpdate(sql);  
	         

		int i=0;
		for (SortedMap.Entry<String, String> entry : data.entrySet()) {
			i +=1;
			sql = "INSERT INTO QUESTIONS " + "VALUES ("+i+", '"+entry.getKey()+"', '"+entry.getValue()+"')";
			stmt.executeUpdate(sql);
		}	
		
		System.out.println("Inserted records into the table..."); 
        
        // STEP 4: Clean-up environment 
        stmt.close(); 
        conn.close(); 
     } catch(SQLException se) { 
        // Handle errors for JDBC 
        se.printStackTrace(); 
     } catch(Exception e) { 
        // Handle errors for Class.forName 
        e.printStackTrace(); 
     } finally { 
        // finally block used to close resources 
        try {
           if(stmt!=null) stmt.close();  
        } catch(SQLException se2) { 
        } // nothing we can do 
        try { 
           if(conn!=null) conn.close(); 
        } catch(SQLException se) { 
           se.printStackTrace(); 
        } // end finally try 
     } // end try 
     System.out.println("Goodbye!"); 
  } 
		
}	
	
