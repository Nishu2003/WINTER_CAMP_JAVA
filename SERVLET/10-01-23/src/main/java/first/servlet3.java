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
 * Servlet implementation class servlet3
 */
public class servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet3() {
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
		/*user u=new user();
		String add=u.getAddress();
		
		
		add=request.getParameter("add");
		
		HttpSession session=request.getSession();
		session.setAttribute("address", add);
		
		RequestDispatcher r=request.getRequestDispatcher("display");
		r.forward(request,response);*/
		user u=new user();

		HttpSession session=request.getSession(false);
		
		if(session!=null) {
			u=(user) session.getAttribute("user");
			u.setAddress(request.getParameter("add"));
			session.setAttribute("user", u);
			//response.sendRedirect("display.html");
			
			out.println("Details : "+u.fname );
			out.println("Details : "+u.lname );
			out.println("Details : "+u.section );
			out.println("Details : "+u.uid );
			out.println("Details : "+u.address );
			out.println();
			out.println("Session id :"+session.getId());
			out.println("Session Creation time : "+session.getCreationTime());
			
		}
		
	}

}
