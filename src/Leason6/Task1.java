package Leason6;

import java.util.Scanner;

import static javax.swing.text.html.HTML.Tag.U;

public class Task1 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public static void main(String[] args) {

        // Створюємо сканер для зчитуванян даних.
        Scanner DepositInput = new Scanner(System.in);

        // ResCred має початкове значення 0 - згодоми ми будемо надавати йому нового значення й перезаписувати його.
        int ResCred = 0;

        // CREDIT має значення кредиту 700 грн.
        int CREDIT = 700;

        // Зтворюємо конструкцію if - else в якій реалізовуємо вкладені цикли.
        if (ResCred < CREDIT) {
            // виплата має бути до 7 разів тому реалізуємо за допомогою цикла FOR.
            for (int i = 1; i <= 7; i++) {
                // ініціалізуємо тимчасову змінну tmp.
                int tmp = 0;
                // змінній tmp присвоюємо значення через сканер реалізований в 20 рядку.
                tmp = DepositInput.nextInt();
                // записані дані tmp перезаписуємо у змінну ResCred.
                ResCred += tmp;
                // виводимо згідно кількості ітерацій результати вводу даних.
                System.out.println("Внесено суму: " + ANSI_PURPLE + ResCred + ANSI_RESET + " грн." + " за " + i + "й платіж");

                // вкладенна конструкція if - else .
                // у випадку якщо результат змінної ResCred становить значення більше змінної CREDIT цикл припиняється за допомогою додатку break - що завершує цикл.
                if (ResCred > CREDIT) {
                    int overPay = ResCred - CREDIT;
                    System.out.println(ANSI_CYAN + "Кредит виплачено." + ANSI_RESET);
                    System.out.println("Сумма передплати складає: " + ANSI_GREEN + overPay + ANSI_RESET + "грн.");
                    break;
                }
                // у випадку якщо результат змінної ResCred становить менше значення змінної CREDIT виводиться результат останньої суми ітреації значення ResCred - значення CREDIT(700).
                else {
                    int theBalanceOfTheDebt = CREDIT - ResCred;
                    System.out.println(ANSI_RED + "Кредит не виплачено." + ANSI_RESET);
                    System.out.println("Сума боргу складає " + ANSI_RED + theBalanceOfTheDebt + ANSI_RESET);
                }
            }
        }
    }
}
