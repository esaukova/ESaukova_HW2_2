import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /* Объявляете переменные для входных данных и
       параметров программы: начального счёта,
       суммы пополнения и тп

       Условным оператором проверяете, превысила ли
       сумма пополнения порог, и для этих двух разных
       сценариев рассчитываете сумму бонуса и выводите
       на экран. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальную сумму на счету: ");
        int initAmount = scanner.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму пополнения: ");
        int refillAmount = sc.nextInt();

        int bonus;
        bonus = refillAmount / 100;

        int finalAmount;
        finalAmount = initAmount + refillAmount + bonus;

        if (bonus >= 1) {
            System.out.println("Клиент пополнил счёт на: " + refillAmount + " рублей - бонус равен: " + bonus + " рублей, итоговая сумма на счету клиента: " + finalAmount + " рублей.");
        } else {
            System.out.println("Клиент пополнил счёт на: " + refillAmount + " рублей - бонусов нет, итоговая сумма на счету клиента: " + finalAmount + " рублей.");
        }

    }

}
