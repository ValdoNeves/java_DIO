package com.orgfree.valdoneves.tipos.primitivos;

public class Primitivos {
    public static void main(String[] args) {
        //inteiros

        //byte nullByte = null; //não aceitam null

        //8 bits
        byte b;
        byte b1 = 127;
        byte b2 = -128;
        //byte b3 = 128;//só aceita valores entre 127 e -128

        //16 bits
        char c;
        char c1 = 'A';
        char c2 = 15;
        //char c3 = 'AA'; // apenas 1 caracter por vez
        //char c4 = -100;

        //16 bits
        short s;
        short s1 = 32767;
        short s2= -32768;

        //32 bits
        int i = 2147483647;
        int i2 = -2147483648;

        //64 bits
        long l = 9223372036854775807L;
        long l2 = -9223372036854775808L;

        //flutuantes
        //32 bits
        float f = 65f;      //3.402,823,5 E+38
        float f2 = 65.0f;
        float f3 = -0.5f;   //1.4 E-45

        double d = 1024.99;  //64 bits 1.797,693,134,862,315,7 E+308
        double d2 = 10.2456; //4.9 E-324

        //boleano

        boolean bo = true;
        boolean bo2 = false;
        boolean bo3 = true;


    }
}
