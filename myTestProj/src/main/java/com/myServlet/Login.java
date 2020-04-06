package com.myServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    /* (non-Javadoc)
    * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
    */
    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
    System.out.println("Login doPost...");
    String name = req.getParameter("user");
    String pwd = req.getParameter("password");
    String rememberMe = req.getParameter("rememberMe");
    System.out.println("User: "+name+" | password: "+pwd);
    if(name.equals("abhinav") && pwd.equals("passw0rd")) {
    HttpSession session=req.getSession();
    session.setAttribute("user", name);
    Cookie ck1 = new Cookie("user", name);
    Cookie ck2 = new Cookie("pwd", pwd);
    res.addCookie(ck1);
    res.addCookie(ck2);
    if(rememberMe!=null && rememberMe!=""){
      Cookie ck3 = new Cookie("rememberMe", rememberMe);
      res.addCookie(ck3);
    }
    }

    PrintWriter out= res.getWriter();
    out.write("Login successfull...");
    //Dispatching request
    RequestDispatcher rd=req.getRequestDispatcher("/HelloWorld.do");
    rd.forward(req, res);
    }

}
