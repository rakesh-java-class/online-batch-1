package com.src.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AboutUs")
public class AboutUs extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AboutUs() {
        super();
        // TODO Auto-generated constructor stub
    }

	//WAR ssh scp 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String hi ="<h1>Hi</h1>";
		response.getWriter().append(hi);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
