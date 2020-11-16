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
import fr.info.model.Categorie;
import fr.info.model.Produit;

/**
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/Product")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
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
			int idp = Integer.parseInt(request.getParameter("idP"));
			List<Produit> listProduits = remote.getListProduits(idp);
			System.out.println(listProduits);
			
			request.setAttribute("produit", listProduits);
			request.getRequestDispatcher("produit.jsp").forward(request, response);
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
