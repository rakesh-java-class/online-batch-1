package com.src.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.factory.RegisterFactory;
import com.src.model.RegisterModel;
import com.src.service.RegisterService;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String regemail = request.getParameter("regemail");
		String regpassword = request.getParameter("regpassword");
		String regcpassword = request.getParameter("regcpassword");
		if(regpassword.equals(regcpassword)) {
			RegisterModel registerModel = new RegisterModel();
			registerModel.setEmail(regemail);
			registerModel.setPassword(regpassword);
			RegisterService regObj = RegisterFactory.getRegObj();
			try {
				regObj.insertUser(registerModel);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.setAttribute("message", "Successfully saved");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "password must be same as confirm password");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
