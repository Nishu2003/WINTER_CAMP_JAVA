package first;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servelt1
 */
public class servelt1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servelt1() {
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
			//HttpSession session=request.getSession();
		ServletContext session =request.getServletContext();
		
			u.setName(request.getParameter("name"));
			session.setAttribute("user", u);
			out.print("Details : "+u.name);
			session.removeAttribute("user");
			
			
			session.setAttribute("user", "helooo");
			out.println(" hiiii   "+u.name);
			
			HttpSession a=request.getSession();
			a.invalidate();
			
	}


}
