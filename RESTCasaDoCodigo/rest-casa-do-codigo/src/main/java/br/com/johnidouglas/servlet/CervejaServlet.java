package br.com.johnidouglas.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLStreamWriter;

import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamWriter;

import br.com.johnidouglas.model.Cerveja;
import br.com.johnidouglas.model.Estoque;
import br.com.johnidouglas.rest.Cervejas;

@WebServlet("/cervejas")
public class CervejaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	private Estoque estoque = new Estoque();
	
	private static JAXBContext context;
	
	
	static {
		try {
			context = JAXBContext.newInstance(Cervejas.class);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
		
	}

    public CervejaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		PrintWriter out = response.getWriter();		
		Collection<Cerveja> cervejas = estoque.listarCervejas();		
		cervejas.forEach( c -> out.print(c) ) ;
		*/
		
		String requestUri = request.getRequestURI();
		
		
		
		
		String acceptHeader = request.getHeader("Accept");					
		
			
		if (acceptHeader.contains("application/xml")) {
			escreveXML(request, response);				
		} else if (acceptHeader.contains("application/json")) {
			escreveJSON(request, response);
		} else {
			response.sendError(415); 
		}									
		
		
	}

	private void escreveJSON(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		Cervejas cervejas = new Cervejas();		
		cervejas.setCervejas( new ArrayList<Cerveja>( estoque.listarCervejas() ) );
		
		try {
			response.setContentType("application/json;charset=UTF-8");
			
			MappedNamespaceConvention con = new MappedNamespaceConvention(); 
			
			XMLStreamWriter xmlStreamWriter = new MappedXMLStreamWriter(con, response.getWriter());
					
			
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(cervejas, xmlStreamWriter);			
			
			
		} catch (JAXBException e) {						
			response.sendError(500, e.getMessage());
		}	
		
	}

	private void escreveXML(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		Cervejas cervejas = new Cervejas();		
		cervejas.setCervejas( new ArrayList<Cerveja>( estoque.listarCervejas() ) );
		
		try {
			response.setContentType("application/xml;charset=UTF-8");
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(cervejas, response.getWriter());			
		} catch (JAXBException e) {						
			response.sendError(500, e.getMessage());
		}		
		
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
