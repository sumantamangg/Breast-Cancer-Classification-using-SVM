package com.nce.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nce.connection.Dbconnection;
import com.nce.dao.TrainDao;
import com.nce.model.Patient;

public class TrainDaoImpl implements TrainDao{
	int[][] z=new int[200][10];
	int i=0;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Connection con=null;
	//List<Patient> slist=null;
	public int[][] TraingDao(int x, int y) {
		// TODO Auto-generated method stub
		Patient pa=null;
		List<Patient> sList=null;
		sList=new ArrayList<Patient>();
	con=Dbconnection.getconnection();
	int a=x; int b=y;
	try {
		ps=con.prepareStatement("select * from patientdata where id>=1 and id<=175");
		rs=ps.executeQuery();
		
		while (rs.next()){
			pa=new Patient();
			pa.setCt(rs.getInt("ct"));
			pa.setUcsi(rs.getInt("ucsi"));
			pa.setUcsh(rs.getInt("ucsh"));
			pa.setMa(rs.getInt("ma"));
			pa.setSecs(rs.getInt("secs"));
			pa.setBn(rs.getInt("bn"));
			pa.setBc(rs.getInt("bc"));
			pa.setNn(rs.getInt("nn"));
			pa.setMitoses(rs.getInt("mitoses"));
			//int p=rs.getInt("mitoses");
			//System.out.print("mitoses= "+p);
			 
			int j=0;
			z[i][j]=rs.getInt("ct");
			j++;
			z[i][j]=rs.getInt("ucsi");
			j++;
			z[i][j]=rs.getInt("ucsh");
			j++;
			z[i][j]=rs.getInt("ma");
			j++;
			z[i][j]=rs.getInt("secs");
			j++;
			z[i][j]=rs.getInt("bn");
			j++;
			z[i][j]=rs.getInt("bc");
			j++;
			z[i][j]=rs.getInt("nn");
			j++;
			z[i][j]=rs.getInt("mitoses");
			j++; 
			z[i][j]=rs.getInt("class");
			i++;
			sList.add(pa);
			
		}
//		while(rs.next()){
//			  int i=0; 
//				int j=0;
//				z[i][j]=rs.getInt("ct");
//				j++;
//				z[i][j]=rs.getInt("ucsi");
//				j++;
//				z[i][j]=rs.getInt("ucsh");
//				j++;
//				z[i][j]=rs.getInt("ma");
//				j++;
//				z[i][j]=rs.getInt("secs");
//				j++;
//				z[i][j]=rs.getInt("bn");
//				j++;
//				z[i][j]=rs.getInt("bc");
//				j++;
//				z[i][j]=rs.getInt("nn");
//				j++;
//				z[i][j]=rs.getInt("mitoses");
//				j++; i++;
//			
//		}
		if(sList.size()>0){
//			for(int i=0; i<200; i++){
//				for (int j=0; j<9; j++){
//					System.out.println("the data are"+z[i][j]);
//				}
//			}
			return z;
		}
		
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}
	public void ccalculatebe(double b, double[] ress){
		int rs1=0;
		con=Dbconnection.getconnection();
		try {
			ps=con.prepareStatement("insert into databsewb (id,w1,w2,w3,w4,w5,w6,w7,w8,w9,b) values (1,?,?,?,?,?,?,?,?,?,?)");
		    ps.setDouble(1, ress[0]);
		    ps.setDouble(2, ress[1]);
		    ps.setDouble(3, ress[2]);
		    ps.setDouble(4, ress[3]);
		    ps.setDouble(5, ress[4]);
		    ps.setDouble(6, ress[5]);
		    ps.setDouble(7, ress[6]);
		    ps.setDouble(8, ress[7]);
		    ps.setDouble(9, ress[8]);
		    ps.setDouble(10, b);
			rs1=ps.executeUpdate();
		    if(rs1>0){
		    	System.out.println("databse is updated..");
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
