package fr.info.sdweb;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.info.ejb.accesCatalogueBeanRemote;
import fr.info.model.Client;
import fr.info.model.Produit;

/**
 * Servlet implementation class ValiderCommande
 */
@WebServlet("/ValiderCommande")
public class ValiderCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValiderCommande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		response.getWriter().append("PRODUUUUUUUUUUUUUUUUUCT ").append(request.getContextPath());
		
	
		
		try{
			final Hashtable jndiProperties = new Hashtable();
			jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			final Context context = new InitialContext(jndiProperties);
			final String appName = "EARProjectCatalogue";
			final String moduleName = "GestionCommandesEJB";
			final String beanName = "HelloJNDI";
			final String viewClassName = accesCatalogueBeanRemote.class.getName();
			accesCatalogueBeanRemote remote = (accesCatalogueBeanRemote) context.lookup("ejb:"+appName+"/"+moduleName+"/"+
			beanName+"!"+viewClassName);
			
			String login = request.getParameter("login");
			String result= remote.getClientbyLogin(login);
			if(result.equals("unregistered")) 
			{
				response.sendRedirect("inscription.jsp");
			}
			else 
			{
				response.sendRedirect("validerCommande.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
