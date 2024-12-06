import java.util.Scanner;

/**
 * Основной класс приложения, который вычисляет значение математического выражения
 * на основе введенного пользователем натурального числа num.
 * Программа вычисляет сумму элементов выражения ∑ (2^i / i!) от i = 2 до num.
 */
public class Main {
    /**
     * Основной метод программы. Служит точкой входа в приложение.
     *
     * @param args аргументы командной строки (в данной программе не используются).
     */
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Введите num: ");
        int num = inputScanner.nextInt();
        double base = 2.0;
        double sum = 0;

        for (int index = 2; index <= num; index++) {
            sum += Math.pow(base, index) / calculateFactorial(index);
        }

        System.out.println("Ответ: " + sum);
    }

    /**
     * Метод для вычисления факториала заданного неотрицательного числа value.
     *
     * @param value целое число, для которого требуется найти факториал.
     *              Если значение value отрицательное, метод возвращает 0.
     * @return факториал числа value. Если value <= 1, возвращает 1 (определение факториала для 0 и 1).
     */
    private static double calculateFactorial(int value) {
        if (value <= 1) {
            return 1;
        } else {
            return value * calculateFactorial(value - 1);
        }
    }
}
