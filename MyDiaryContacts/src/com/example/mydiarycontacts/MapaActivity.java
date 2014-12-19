package com.example.mydiarycontacts;

import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.mydiarycontacts.model.Contato;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaActivity extends FragmentActivity {
	//private static final LatLng PINHALZINHO = new LatLng(-26.849500, -52.987243);
	//private static final LatLng PINHALZINHO = new LatLng(-26.722713, -53.517202);
	
	private GoogleMap map;

	Contato contato = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mapa);

		map = ((SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map)).getMap();
				
		if (getIntent() != null) {
			contato = (Contato) getIntent().getSerializableExtra("contato");
		}
		
		LatLng localAtual;
		if (contato.getLatitude() != null && contato.getLongitude() != null) {
			localAtual = new LatLng(contato.getLatitude(), contato.getLongitude());			
		} else {
			Location location = getPosicaoAtual();
			localAtual = new LatLng(location.getLatitude(), location.getLongitude());		 
		}		
		
		//LatLng myLatLang = new LatLng(location.getLatitude(), location.getLongitude());
		
		Marker atual = map.addMarker(new MarkerOptions().position(localAtual).title("Localização Atual"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(localAtual, 15));
		
		map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
		
		
		map.setOnMapLongClickListener(new OnMapLongClickListener() {
			
			@Override
			public void onMapLongClick(LatLng point) {
				contato.setLatitude(point.latitude);
				contato.setLongitude(point.longitude);
				
				Intent itMapa = new Intent();
				itMapa.putExtra("contato", contato);
				
				setResult(RESULT_OK, itMapa);
				
				MapaActivity.this.finish();
				
			}
		});
		
		
		/*
		Marker pzo = map.addMarker(new MarkerOptions().position(PINHALZINHO)
				.title("PINHALZINHO"));

		//map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
		map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

		// Move the camera instantly to PINHALZINHO with a zoom of 15.
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(PINHALZINHO, 15));

		map.setOnMapLongClickListener(new OnMapLongClickListener() {
			@Override
			public void onMapLongClick(LatLng point) {
				Log.i("MAPA", point.latitude + " - " + point.longitude);
			}
		});

		*/
		/*
		AsyncTask<String, Void, Void> asyncGeoCode = new AsyncTask<String, Void, Void>() {
			BufferedReader in;

			@Override
			protected Void doInBackground(String... strings) {
				String url = "";
				if (strings.length > 0) {
					url = strings[0];
				} else {
					return null;
				}

				try {
					HttpClient httpClient = new DefaultHttpClient();// Client
					HttpGet getRequest = new HttpGet();

					getRequest.setURI(new URI(url));
					HttpResponse response = httpClient.execute(getRequest);

					in = new BufferedReader(new InputStreamReader(response
							.getEntity().getContent()));
					StringBuffer sb = new StringBuffer("");
					String line = "";
					String NL = System.getProperty("line.separator");
					while ((line = in.readLine()) != null) {
						sb.append(line + NL);
					}
					in.close();
					String page = sb.toString();
					JSONObject jsonObject = new JSONObject(page);
					JSONArray jsonArray = (JSONArray) jsonObject.get("results");
					if (jsonArray.length() > 0) {
						jsonObject = (JSONObject) jsonArray.get(0);
						System.out.println(jsonObject.get("formatted_address"));
					}
					System.out.println(page);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (in != null) {
						try {
							in.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				return null;
			}
		};
		*/

		//asyncGeoCode
		//		.execute("http://maps.googleapis.com/maps/api/geocode/json?latlng=-26.849500,-52.987243");
	}

	private Location getPosicaoAtual() {
		LocationManager lManger =
				(LocationManager) getSystemService(LOCATION_SERVICE);
		
		Location location = lManger.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
		return location;
	}
	
	

	
}