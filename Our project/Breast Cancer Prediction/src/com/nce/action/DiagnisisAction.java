package com.nce.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nce.daoimpl.DiagnosisDaoImpl;

public class DiagnisisAction {
	int[] x=new int[9];
    static double[] w=new double[9];
    static double b;
	public void diagnosisAction(HttpServletRequest request, HttpServletResponse response) {
		//String clump=request.getParameter("clump");
		//int i=0;

//		x[0]=Integer.parseInt(request.getParameter("clump"));
//		//String size=request.getParameter("size");
//		
//		//int yy=Integer.parseInt(size);
//		//System.out.println(yy);
//		x[1]=Integer.parseInt(request.getParameter("size"));
//		
//		//String shape=request.getParameter("shape");
//		x[2]=Integer.parseInt(request.getParameter("shape"));
//		
//		//String adhesion=request.getParameter("adhesion");
//		x[3]=Integer.parseInt(request.getParameter("adhesion"));
//		x[4]=Integer.parseInt(request.getParameter("epithelial"));
//		x[5]=Integer.parseInt(request.getParameter("bare"));
//		x[6]=Integer.parseInt(request.getParameter("bland"));
//		x[7]=Integer.parseInt(request.getParameter("nucleolic"));
//		x[8]=Integer.parseInt(request.getParameter("mitosis"));
		String clump=request.getParameter("clump");
		String size=request.getParameter("size");
		String shape=request.getParameter("shape");
		String adhesion=request.getParameter("adhesion");
		String epithelial=request.getParameter("epithelial");
		String bare=request.getParameter("bare");
		String bland=request.getParameter("bland");
		String nucleolic=request.getParameter("nucleolic");
		String mitosis=request.getParameter("mitoses");
		x[0]= Integer.parseInt(clump);
		x[1]= Integer.parseInt(size);
		x[2]= Integer.parseInt(shape);
		x[3]= Integer.parseInt(adhesion);
		x[4]= Integer.parseInt(epithelial);
		x[5]= Integer.parseInt(bare);
		x[6]= Integer.parseInt(bland);
		x[7]= Integer.parseInt(nucleolic);
		x[8]= Integer.parseInt(mitosis);
		for(int i=0;i<9;i++){
			System.out.println(x[i]);
		}
		DiagnosisDaoImpl obj=new DiagnosisDaoImpl();
		double [] temp=obj.getwb();
		b=temp[9];
//		for (int i1=0; i1<10; i1++){
//			if(i1<9){
//				w[i1]=temp[i1];
//			}
//			else{
//				b=temp[i1];
//			}
//		}
		
		double tmp=predictbc(x,b,temp);
		System.out.println("ans= "+tmp);
		if(tmp<0){
			request.setAttribute("msg", "the result is malignant");
		}
		else {
			request.setAttribute("msg", "the result is benign");
		}
		RequestDispatcher rk=request.getRequestDispatcher("showResult.jsp");
		try {
			rk.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private double predictbc(int[] x2, double b2, double[] w2) {
		// TODO Auto-generated method stub
		double result=0;
		result=(kernel(w2,x2)+b2);
		return result;
		
	}

	private double kernel(double[] w2, int[] x2) {
		// TODO Auto-generated method stub
		double rs=0;
		for (int i=0; i<9; i++){
			rs+=w2[i]*x2[i];
			//System.out.println("kernel= "+rs);
		}
		return rs;
	}

}
