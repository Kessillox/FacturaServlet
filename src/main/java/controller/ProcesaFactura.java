package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ProcesaFactura
 */
@WebServlet("/factura")
public class ProcesaFactura extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesaFactura() {
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
		String nombre;
		String empresa;
		String rut;
		String direccion,ciudad,pais;
		
		int valorTotal;
		
		int precioValvulas =120000;
		int precioTurbo = 1700000;
		int precioFreno = 760000;
		int precioRefri = 2300000;
		int precioPlumas = 10000;
		
		Integer cantValvulas,cantTurbo,cantKitFreno,cantRefri,cantPlumillas;
		
		nombre  = request.getParameter("nombre");
		empresa = request.getParameter("empresa");
		rut     = request.getParameter("rut");
		direccion= request.getParameter("direccion");
		ciudad = request.getParameter("ciudad");
		pais = request.getParameter("pais"); 
		
		cantValvulas = Integer.parseInt(request.getParameter("valvulas"));
		cantTurbo = Integer.parseInt(request.getParameter("turbo"));
		cantKitFreno = Integer.parseInt(request.getParameter("frenos"));
		cantRefri = Integer.parseInt(request.getParameter("refri"));
		cantPlumillas = Integer.parseInt(request.getParameter("plumas"));
		
		request.setAttribute("nombre", nombre);
		request.setAttribute("empresa", empresa);
		request.setAttribute("rut", rut);
		request.setAttribute("direccion", direccion);
		request.setAttribute("ciudad", ciudad);
		request.setAttribute("pais", pais);
		
		request.setAttribute("cantValvulas",cantValvulas);
		request.setAttribute("cantTurbo",cantTurbo);
		request.setAttribute("cantKitFreno",cantKitFreno);
		request.setAttribute("cantRefri",cantRefri);
		request.setAttribute("cantPlumillas",cantPlumillas);
		
		request.setAttribute("precioTotalVal", cantValvulas * precioValvulas);
		request.setAttribute("precioTotalTurbo", cantTurbo * precioTurbo);
		request.setAttribute("precioTotalFreno", cantKitFreno * precioFreno);
		request.setAttribute("precioTotalRefri", cantRefri * precioRefri);
		request.setAttribute("precioTotalPlumas", cantPlumillas * precioPlumas);
		
		valorTotal = ((cantValvulas * precioValvulas)+
						(cantTurbo * precioTurbo)+
							(cantKitFreno * precioFreno)+
								(cantRefri * precioRefri)+
									(cantPlumillas * precioPlumas));
		
		request.setAttribute("valorTotal", valorTotal);
		
		
		
		
		request.getRequestDispatcher("/generaFactura").forward(request, response);
	}

}
