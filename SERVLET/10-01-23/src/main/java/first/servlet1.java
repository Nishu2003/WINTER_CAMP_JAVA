package first;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
		PrintWriter out=response.getWriter();
		user u=new user();

		HttpSession session=request.getSession();
		
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname")); 
			session.setAttribute("user", u);
			response.sendRedirect("second.html");
			
		/*String fname=u.getFname();
		String lname=u.getLname();
		
		fname=request.getParameter("fname");
		lname=request.getParameter("fname");
		
		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);
		
		
		RequestDispatcher r=request.getRequestDispatcher("second.html");
		r.forward(request,response);*/
		
	}
	
}
