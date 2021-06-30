package com.company;

public class galaxy extends Sumsung{
    private String smartPhone;

    public galaxy(String corporation,  Hotels hotels, String smartPhone) {
        super(corporation,hotels);
        this.smartPhone = smartPhone;
    }

    public String getSmartPhone() {
        return smartPhone;
    }
    public String smartphoneInfo(String smartPhone){
        return "Название телефона: " + this.smartPhone;
    }
    public final String smartphoneInfo(int smartphoneNumber){
        return "Номер телефона: " + smartphoneNumber ;
    }


    public String getInfo() {
        return super.smartInfo() + "\nИгровая Консоль: " + smartPhone;
    }
}
