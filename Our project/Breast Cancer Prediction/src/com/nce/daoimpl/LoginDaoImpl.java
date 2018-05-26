package com.nce.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nce.connection.Dbconnection;
import com.nce.dao.LoginDao;
import com.nce.model.User;

public class LoginDaoImpl implements LoginDao {
	PreparedStatement ps=null;
	ResultSet rs=null;
	Connection con=null;

	public boolean loginDaoImpl(User user) {
		con=Dbconnection.getconnection();
		try {
			ps=con.prepareStatement("select * from login where name=? and password=?");
			ps.setString(1, user.getName());
			ps.setString(2, user.getPassword());
			
			rs=ps.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		return false;
	}

}
