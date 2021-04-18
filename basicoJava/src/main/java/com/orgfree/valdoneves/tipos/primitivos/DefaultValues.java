package com.orgfree.valdoneves.tipos.primitivos;

public class DefaultValues {
    public static void main(String[] args) {

        final Default d = new Default();
        System.out.println(d.getI());
        System.out.println(d.isActive());
//        apenas do java 10 para frente
        var txt = "Aula de Java";
        System.out.println(txt.split(" "));


    }
}

class Default{
    int i;
    boolean active;

    public boolean isActive() {return active; }

    public int getI() {return i; }
}