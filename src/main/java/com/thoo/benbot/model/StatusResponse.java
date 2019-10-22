package com.thoo.benbot.model;

public class StatusResponse {

    public String[] allPakFiles;
    public String[] mountedPaks;
    public double currentFortniteVersionNumber;
    public int totalPakCount;
    public String currentFortniteVersion;
    public int encryptedPakFileCount;

    public static StatusResponse empty() {
        return new StatusResponse();
    }

}
