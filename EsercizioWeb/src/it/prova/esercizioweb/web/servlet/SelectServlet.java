package it.prova.esercizioweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rispostaUtente = request.getParameter("numero");

		RequestDispatcher rd = null;

		if(rispostaUtente.equals("uno"))
			rd = request.getRequestDispatcher("numeroScelta.jsp");
		else 
			rd = request.getRequestDispatcher("numeroDue.jsp");
//		switch(rispostaUtente) {
//		  case "uno":
//			  rd = request.getRequestDispatcher("numeroScelta.jsp");
//		    break;
//		  case "due":
//			rd = request.getRequestDispatcher("index.jsp");
//			break;
//		}
		request.setAttribute("numero_scelto_attr", rispostaUtente);
		rd.forward(request, response);
	}

}
