package org.example;

public class RandomNumEx2 {
    public static void main(String[] args) {
        int min =200;
        int max=400;
        System.out.println("Random value of type  double between"+min+"to"+max+":");
        double d=Math.random()*(max-min+1)+min;
        System.out.println(d);
        System.out.println("Random value of type integer"+min+"to"+max+":");
        int i=(int)(Math.random()*(max-min+1)+min);
        System.out.println(i);
    }
}
