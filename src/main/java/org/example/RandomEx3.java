package org.example;

import java.util.Random;

public class RandomEx3 {
    public static void main(String[] args) {
        Random random=new Random();
        int x=random.nextInt(50);
        int y= random.nextInt(900);
        System.out.println("Randomly Generated integers value");
        System.out.println(x);
        System.out.println(y);
        double d=random.nextDouble();
        double dq=random.nextDouble();
        System.out.println("Randomly Generated doules value");
        System.out.println(d);
        System.out.println(dq);
        float f=random.nextFloat();
        float fq=random.nextFloat();
        System.out.println("Randomly Generate float value");
        System.out.println(f);
        System.out.println(fq);
        long l=random.nextLong();
        long lq=random.nextLong();
        System.out.println("Randomly Generate long value");
        System.out.println(l);
        System.out.println(lq);
        boolean b= random.nextBoolean();
        boolean bq = random.nextBoolean();
        System.out.println("Randomly Generate boolean value");
        System.out.println(b);
        System.out.println(bq);

    }
}
