package com.ead.posestacio.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession sessao = request.getSession();
		
		String usuario = (String) sessao.getAttribute("user");
		if(usuario == null) {
			out.println("Nenhum usuário autenticado!<br>");
			out.println("<a href='login.html'> Voltar para Login</a>");
		} else {
			out.println("Seja Bem Vindo(a),<br> " + usuario);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		if(usuario.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("user", usuario);
			out.println("Usuário validado!");
		} else {
			out.println("Usuário invalidado!");
		}		
		
	}

}
