package org.example;

public class Main {

    public static void main(String[] args) {
        String s1 = "Poka";
        String s2 = "PriVEt";
        String s3 = "Privet";
        System.out.println(StringHelper.equalsIgnoreCase(s1,s2));
        System.out.println(StringHelper.equalsIgnoreCase(s2,s3));
        System.out.println(StringHelper.split(s2,'i'));
        System.out.println(StringHelper.toUpperCase(s1));
        System.out.println(StringHelper.toLowerCase(s2));
        System.out.println(StringHelper.replace(s1, 'o', 'a'));
        System.out.println(StringHelper.join(s1, s2));
        System.out.println(StringHelper.format("В классе учится %d детей", 5));
    }
}
