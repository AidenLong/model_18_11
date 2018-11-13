package com.me.prototype;

public class Client {

    public static void main(String[] args) {
//        BusinessCard businessCard = new BusinessCard();
//        businessCard.setName("钱三");
//        businessCard.setCompany("阿里");
//
//        BusinessCard cloneCard1 = businessCard.clone();
//        cloneCard1.setName("赵四");
//        cloneCard1.setCompany("百度");
//
//        BusinessCard cloneCard2 = businessCard.clone();
//        cloneCard2.setName("孙五");
//        cloneCard2.setCompany("腾讯");
//
//        businessCard.show();
//        cloneCard1.show();
//        cloneCard2.show();


        DeepBusinessCard businessCard = new DeepBusinessCard();
        businessCard.setName("钱三");
        businessCard.setCompany("阿里", "北京望京");

        DeepBusinessCard cloneCard1 = businessCard.clone();
        cloneCard1.setName("赵四");
        cloneCard1.setCompany("百度", "北京西二旗");

        DeepBusinessCard cloneCard2 = businessCard.clone();
//        cloneCard2.setName("孙五");
//        cloneCard2.setCompany("腾讯","北京中关村");

        businessCard.show();
        cloneCard1.show();
        cloneCard2.show();
    }
}
