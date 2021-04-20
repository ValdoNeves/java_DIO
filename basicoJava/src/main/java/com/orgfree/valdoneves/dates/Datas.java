package com.orgfree.valdoneves.dates;

import java.util.Calendar;
import java.util.Date;

public class Datas {

    public static void main(String[] args) {

        //tempo atual
        Long currentTimeMillis = System.currentTimeMillis();
        //tempo em um tipo de hash
        System.out.println(currentTimeMillis);;

        //data formata
        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);

        //data no passado
        Date dataNoPassado = new Date(1513124807691L);
        //data no futuro em relação ao dataNoPassado
        Date dataNoFuturo = new Date(1613124807691L);

        //verificando se a data no futuro é anterior a data no passado
        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        //a resposta deve ser false
        System.out.println(isAfter);

        //verificando se a data no futuro é depois da data no passado
        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        //a resposta deve ser true
        System.out.println(isBefore);

    }
}
