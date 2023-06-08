//2) Вывести все простые числа от 1 до 1000


public class zadacha2 {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[1001]; // Создаем булевский массив размером 1000 (от 0 до 1000)

        // Заполняем массив значениями true
        for (int i = 2; i <= 1000; i++) {
            isPrime[i] = true;
        }

        // Просеиваем массив и помечаем составные числа
        for (int i = 2; i * i <= 1000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Выводим на экран все простые числа
        for (int i = 2; i <= 1000; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
