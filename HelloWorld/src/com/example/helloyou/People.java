package com.example.helloyou;

public class People{
    String nom;
    String prenom;
    public People(String input1){
        prenom = input1;
        nom = "Maître";
    }
    public People(String input1, String input2){
        nom = input2;
        prenom = input1;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
