package controller;

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
 * Servlet implementation class ProcesarLogin
 */
@WebServlet("/procesaLogin")
public class ProcesarLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String LOGIN = "usuario";
	private final String PASS= "pass";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesarLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestLogin = "";
		String requestPass = "";
		
		PrintWriter out = response.getWriter();
		
		requestLogin = request.getParameter("login");
		requestPass = request.getParameter("pass");
		
		if(!LOGIN.contentEquals(requestLogin) || !PASS.contentEquals(requestPass)) {
			   out.println("<script type=\"text/javascript\">");
			   out.println("alert('Usuario o password incorrecto');");
			   out.println("location='index.jsp';");
			   out.println("</script>");
		}else {
			// creamos la sesion si el usuario existe
			HttpSession sesionUsuario= request.getSession(true);
			sesionUsuario.setAttribute("Nombre", requestLogin);
			RequestDispatcher rd = request.getRequestDispatcher("valores.jsp"); 
			rd.forward(request, response); 
		}
	}

}
