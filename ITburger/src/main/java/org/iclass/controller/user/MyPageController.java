package org.iclass.controller.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iclass.controller.Controller;

// new RequestKeyValue("/join", "GET") 
public class MyPageController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//View 
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/user/modify.jsp");
		dispatcher.forward(request, response);

	}

}
