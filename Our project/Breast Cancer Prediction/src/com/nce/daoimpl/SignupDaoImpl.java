package com.nce.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nce.connection.Dbconnection;
import com.nce.dao.SignupDao;
import com.nce.model.User;

public class SignupDaoImpl implements SignupDao {
	PreparedStatement ps=null;
	int rs=0;
	Connection con=null;

	public boolean signupDaoImpl(User us) {
		con=Dbconnection.getconnection();
		try {
			ps=con.prepareStatement("insert into signup(name,address,phone,email,password,gender) values(?,?,?,?,?,?)");
			ps.setString(1, us.getName());
			ps.setString(2, us.getAddress());
			ps.setString(3, us.getPhone());
			ps.setString(4, us.getEmail());
			ps.setString(5, us.getPassword());
			ps.setString(6, us.getGender());
			rs=ps.executeUpdate();
			if(rs>=0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
