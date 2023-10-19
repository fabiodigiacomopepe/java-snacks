package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        // BONUS
        // scrivere un programma che dati dei secondi li converta in ore, minuti, secondi
        // e mostri a video la stringa generata (secondi → “hh:mm:ss”)

        // Inizializzo lo scanner da tastiera
        Scanner scan = new Scanner(System.in);

        // Chiedo numero a utente
        System.out.print("Inserisci i secondi: ");
        String userSecondsString = scan.nextLine();
        int userSeconds = Integer.parseInt(userSecondsString);

        // Calcolo ore, minuti e secondi
        int ore = userSeconds / 3600;
        int minuti = (userSeconds % 3600) / 60;
        int secondi = userSeconds % 60;

        // Creo stringa indicando il formato e dando come paramenti quelli precedentemente calcolati
        String risultato = String.format("%02d:%02d:%02d", ore, minuti, secondi);

        // Stampo risultato
        System.out.println("Tempo convertito: " + userSeconds + " → " + risultato);

        // Chiudo lo scanner da tastiera
        scan.close();
    }
}
