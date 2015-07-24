package com.home.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.home.model.BeerExpert;

/**
 * Servlet implementation class BeerSelectServlet
 */
public class BeerSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeerSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String color = request.getParameter("color");
		response.setContentType("text/html");
	//	PrintWriter out = response.getWriter();
		BeerExpert beerExpert = new BeerExpert();
		List<String> beerList = beerExpert.getBeerBrands(color);
		request.setAttribute("styles", beerList);
		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
//		Iterator<String> itr = beerList.iterator();
//		
//		while(itr.hasNext()){
//			String beer = itr.next();
//			out.println("Try nothing ----> "+beer+"<br>");
//			
//		}
		
	}

}
