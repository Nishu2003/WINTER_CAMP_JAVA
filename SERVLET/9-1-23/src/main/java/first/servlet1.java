package first;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servlet1
 */
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();

	      String name=request.getParameter("name");
	      String pass =request.getParameter("pass");
	      
	      

    	  
	      if(name.equalsIgnoreCase("NISHU" ) && pass.contentEquals("123")) {
	    	  request.setAttribute("name", name);
	    	  RequestDispatcher rd = request.getRequestDispatcher("servlet2");
	            rd.forward(request, response);
	    	  //rd.include(request, response);
	    	  out.println("hello");
	      }
	      else {
	    	  //response.sendRedirect("index.html");
	    	  RequestDispatcher rd = request.getRequestDispatcher("index.html");
	    	  rd.include(request, response);
	    	  out.println("<br><br><br>");
	    	  out.println("<center>INVALID LOGIN CREDENTIALS!!</center>");
	    	  
	      }
	}


}
