package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Empdao;
import dto.Empdto;

@WebServlet("/signup")
public class Signup extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String email = req.getParameter("email");
		String name = req.getParameter("name");
		String p1 = req.getParameter("psw");
		int p2 = Integer.parseInt(p1);
		
	
		Empdto ed = new Empdto();
		ed.setEmail(email);
		ed.setName(name);
		ed.setPsw(p2);
		
		Empdao eda = new Empdao();
		eda.create(ed);
		
	}

}
