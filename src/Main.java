import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.println("-------------------- Task1 --------------------");
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ +=arr[i];
        }
        System.out.println("The amount of expenses for the month was " + summ + " RUB");

        System.out.println("\n-------------------- Task2 --------------------");
        int min = 250_000;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum amount of expenses per day was " + min + " RUB. The maximum amount of expenses per day was " + max + " RUB.");

        System.out.println("\n-------------------- Task3 --------------------");
        float averageValue = (float) summ / 30;
        System.out.println("The average amount of expenses for the month was " + averageValue + " RUB");

        System.out.println("\n-------------------- Task4 --------------------");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}