package com.example.helloyou;
import java.util.Scanner;


public class Helloyou {
    public static void main(String[] args) {
        String input;
        System.out.println("Qui es-tu, étranger?");
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        String[] parts = input.split(" ");
        System.out.println("Gloire à "+input + ", Gloire à "+input + "!");
    }
}