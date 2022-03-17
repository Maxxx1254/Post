public class Main {
    public static void main(String[] args) {
        // Данные
        int balance = 300;
        int cost = 3_000;
        int part = 100;

        // Логика
        int bonus;
        if (cost > 1_000) {
            bonus = cost / part;
        } else {
            bonus = 0;
        }
        int sum = balance + cost + bonus;
        System.out.println(sum);
    }
}