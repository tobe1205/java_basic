package com.kh.example.practice2.model.vo;

public class Product {

    public String pName;
    public int price;
    public String brand;


    public Product(String name, int nPrice, String nBrand) {

        pName = name;
        price = nPrice;
        brand = nBrand;
    }

    public void information() {

        System.out.printf("제품명: %s, 가격: %d, 브랜드: %s"
                , pName, price, brand);

    }
}

