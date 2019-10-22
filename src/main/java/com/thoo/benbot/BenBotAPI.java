package com.thoo.benbot;

import com.google.gson.JsonObject;
import com.thoo.benbot.model.AesResponse;
import com.thoo.benbot.model.Cosmetic;
import com.thoo.benbot.model.StatusResponse;
import com.thoo.benbot.service.BenbotService;
import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class BenBotAPI {

    private BenbotService service;
    private Retrofit retrofit;

    public BenBotAPI() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://benbotfn.tk:8080")
                .addConverterFactory(GsonConverterFactory.create()).build();

        this.service = this.retrofit.create(BenbotService.class);
    }

    public Cosmetic[] getCosmetics() {
        Call<Cosmetic[]> call = this.service.getCosmetics();
        Response<Cosmetic[]> response = null;
        try {
            response = call.execute();
            return response.body();
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Cosmetic getCosmeticByName(String value){
        Call<Cosmetic> call = this.service.getCosmeticByName(value);
        Response<Cosmetic> response = null;
        try {
            response = call.execute();
            return response.body();
        } catch(Exception e){
            e.printStackTrace();
            return Cosmetic.empty();
        }
    }

    public Cosmetic getCosmeticById(String value){
        Call<Cosmetic> call = this.service.getCosmeticById(value);
        Response<Cosmetic> response = null;
        try {
            response = call.execute();
            return Cosmetic.empty();
        } catch(Exception e){
            e.printStackTrace();
            return Cosmetic.empty();
        }
    }

    public Cosmetic[] getMultipleCosmeticsById(String... ids) {
        Call<Cosmetic[]> call = this.service.getMultipleCosmeticsById(ids);
        Response<Cosmetic[]> response = null;
        try {
            response = call.execute();
            return response.body();
        } catch(Exception e){
            e.printStackTrace();
            return new Cosmetic[]{};
        }
    }

    public Cosmetic[] getMultipleCosmeticsByName(String... names) {
        Cosmetic[] cosmetics = getCosmetics();
        List<Cosmetic> cList = Arrays.stream(cosmetics).filter(c -> containsElement(c.displayName, names)).collect(Collectors.toList());
        cosmetics = cList.toArray(new Cosmetic[cList.size()]);
        cList.clear();
        return cosmetics;
    }

    public JsonObject getAssetProperties(String filePath) {
        Call<JsonObject> call = this.service.getAssetProperties(filePath);
        Response<JsonObject> response = null;
        try {
            response = call.execute();
            return response.body();
        } catch(Exception e){
            e.printStackTrace();
            return new JsonObject();
        }
    }

    public AesResponse getAES(){
        Call<AesResponse> call = this.service.getAES();
        Response<AesResponse> response = null;
        try {
            response = call.execute();
            return response.body();
        } catch(Exception e){
            e.printStackTrace();
            return AesResponse.empty();
        }
    }

    public StatusResponse getStatus(){
        Call<StatusResponse> call = this.service.getStatus();
        Response<StatusResponse> response = null;
        try {
            response = call.execute();
            return response.body();
        } catch(Exception e){
            e.printStackTrace();
            return StatusResponse.empty();
        }
    }

    private boolean containsElement(String element, String[] names){
        for (String id : names) {
            if(id.equalsIgnoreCase(element)){
                return true;
            }
        }
        return false;
    }

}
