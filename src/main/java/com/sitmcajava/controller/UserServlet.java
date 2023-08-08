package com.sitmcajava.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sitmcajava.daoimpl.UserDAOIMPL;
import com.sitmcajava.vo.ResultVO;
import com.sitmcajava.vo.UserVO;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	UserDAOIMPL daoimpl = new UserDAOIMPL();
	ResultVO rvo = new ResultVO();
	
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
			//Get the data from JSp\P
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String password = request.getParameter("password");
			String age = request.getParameter("age");
			
			UserVO uvo = new UserVO();
			uvo.setFname(name);
			uvo.setAddress(address);
			uvo.setEmail(email);
			uvo.setPhone(phone);
			uvo.setPwd(password);
			uvo.setAge(age);
			
			rvo = daoimpl.datainsert(uvo);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/next.jsp");
			rd.include(request,response);
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
