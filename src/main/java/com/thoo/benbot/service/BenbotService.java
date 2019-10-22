package com.thoo.benbot.service;

import com.google.gson.JsonObject;
import com.thoo.benbot.model.AesResponse;
import com.thoo.benbot.model.Cosmetic;
import com.thoo.benbot.model.StatusResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BenbotService {

    @GET("/api/cosmetics")
    Call<Cosmetic[]> getCosmetics();

    @GET("/api/cosmetics/search")
    Call<Cosmetic> getCosmeticByName(@Query("displayName") String name);

    @GET("/api/cosmetics/search")
    Call<Cosmetic> getCosmeticById(@Query("id") String name);

    @GET("/api/cosmetics/search/multiID")
    Call<Cosmetic[]> getMultipleCosmeticsById(@Query("id") String... value);

    @GET("/api/assetProperties")
    Call<JsonObject> getAssetProperties(@Query("file") String filePath);

    @GET("/api/aes")
    Call<AesResponse> getAES();

    @GET("/api/status")
    Call<StatusResponse> getStatus();

    @GET("/api/searchFile")
    Call<String[]> searchFile(@Query("q") String file);

}
