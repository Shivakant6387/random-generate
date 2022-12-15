package org.example;

public class RandomEx {
    public static void main(String[] args) {
        int min=100;
        int max=200;
        System.out.println("Random value of type double between"+min+"to"+max+":");
        double d=Math.random()*(min-max-1)+min;
        System.out.println(d);
        int i=(int)Math.random()*(min-max-1)+min;
        System.out.println(i);
    }
}
