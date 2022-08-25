package library.library_demo.resource;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import library.library_demo.model.Books;
import library.library_demo.service.PracticeService;

@WebServlet("/serice02")
public class PracticeResource02 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PracticeService practiceService = new PracticeService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id");
		Books book = new Books();
		book = practiceService.fetchId(id);
		
		
		request.setAttribute("book", book);
		RequestDispatcher rd = request.getRequestDispatcher("/practice02.jsp");
		rd.forward(request,response);

	}

	
}
