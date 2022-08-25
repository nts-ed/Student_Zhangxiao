package library.library_demo.resource;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import library.library_demo.model.Books;
import library.library_demo.service.PracticeService;

@WebServlet("/serice01")
public class PracticeResource01 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PracticeService practiceService = new PracticeService();
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Books> list = new ArrayList<Books>();
		list = practiceService.fetchAll(); 
		 request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("/practice01.jsp");
		rd.forward(request,response);
	}
	

}
