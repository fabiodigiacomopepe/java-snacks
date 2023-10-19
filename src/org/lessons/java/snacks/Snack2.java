package org.lessons.java.snacks;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        // Generatore di “nomi cognomi” casuali:
        // il Grande Gatsby ha una lista di nomi e una lista di cognomi,
        // e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

        // Creo lista nomi e cognomi
        String[] nomi = {"Fabio", "Luca", "Mario", "Giorgio", "Carola", "Giulia", "Marco"};
        String[] cognomi = {"Rossi", "Ferrari", "Costa", "Esposito", "Bianchi", "Romano", "Gallo", "Fontana", "Ricci", "Bruno"};

        // Creo una variabile con una istanza di un generatore di numeri random
        Random randomGenerator = new Random();

        System.out.println("Lista invitati:");

        for (int i = 0; i < nomi.length; i++) {
            // Genero un numero random per il nome e uno per il cognome
            int randomNumber1 = randomGenerator.nextInt(0, nomi.length); // origin compreso, bound escluso
            int randomNumber2 = randomGenerator.nextInt(0, cognomi.length); // origin compreso, bound escluso

            // Stampo nome e cognome della persona invitata
            System.out.println("- " + nomi[randomNumber1] + " " + cognomi[randomNumber2]);
        }
    }
}
