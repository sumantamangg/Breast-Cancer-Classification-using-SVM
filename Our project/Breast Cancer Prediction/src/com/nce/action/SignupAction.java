package com.nce.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nce.dao.LoginDao;
import com.nce.dao.SignupDao;
import com.nce.daoimpl.LoginDaoImpl;
import com.nce.daoimpl.SignupDaoImpl;
import com.nce.model.User;

public class SignupAction {

	public void getSignup(HttpServletRequest request,
			HttpServletResponse response) {
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		User us=new User();
		us.setName(name);
		us.setAddress(address);
		us.setPhone(phone);
		us.setEmail(email);
		us.setPassword(password);
		us.setGender(gender);
		SignupDao dao=new SignupDaoImpl();
		boolean status=dao.signupDaoImpl(us);
		if(status){
			request.setAttribute("msg", "Signup Successfully");
			RequestDispatcher rk=request.getRequestDispatcher("Diagnosis.jsp");
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
