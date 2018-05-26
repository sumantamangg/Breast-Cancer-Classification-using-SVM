package com.nce.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nce.connection.Dbconnection;

public class DiagnosisDaoImpl {

	PreparedStatement ps=null;
	ResultSet rs=null;
	Connection con=null;
	double[] w=new double[10];
	public double[] getwb() {
		// TODO Auto-generated method stub
		con=Dbconnection.getconnection();
		try {
			ps=con.prepareStatement("select * from databsewb where id=5");
			rs=ps.executeQuery();
			while(rs.next()){
				w[0]=rs.getDouble("w1");
				w[1]=rs.getDouble("w2");
				w[2]=rs.getDouble("w3");
				w[3]=rs.getDouble("w4");
				w[4]=rs.getDouble("w5");
				w[5]=rs.getDouble("w6");
				w[6]=rs.getDouble("w7");
				w[7]=rs.getDouble("w8");
				w[8]=rs.getDouble("w9");
				w[9]=rs.getDouble("b");
			}
			for(int i=0; i<10;i++){
				System.out.println(w[i]);
			}
			return w;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	
	
}
