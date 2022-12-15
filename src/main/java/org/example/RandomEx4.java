package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class RandomEx4 {
    public static void main(String[] args) {
        int a= ThreadLocalRandom.current().nextInt();
        int b=ThreadLocalRandom.current().nextInt();
        System.out.println(a);
        System.out.println(b);
        double d=ThreadLocalRandom.current().nextDouble();
        double d1=ThreadLocalRandom.current().nextDouble();
        System.out.println(d);
        System.out.println(d1);
        float f=ThreadLocalRandom.current().nextFloat();
        float f1=ThreadLocalRandom.current().nextFloat();
        System.out.println(f);
        System.out.println(f1);
        boolean b1=ThreadLocalRandom.current().nextBoolean();
        boolean b2=ThreadLocalRandom.current().nextBoolean();
        System.out.println(b1);
        System.out.println(b2);
    }
}
