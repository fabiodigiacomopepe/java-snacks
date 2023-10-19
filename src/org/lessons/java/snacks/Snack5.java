package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        // BONUS
        // Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
        // Possibile usare solo :
        // - cicli
        // - chartAt
        // - if / switch
        // Es. “25" come stringa deve essere convertito in intero 25.

        // Inizializzo lo scanner da tastiera
        Scanner scan = new Scanner(System.in);

        // Chiedo numero a utente
        System.out.print("Inserisci una numero: ");
        String userNumber = scan.nextLine();

        // Setto number a 0 e isNegative a false
        int number = 0;
        boolean isNegative = false;

        // Se il primo carattere è - (quindi se il numero è negativo)
        if (userNumber.charAt(0) == '-') {
            // Setto isNegative a true e rimuovo il primo carattere dalla stringa (il segno meno)
            isNegative = true;
            userNumber = userNumber.substring(1);
        }

        // Avvio ciclo
        for (int i = 0; i < userNumber.length(); i++) {
            // Assegno a digitChar il carattere di userNumber in posizione uguale al valore di i
            char digitChar = userNumber.charAt(i);
            // Sottraggo 0 per ottenere il valore numerico del carattere
            int digitValue = digitChar - '0';
            // Moltiplico per 10 per posizionare correttamente il numero
            number = number * 10 + digitValue;
        }

        // Se numero originario è negativo
        if (isNegative) {
            // A number aggiungo segno meno
            number = -number;
        }

        // Stampo numero convertito
        System.out.println("Numero convertito: " + number);

        // Chiudo lo scanner da tastiera
        scan.close();
    }
}
