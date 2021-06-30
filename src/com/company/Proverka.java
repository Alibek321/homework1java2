package com.company;

public class Proverka extends galaxy{
    private String developer;
    private String smartphoneName;

    public Proverka(String corporation,  Hotels hotels, String smartPhone , String developer, String smartphoneName) {
        super(corporation,  hotels, smartPhone);
        this.developer = developer;
        this.smartphoneName = smartphoneName;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getSmartphoneName() {
        return smartphoneName;
    }

    @Override
    public String smartphoneInfo(String smartPhone) {
        return super.smartphoneInfo(smartPhone) + ".";
    }

    @Override
    public String smartInfo() {
        return super.smartInfo() + "  Издатель смартфонов : " + developer + "\nНазвание смартфона : " + smartphoneName;
    }
}
