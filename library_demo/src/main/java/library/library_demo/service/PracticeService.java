package library.library_demo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import library.library_demo.model.Books;


public class PracticeService {
	Connection conn; 
	
	public PracticeService() {		
		String url = "jdbc:mysql://localhost/dev1";
		String uname = "root";
		String password = "Ipszhangxiao1";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn =DriverManager.getConnection(url,uname,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Books> fetchAll(){
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<Books> list = new ArrayList<Books>();
		String sql = "select * from books";
		
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				Books book = new Books();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setAutor(rs.getString("autor"));
				book.setPrices(rs.getInt("price"));
				book.setComment(rs.getString("comment"));
				list.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pst != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		return list;
	}
	public Books fetchId(String id) {
		Books book = new Books();
		String sql = "select * from books where id = ?";
		PreparedStatement pst= null;
		ResultSet rs = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			while(rs.next()) {
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setAutor(rs.getString("autor"));
				book.setPrices(rs.getInt("price"));
				book.setComment(rs.getString("comment"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}
}
