public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sumEvenN(array);
    }

    static void sumEvenN(int[] masiv) {
        int suma = 0;
        
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 2 == 0) {
                suma += masiv[i];
            }
        }
        System.out.println("Sumata na chetnite elementi e: " + suma);
    }
}

/* function koqto priema kato parametur masiv namira sumata na vsichki chetni elementi i q printira v mein metoda */