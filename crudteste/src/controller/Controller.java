package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Dao;
import model.JavaBeans;

@WebServlet(urlPatterns = {"/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Dao dao = new Dao();
       JavaBeans contato = new JavaBeans();
  
    public Controller() {
        super();
      
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.getWriter().append("served at:").append(request.getContextPath());
		
	dao.testeConexao();
	
	
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			contatos(request,response);	 
		}else if(action.equals("/insert")) {
			novoContato(request, response);
		}else {
			response.sendRedirect("index.html");
	
			
		}
		
		
}
	
	//Listar contatos
	protected void contatos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("agenda.jsp");
}
	//Adcionar contatos
		protected void novoContato(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //teste de recebimento dos dados de formulario

			//setar as variaveis javaBeans
			contato.setNome(request.getParameter("nome"));
			contato.setFone(request.getParameter("fone"));
			contato.setEmail(request.getParameter("email"));
		}
		
}

