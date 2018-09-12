package volo;

import javax.naming.*;
import javax.sql.*;

public class pg {
	private static DataSource pg = null;
	private static Context cx = null;
	public static DataSource pgConn() throws Exception{
		if(pg!=null) {
			return pg;
		}
		try {
			if(cx==null) {
				cx = new InitialContext();
			}
			pg = (DataSource) cx.lookup("java:/comp/env/jdbc/postgres");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pg;
	}
}