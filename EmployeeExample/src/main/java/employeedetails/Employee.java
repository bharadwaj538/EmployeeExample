package employeedetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee
 */
@WebServlet("/employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Employee() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//	response.setContentType("text/html");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		out.println("User Details");
		out.println(request.getParameter("initial"));
		out.println(request.getParameter("fn"));
		out.println(request.getParameter("ln"));
		out.print(request.getParameter("ct"));
		out.println(request.getParameter("state"));
		out.println(request.getParameter("email"));
		out.print(request.getParameter("mob"));
		String languages[]=request.getParameterValues("lk");
		for(String s:languages) {
			out.println(s);
		}
		Enumeration name=request.getParameterNames();
		while(name.hasMoreElements()) {
			out.println("value = "+request.getParameterNames());
		}
	}

}
