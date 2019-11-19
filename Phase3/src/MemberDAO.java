
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1600:xe";
	public static final String USER_KNU ="knu";
	public static final String USER_PASSWD ="comp322";
	
	public Connection getConn() {
		
		Connection conn = null;
		
		
		try{
			
			conn = DriverManager.getConnection(URL, USER_KNU, USER_PASSWD); 
			conn.setAutoCommit(false); // auto-commit disabled  
			// Create a statement object
			
			}catch(SQLException ex) {
				System.err.println("Cannot get a connection: " + ex.getMessage());
				System.exit(1);
			}
		return conn;
	
	}
		
	public void Insert_member(Member m){
			
		Connection conn = null;
		PreparedStatement ps = null;
			
		try {		
				conn = getConn();
				int rs;
				
				
				String sql = "insert into account values(?,?,?,?,?,?,TO_DATE(?,'YYYY-MM-DD'),?,?,?)";
				
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, m.getId());
				ps.setString(2, m.getPwd());
				ps.setString(3, m.getTel());
				ps.setString(4, m.getFname());
				ps.setString(5, m.getLname());
				ps.setString(6, m.getSex());
				ps.setString(7, m.getBirth_D());
				ps.setString(8, m.getAddress());
				ps.setString(9, m.getJob());
				ps.setInt(10, m.getPermission());
				
				rs = ps.executeUpdate();
				
				conn.commit();
				
				if(rs>0) {
					System.out.println("Success");
				}
				else {
					System.out.println("Failed");
				}
				
			}catch(SQLException e) {
				System.out.println("sql error : "+e.getMessage());
				}
		}
	
	public int id_check(Member m) {
			
			Connection conn = null;
			PreparedStatement ps_check = null;
			int cnt=0;
			
			try {
			conn = getConn();
			ResultSet rs_check;
			
			String check = "select count(id) from account where id = ?";
			ps_check = conn.prepareStatement(check);
			
			ps_check.setString(1, m.getId());
			rs_check = ps_check.executeQuery();
			while(rs_check.next()) {
			cnt = rs_check.getInt(1);
			}
			
			}catch(SQLException e) {
				System.out.println("sql error: "+e.getMessage());
			}
			
		return cnt;
			
	}

	
}	
			
		
			
	
	

