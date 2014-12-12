package com.example.mydiarycontacts.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class CrazyHTTPRequest {
	
	public static final String request(String url) throws ExCrazyHTTPRequest {
		CrazyHTTPRequest crazy = new CrazyHTTPRequest ();
		return crazy.execute(url);		
	}

	private HttpResponse call(String url) throws ClientProtocolException,
			IOException {

		HttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);

		return httpClient.execute(httpGet);
	}

	private void check(HttpResponse response) throws ExCrazyHTTPRequest {

		StatusLine status = response.getStatusLine();
		int code = status.getStatusCode();
		if (code != HttpStatus.SC_OK)
			throw new ExCrazyHTTPRequest("Fail request - Return code " + code);

	}

	private String body(HttpResponse response) throws IllegalStateException, IOException {

		StringBuilder stringBuilder = new StringBuilder();
		
		HttpEntity entity = response.getEntity();
		InputStream inputStream = entity.getContent();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				inputStream));
		String line;
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
		}
		inputStream.close();

		return stringBuilder.toString();
	}

	public String execute(String url) throws ExCrazyHTTPRequest {				
        try {
        	
            HttpResponse response = call(url);                       
            check(response);               
            return body(response);
            
        } catch (Exception e) {
        	throw new ExCrazyHTTPRequest("Exception in execute CrazyHTTPRequest(Error : " + e.getMessage() );            
        }        
        
	}
}
