package com.nce.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	 private static Connection con=null;
	    static {
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }
	        }
	    public static Connection getconnection(){
	        try{
	            con=DriverManager.getConnection("jdbc:mysql://localhost/breastcancer","root","");
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        return con;
	    }

}
