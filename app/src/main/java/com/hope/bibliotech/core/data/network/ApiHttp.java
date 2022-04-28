package com.hope.bibliotech.core.data.network;

import com.hope.bibliotech.core.data.network.service.ApiService;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

public class ApiHttp {
	private static final String BASE_URL = "http://192.168.3.7";
	private static Retrofit retrofit;
	public static ApiService service(){
		if(retrofit == null){
			retrofit = new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.build();
		}
		return retrofit.create(ApiService.class);
	}
				
}