package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        // Continua a chiedere all’utente di inserire un numero,
        // se è pari stampa il numero, se è dispari stampa il numero successivo.
        // Se il numero è negativo termina.

        // Inizializzo lo scanner da tastiera
        Scanner scan = new Scanner(System.in);

        // Inizializzo stop uguale a false
        boolean stop = false;

        // Creo loop
        while (!stop) {
            // Chiedo numero
            System.out.print("Inserisci un numero: ");
            String userNumberString = scan.nextLine();
            int userNumber = Integer.parseInt(userNumberString);

            // Se è negativo
            if (userNumber < 0) {
                stop = true;                            // Setto la condizione per uscire dal loop
            } // Se è pari
            else if (userNumber % 2 == 0) {
                System.out.println(userNumber);         // Stampo il numero corrente
            } // se è dispari
            else {
                System.out.println(userNumber + 1);     // Stampo il numero successivo
            }
        }

        // Chiudo lo scanner da tastiera
        scan.close();
    }
}
