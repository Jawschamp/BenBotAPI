package com.thoo.benbot.model;

import java.util.Map;

public class AesResponse {

    // Key: Pak
    // Value: AES Key
    public Map<String, String> additionalKeys;
    public String mainKey;

    public static AesResponse empty() {
        return new AesResponse();
    }

}
