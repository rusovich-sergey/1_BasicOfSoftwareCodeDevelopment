package cicles.task3;

/*
Найти сумму квадратов первых ста чисел.
 */

public class SumOfSquares {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += (int) Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
