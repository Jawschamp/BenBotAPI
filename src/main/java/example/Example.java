package example;

import com.google.gson.JsonObject;
import com.thoo.benbot.BenBotAPI;
import com.thoo.benbot.model.Cosmetic;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        BenBotAPI benBotAPI = new BenBotAPI();

        String[] test = new String[2];
        test[0] = "Ikonik";
        test[1] = "Renegade raider";
        Cosmetic[] ok = benBotAPI.getMultipleCosmeticsByName(test);

        /*AesResponse aesResponse = benBotAPI.getAES();
        String mainKey = aesResponse.mainKey;
        Map<String, String> additionalKeys = aesResponse.additionalKeys; // Map<Pak, AES>

        StatusResponse statusResponse = benBotAPI.getStatus();
        String[] allPakFiles = statusResponse.allPakFiles;
        String[] mountedPaks = statusResponse.mountedPaks;
        Double currentVersionNumber = statusResponse.currentFortniteVersionNumber;
        Integer totalPakCount = statusResponse.totalPakCount;
        String currentFortniteVersion = statusResponse.currentFortniteVersion;
        Integer encryptedPakFileCount = statusResponse.encryptedPakFileCount;

        Cosmetic[] cosmetics = benBotAPI.getCosmetics();

        Cosmetic[] multipleCosmeticsById = benBotAPI.getMultipleCosmeticsById("ID1", "ID2", "ID3");

        Cosmetic[] multipleCosmeticsByName = benBotAPI.getMultipleCosmeticsByName("Ghoul Trooper", "Aura", "Black Knight", "Renegade Raider");

        Cosmetic cosmeticByName = benBotAPI.getCosmeticByName("Name");

        Cosmetic cosmeticById = benBotAPI.getCosmeticById("Id");

        // Exports an asset and downloads an exportable object, Image/PNG and Application/OGG.
        benBotAPI.exportAsset("FortniteGame/Content/Characters/Player/Female/Medium/Bodies/F_Med_Soldier_01/Skins/Zombie/Textures/T_F_MED_Soldier_01_Zombie_Body_D.uasset", "png");

        // Saves an asset, Compressed as zip file, Should return decompressed files next update.
        benBotAPI.saveAsset("FortniteGame/Content/Characters/Player/Female/Medium/Bodies/F_Med_Soldier_01/Skins/Zombie/Textures/T_F_MED_Soldier_01_Zombie_Body_D.uasset");

        String[] searchFile = benBotAPI.searchFiles("CID_001");

        JsonObject assetProperties = benBotAPI.getAssetProperties("File Path");*/
    }

}
