package com.thoo.benbot.model;

import java.util.Map;

public class Cosmetic {

    public String displayName;
    public String backendType;
    public String icon;
    public String description;
    public String[] gameplay_tags;
    public Map<String, Variant[]> variants;
    public String id;
    public String type;
    public String rarity;

    public static Cosmetic empty() {
        return new Cosmetic();
    }

}
