package org.lessons.java.snacks;

public class Snack3 {
    public static void main(String[] args) {
        // Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

        // Creo array di numeri interi
        int[] numbers = {3, 75, 12, 87, 8, 34, 14, 55, 2, 17, 1, 64, 52, 11};
        // (ho considerato contanto da 1: quindi i numeri dispari sono 3, 12, 8, 14, ecc.)

        // Inizializzo valore somma uguale a 0
        int somma = 0;

        // Creo ciclo
        for (int i = 1; i <= numbers.length; i++) {
            // Se la posizione nell'array è dispari allora somma
            if (i % 2 != 0) {
                somma += numbers[i-1];
            }
        }

        //Stampo il risultato finale
        System.out.println(somma);
    }
}
