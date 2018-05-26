package com.nce.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import com.nce.dao.LoginDao;
import com.nce.daoimpl.LoginDaoImpl;
import com.nce.model.User;

public class LoginAction {

	public void getLogin(HttpServletRequest request,
			HttpServletResponse response) {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		User user=new User();
		user.setName(name);
		user.setPassword(password);
		
		LoginDao dao=new LoginDaoImpl();
		boolean breast=dao.loginDaoImpl(user);
		if(breast){
			RequestDispatcher dispatcher=request.getRequestDispatcher("Home.jsp");
			try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			RequestDispatcher rk=request.getRequestDispatcher("index.jsp");
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
		
		
	}

	
}
