package com.orgfree.valdoneves.dates;

import java.util.Date;

public class Datas {

    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);;

        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);
    }
}
