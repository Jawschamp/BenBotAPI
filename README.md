# BenBotAPI
Benbot API wrapper for Java

```java
    public static void main(String[] args) {
        BenBotAPI benBotAPI = new BenBotAPI();

        AesResponse aesResponse = benBotAPI.getAES();
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

        JsonObject assetProperties = benBotAPI.getAssetProperties("File Path");
    }
```
