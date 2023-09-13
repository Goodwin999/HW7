public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int contribution = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            i = i + 1;
        }

        int g = 1;
        while (g <= 10) {
            System.out.print(" " + g);
            g = g + 1;
        }
        System.out.println();
        for (g = 10; g > 0; g--) {
            System.out.print(" " + g);
        }


        System.out.println();
        int population = 12_000_000;
        int birthRate = 1;
        int birthRate1 = 1000;
        while (birthRate <= 10) {
            System.out.println("Год " + birthRate + " численность населения составляет " + population);
            birthRate1 = (17 - 8) * 12_000;
            population = population + birthRate1;
            birthRate = birthRate + 1;
        }

        System.out.println();
        int contribution1 = 15000;
        int target = 12_000_000;
        int percent = 7;
        int total1 = 0;
        for (int j = 0; total1 < target; j++) {
            total1 = total1 + total1 * percent / 100;
            total1 = total1 + contribution1;
            System.out.println("Месяц " + j + " сумма накоплений составляет " + total1);

        }
        int contribution2 = 15000;
        int target1 = 12_000_000;
        int percent1 = 7;
        int total2 = 0;
        for (int j = 0; total2 < target1; j++) {
            total2 = total2 + total2 * percent1 / 100;
            total2 = total2 + contribution2;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + " сумма накоплений составляет " + total2);

            }
        }




        }

    }

