package fr.info.sdweb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.info.ejb.accesCatalogueBeanRemote;
import fr.info.model.Produit;

/**
 * Servlet implementation class AjoutPanier
 */
@WebServlet("/AjoutPanier")
public class AjoutPanier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutPanier() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Produit> produits = new ArrayList<Produit>();
		response.getWriter().append("YES: ").append(request.getContextPath());
		
        
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
			
			HttpSession session = request.getSession(true);
			List<Produit> panier = (List<Produit>)session.getAttribute("MonPanier");
			int idp = Integer.parseInt(request.getParameter("idProd"));
			Produit produi= remote.getProduitbyID(idp);
			
			if (panier == null) {
				panier = new ArrayList<Produit>();
				session.setAttribute("MonPanier", panier);
				}
			
			if(panier.contains(produi))
			{
				System.out.println("Existe deja");
				
			}
			else
			{
				panier.add(produi);
				
				
			}
			
		
			
			System.out.println(panier);
			
			System.out.println(produi);
			
			
			request.setAttribute("panier", panier);
			request.getRequestDispatcher("panier.jsp").forward(request, response);
			
			
			
			
			
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
