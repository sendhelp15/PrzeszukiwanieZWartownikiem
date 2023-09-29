import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static final int SIZE_ARRAY = 50;

    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        System.out.println("Napisz liczbe ktorą chcesz wyszukać");
        int lookedForNumber = skan.nextInt();

        System.out.println();

        int foundIndex = findNum(lookedForNumber, sizeArray());
        if (foundIndex == SIZE_ARRAY) {
            System.out.println("Szukanej liczby " + lookedForNumber + " nie ma w tablicy");
        } else {
            System.out.println("Szukana liczba " + lookedForNumber + " jest w tablic  pod indexem " + foundIndex);
        }


    }

    public static int[] sizeArray() {
        int[] arrayNumber = new int[SIZE_ARRAY];
        for (int i = 0; i < SIZE_ARRAY; i++) {
            if (i % 10 == 0) System.out.println();

            arrayNumber[i] = (int) (random() * 100);
            System.out.print(arrayNumber[i] + ", ");
        }
        return arrayNumber;
    }

    public static int findNum(int lookedForNumber, int[] arrayNumber) {

        int[] arrayNumberWithSentry = new int[SIZE_ARRAY + 1];
        for (int i = 0; i < SIZE_ARRAY; i++) {
            arrayNumberWithSentry[i] = arrayNumber[i];
        }

        arrayNumberWithSentry[SIZE_ARRAY] = lookedForNumber;
        int indexNumber = 0;
        for (int i = 0; i <= SIZE_ARRAY; i++) {
            if (arrayNumberWithSentry[i] == lookedForNumber) {
                indexNumber = i;
                break;
            }
        }
        return indexNumber;
    }
}
