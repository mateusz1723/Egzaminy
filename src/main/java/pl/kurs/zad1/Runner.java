package pl.kurs.zad1;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 liczb: ");

        int[] tab = new int[5];
        int i = 0;
        while (scanner.hasNextInt()) {
            tab[i] = scanner.nextInt();
            i++;
            if (i == tab.length) {
                break;
            }

        }
        System.out.println();
        Arrays.sort(tab);

        System.out.println("Najwieksza liczba: " + tab[tab.length - 1]);
        System.out.println();
        System.out.println("Najmniejsza liczba: " + tab[0]);
        System.out.println();



        System.out.println("--------------------------------------");
        for (int j = 0; j <= tab.length - 1; j++) {
            int counter = 0;
            for (int k = 1; k <= tab[j]; k++) {
                if (tab[j] % k == 0) {

                    counter = counter + 1;
                }
            }
            System.out.println("Liczba: " + tab[j] + " ma " + counter + " dzielnikow");
        }
        System.out.println("--------------------------------------");




        int cnt = 0;
        for (int j = 0; j <= tab.length - 1; j++) {
            int counter = 0;
            for (int k = 1; k <= tab[j]; k++) {
                if (tab[j] % k == 0) {
                    counter = counter + 1;
                    if (counter > 2)
                        break;
                    if (k == tab[j] && counter == 2)
                        cnt = cnt + 1;
                }

            }

        }
        System.out.println("Ilosc liczb pierwszych: " + cnt);


        scanner.close();
    }
}
