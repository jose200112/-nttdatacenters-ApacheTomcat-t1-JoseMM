package com.nttdata.tomcat;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class NTTDataServlet
 */
@WebServlet("/NTTDataServlet")
public class NTTDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/** log **/
	private static Logger log = LoggerFactory.getLogger(NTTDataServlet.class);

    /**
     * Default constructor. 
     */
    public NTTDataServlet() {
    	//constructor del Servlet
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.getWriter().append("NTT Data | GET | PRIMER SERVLET OK");
		}catch(IOException e) {
			log.error("Ha habido un error: ", e.getCause());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
    		response.getWriter().append("NTT Data | POST | PRIMER SERVLET OK");
    	}catch(IOException e) {
    		log.error("Ha habido un error: ", e.getCause());
    		
    	}
    }

}
