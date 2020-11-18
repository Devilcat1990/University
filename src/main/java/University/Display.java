package University;

import java.util.Scanner;

public class Display {
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
    public static int menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nОСНОВНОЕ МЕНЮ\n");
        System.out.println("1: Вывести список всех студентов.");
        System.out.println("2: Вывести список студентов для заданного факультета.");
        System.out.println("3: Вывести списки студентов для каждого факультета и курса.");
        System.out.println("4: Вывести список студентов, родившихся после заданного года.");
        System.out.println("5: Вывести список студентов учебной группы.");
        System.out.println("6: Выход.");
        System.out.print("Пожалуйста сделайте выбор: ");
        int choice = Funtional.values();
        System.out.println(" ");
        return choice;
    }
    public static void main(String[] args) {
        System.out.print("Введите количество студентов:");
        University brest=new University(Funtional.values());
        System.out.print("\nВведите данные о студентах.");
        brest.setStudentsKeyboard();
        boolean exit = true;
        do {
            switch (menu()) {
                case 1:
                    cls();
                    brest.getStudentList();
                    break;
                case 2:
                    cls();
                    System.out.println("Студентов какого факультета вы хотите увидить?");
                    brest.getStudentListToFaculty(brest.checkFaculty());
                    break;
                case 3:
                    cls();
                    System.out.println("Список студентов по факультетам и курсам.");
                    brest.getStudentListToAllFaculty();
                    break;
                case 4:
                    cls();
                    System.out.println("Студентов старше какого года вы хотите увидить?");
                    brest.getStudentListToDate(Funtional.values());
                    break;
                case 5:
                    cls();
                    System.out.println("Студентов какой группы вы хотите увидить?");
                    brest.getStudentListToGroup(brest.checkGroup());
                    break;
                case 6:
                    cls();
                    exit = false;
                    break;
                default:
                    System.out.println("Вы выбрали не существующий пункт меню!!");
            }
        } while (exit);
    }
}
