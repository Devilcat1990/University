package University;

import java.util.Scanner;

public class Funtional {
    //МЕТОД ПРОВЕРКИ ВВОДА СТРОКИ БЕЗ ЦИФР
    static String str() {
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        boolean valueFalse = false;
        while (valueFalse == false) {
            char[] c = stroka.toCharArray();
            boolean b = false;
            for (int i = 0; i < c.length; i++) {
                if (Character.isDigit(c[i])) {
                    i = c.length;
                    b = true;
                }
            }
            if (b == false) {
                valueFalse = true;
            } else {
                System.out.println("Вы ввели строку с цифрами, попробуйте еще!");
                stroka = in.nextLine();
                valueFalse = false;
            }
        }
        return stroka;
    }

    //МЕТОД ПРОВЕРКИ ВВОДА ЧИСЛА
    static int values() {
        Scanner in = new Scanner(System.in);
        boolean valueFals = false;
        int value = 0;
        while (in.hasNextInt() == false) {
            System.out.println("Нужно вводить число!");
            in.next();
        }
        value = in.nextInt();
        return value;
    }
}
