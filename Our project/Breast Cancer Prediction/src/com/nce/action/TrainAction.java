package com.nce.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nce.dao.TrainDao;
import com.nce.daoimpl.TrainDaoImpl;
import com.nce.model.Patient;

public class TrainAction {
   public void getTrainAction(HttpServletRequest request, HttpServletResponse responserequest){
	   String minid=request.getParameter("minid");
	   String maxid=request.getParameter("maxid");
	   
	   int mid=Integer.parseInt(minid);
	   int mxid=Integer.parseInt(maxid);
	   TrainDao td=new TrainDaoImpl();
	   int[][] sList=td.TraingDao(mid, mxid);
	   TrainSVM obj=new TrainSVM();
	   obj.enterSvm(sList);
	  // String data[]=sList.toArray(new String[sList.size()]);


//Patient[][] array = new Patient[sList.size()][9];
//
//	  for(int i=0;i<sList.size();i++){
//		  for(int j=0;j<9;j++){
//			  array[i][j]=sList.get(i);
//			  System.out.println(  array[i][j]);
//			
//			  
//		  }
//	   double[][] x=new double[200][9];
//		  for (int i=0; i<200; i++){
//			  for(int j=0;j<9; j++){
//				  if(j==0){
//					 
//				  }
//			  }
//		  }
	  
		   
	   
	   if(sList.length>0){
		   RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		   try {
			rd.forward(request, responserequest);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
   }
}
