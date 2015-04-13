package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HauntedServlet
 */
@WebServlet("/HauntedServlet")
public class HauntedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HauntedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String customers = request.getParameter("customers");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String race = request.getParameter("race");
		String sex = request.getParameter("sex");
		String interests = request.getParameter("interests");
		String foods = request.getParameter("foods");
		String animals = request.getParameter("animals");
		String comments = request.getParameter("comments");
		
		
		out.print("<html><body>");
		out.print("<h1>Post served at: " + request.getServletPath() + "</h1>");
		
		out.println(customers + "<br/>");
		out.println(address + "<br/>");
		out.println(city + "<br/>");
		out.println(state + "<br/>");
		out.println(zip + "<br/>");
		out.println(phone + "<br/>");
		out.println(email + "<br/>");
		out.println(race + "<br/>");
		out.println(sex + "<br/>");
		out.println(interests + "<br/>");
		out.println(foods + "<br/>");
		out.println(animals + "<br/>");
		out.println(comments + "<br/>");
		
		out.print("</body></html>");
	}

}
