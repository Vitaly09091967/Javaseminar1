//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 
//(произведение чисел от 1 до n)

public class zadacha1 {
    public static void main(String[] args) {
        
        int n = 7;
        int tn = n * (n + 1) / 2;
        System.out.println("T" + n + " = " + tn);
        
    }
}
