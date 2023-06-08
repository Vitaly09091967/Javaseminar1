//1) Вычислить n! (произведение чисел от 1 до n)

public class zadacha1f {
    public static void main(String[] args) {
        int n = 6; // задаем значение 
        int fact = 1; // задаем начальное значение факториала
        for (int i = 1; i <= n; i++) {
    fact *= i; // перемножаем все числа от 1 до n
}
            System.out.println(n + "! = " + fact); // выводим результат
    }
}
