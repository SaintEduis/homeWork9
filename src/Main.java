import java.util.Random;

public class Main {
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

    public static void task() {
        int[] arr = generateRandomArray();
        //Exercise 1
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("----------------------");

        //Exercise 2
        int maxSpending = 0;
        int minSpending = 200000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpending) {
                maxSpending = arr[i];
            }
            if (arr[i] < minSpending) {
                minSpending = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей");
        System.out.println("----------------------");

        //Exercise 3
        float averageVlue = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageVlue + " рублей");
        System.out.println("----------------------");

        //Exercise 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static void main(String[] args) {
        task();
    }
}