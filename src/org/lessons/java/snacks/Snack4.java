package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        // BONUS
        // Data in input una stringa verificare se è palindroma

        // Inizializzo lo scanner da tastiera
        Scanner scan = new Scanner(System.in);

        // Chiedo stringa da verificare a utente
        System.out.print("Inserisci una parola: ");
        String userWord = scan.nextLine();

        // Creo array di caratteri lungo quanto lunghezza della parola data in input
        char[] invertedChars = new char[userWord.length()];

        // Creo loop con 2 contatori: uno (i) che decrementa e uno (j) che incrementa
        // i lo uso per la parola data in input (parte dalla fine verso l'inizio della parola)
        // j lo uso per popolare array (parte dall'elemento iesimo 0 fino alla fine dell'array)
        for (int i = userWord.length() - 1, j = 0; i >= 0 && j < userWord.length(); i--, j++) {
            invertedChars[j] = userWord.charAt(i);
        }

        // Salvo in invertedString il risultato dell'array invertedChars
        String invertedString = String.valueOf(invertedChars);

        // Se la parola inserita dall'utente è uguale al risultato della parola invertita
        if (userWord.equals(invertedString)){
            System.out.println("La parola è palindroma");
        } // Altrimenti (se non è uguale)
        else {
            System.out.println("La parola NON è palindroma");
        }

        // Chiudo lo scanner da tastiera
        scan.close();
    }
}
