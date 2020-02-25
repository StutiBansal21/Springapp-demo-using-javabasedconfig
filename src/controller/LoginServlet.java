package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final UserService service=new UserService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		/*
		 * PrintWriter out=response.getWriter(); out.print("<h1>");
		 * out.print("Welcome: "+userName+"<br>"); out.print(" Your Password: "+
		 * password); out.print("</h1>"); //we use jsp javaserverpage
		 */	
		
		User user =new User(userName,password);
		
		if(service.isUserExist(user)) {
			 request.getRequestDispatcher("homepage.jsp").forward(request,response);
		}
		else {
			request.setAttribute("errorMsg", "Incorrect userName/Password");
			  request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		/*
		 * if(this.userName.equals(userName)&&this.password.equals(password)) {
		 * request.getRequestDispatcher("homepage.jsp").forward(request,response);
		 * 
		 * } else { request.setAttribute("errorMsg", "Incorrect userName/Password");
		 * request.getRequestDispatcher("index.jsp").forward(request, response);; }
		 */
		//request.getRequestDispatcher("homepage.jsp").forward(request, response);
		}

}
