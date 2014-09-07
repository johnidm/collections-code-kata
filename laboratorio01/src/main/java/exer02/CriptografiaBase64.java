package exer02;

import java.io.IOException;

import java.util.Base64;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@SuppressWarnings("restriction")
public class CriptografiaBase64 implements Criptografia  {

	public String criptografar(String texto) {
				
		String encoded = new BASE64Encoder().encodeBuffer(texto.getBytes());
							
		return encoded.trim();
	}

	public String descriptografar(String texto) {
		
		
		byte[] decoded = null;
		
		try {
			decoded = new BASE64Decoder().decodeBuffer(texto);
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		
		return new String(decoded).trim();		
	}

}
