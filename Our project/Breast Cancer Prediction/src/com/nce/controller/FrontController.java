package com.nce.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nce.action.DiagnisisAction;
import com.nce.action.LoginAction;
import com.nce.action.SignupAction;
import com.nce.action.TrainAction;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		if(uri.endsWith("Login.chi")){
			LoginAction action=new LoginAction();
			action.getLogin(request,response);
			
		}
		else if(uri.endsWith("signup.chi")){
			SignupAction action=new SignupAction();
			action.getSignup(request,response);
		}
		else if(uri.endsWith("train.chi")){
			TrainAction ta=new TrainAction();
			ta.getTrainAction(request, response);
			
		}
		else if(uri.endsWith("logout.chi")){
			request.getSession().invalidate();
			RequestDispatcher rk=request.getRequestDispatcher("index.jsp");
			rk.forward(request, response);
		}
		else if(uri.endsWith("diagnosis.chi")){
			DiagnisisAction action=new DiagnisisAction();
			action.diagnosisAction(request,response);
			
		}
		
	}

}
