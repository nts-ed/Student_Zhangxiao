package susi.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import susi.model.Order;
import susi.model.OrderLogic;

@WebServlet("/orderMain")
public class OrderMain extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath="/form.jsp";
		String action = request.getParameter("action");
		HttpSession session = request.getSession();
		Order order = (Order) session.getAttribute("order");
		if (action == null) {
			order = new Order();
		}else if(action.equals("back")) {
			forwardPath="/form.jsp";
		}else {
			OrderLogic logic=new OrderLogic();
			logic.execute(order);
			forwardPath="/result.jsp";
		}
		session.setAttribute("order", order);
		request.getRequestDispatcher(forwardPath).forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] counts = request.getParameterValues("counts");
		HttpSession session = request.getSession();
		Order order = (Order) session.getAttribute("order");
		order.setCounts(counts);
		session.setAttribute("order", order);
		request.getRequestDispatcher("/confirm.jsp").forward(request, response);
	}

}
