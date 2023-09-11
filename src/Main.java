public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int contribution = 15000;
        int total = 0;
        int i =  0;
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





    }
}