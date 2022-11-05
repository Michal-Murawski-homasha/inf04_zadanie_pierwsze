import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int k;

    public static int[] tablica = new int[10];

    public Main(int k) {
        Main.k = k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tablica.length; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbę: ");
            tablica[i] = scanner.nextInt();
            System.out.println();
            k = tablica[i];
        }
        System.out.println("Tablica nieposortowana: " + Arrays.toString(tablica));

        sortuj();
        szukaj();
    }

    /**
     * Metoda sortuj
     * Przechowuje nieposortowane wartości tablicy tablica
     * Zwraca posortowane malejąco wartości tablicy tablica
     * autor: PESEL
     */
    private static void sortuj() {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length - 1; j++) {
                if (tablica[j] < tablica[j + 1]) {
                    int tmp = tablica[j + 1];
                    tablica[j + 1] = tablica[j];
                    tablica[j] = tmp;
                }
            }
        }
        System.out.println("Tablica posortowana; " + Arrays.toString(tablica));
    }

    /**
     * Metoda szukaj
     * Przechowuje wartości tablicy tablica
     * Zwraca największą wartość tablicy tablica
     * autor: PESEL
     */
    private static void szukaj() {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > k) {
                k = tablica[i];
            }
        }
        System.out.println("Najwyższa wartość to: " + k);
    }
}
