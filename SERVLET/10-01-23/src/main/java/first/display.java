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
 * Servlet implementation class display
 */
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public display() {
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
		HttpSession session=request.getSession(false);
		
		
		if(session!=null) {
			u=(user) session.getAttribute("user");

			u.setAddress(request.getParameter("address"));
			session.setAttribute("user", u);
			out.print("Details : "+u.fname);
			out.print("Session id :"+session.getId());
			out.print("Session Creation time : "+session.getCreationTime());
			
		}
	}

}
