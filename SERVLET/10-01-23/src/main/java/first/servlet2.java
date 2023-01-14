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
 * Servlet implementation class servlet2
 */
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet2() {
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
		String section=u.getSection();
		String uid=u.getUid();
		
		section=request.getParameter("section");
		uid=request.getParameter("UID");
		
		HttpSession session=request.getSession();
		session.setAttribute("section", section);
		session.setAttribute("UID", uid);
		
		RequestDispatcher r=request.getRequestDispatcher("third.html");
		r.forward(request,response);*/
		
		user u=new user();

		HttpSession session=request.getSession(false);
		
		if(session!=null) {
			u=(user) session.getAttribute("user");
			u.setSection(request.getParameter("section"));
			u.setUid(request.getParameter("UID"));
			session.setAttribute("user", u);
			response.sendRedirect("third.html");
			
		}
		
	}

}
