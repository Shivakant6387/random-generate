package org.example;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDemo {
    public static void main(String[] args) {

        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);
        double double_random = rand.nextDouble();
        float float_random = rand.nextFloat();


        System.out.println("Random integer value from 0 to" + (upperbound - 1) + " : " + int_random);
        System.out.println("Random float value between 0.0 and 1.0 : " + float_random);
        System.out.println("Random double value between 0.0 and 1.0 : " + double_random);


        int min = 50;
        int max = 100;
        //Generate random int value from 50 to 100
        System.out.println("Random value in int from " + min + " to " + max + ":");
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);



        // Generate random integers
        int int_random2 = ThreadLocalRandom.current().nextInt();


        // Print random integers
        System.out.println("Random Integers: " + int_random2);

        // Generate Random doubles
        double double_rand2 = ThreadLocalRandom.current().nextDouble();

        // Print random doubles
        System.out.println("Random Doubles: " + double_rand2);

        // Generate random booleans
        boolean boolean_rand2 = ThreadLocalRandom.current().nextBoolean();

        // Print random booleans
        System.out.println("Random Booleans: " + boolean_rand2);

        List<String> countryList = new ArrayList<>(Arrays.asList("India","Australia","USA","Japana","England","Scotland","Germany","France","Argentina","Brazil"));
        //using get method
        int randomInt=rand.nextInt(countryList.size());
        String randomElement=countryList.get(randomInt);
        System.out.println(randomElement);
        //using stream method
        String randomString=countryList.stream().sorted((o1,o2)->ThreadLocalRandom.current().nextInt(-1,2)).findAny().get();
        System.out.println(randomString);
        //using Math method
        String str= String.valueOf(countryList.stream().skip((int)(countryList.size()*Math.random())).findAny());
        System.out.println(str);
        //using stream or else
        Collections.shuffle(countryList);
        String letter=countryList.stream().findAny().orElse(null);
        System.out.println(letter);

    }

}
