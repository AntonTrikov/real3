package real2;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.*;
import javax.sql.*;

public class pg {
	private static Connection pg = null;
	public static Connection pgConn() throws Exception{
		/*
		 URI dbUri = new URI(System.getenv("DATABASE_URL"));

	    String username = "postgres";
	    String password = "admin";
	    String dbUrl = "jdbc:postgresql://" + "localhost" + ':' + "5432" + "/db" + "?sslmode=require";
	
	    return DriverManager.getConnection(dbUrl, username, password);
		 */
		
		if(pg!=null) {
			return pg;
		}
		try {
			String username = "oeryzmbhtvwemk";
		    String password = "f441e2cf6334180ea612ccf742cc5f3a6e0a3e05c8fa652662a65223f5808b4a";
		    String dbUrl = "jdbc:postgresql://" + "ec2-54-217-214-201.eu-west-1.compute.amazonaws.com" + ":" + "5432" + "/de3pr3e5an1sol" + "?sslmode=require";
		
		    pg = DriverManager.getConnection(dbUrl, username, password);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pg;
	}
}
