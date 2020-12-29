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
        Student[] studentArray=new Student[20];
        studentArray[0]=new Student(1,"Наумов","Евгений","Андреевич",1990,"Инженерная 19",200041,"Физика",1,"А");
        studentArray[1]=new Student(2,"Сацук","Анна","Андреевна",1992,"Голикова 5",346620,"Математика",3,"А");
        studentArray[2]=new Student(3,"Гришанович","Сергей","Александрович",1991,"Рябцева 4",584698,"Биология",2,"Б");
        studentArray[3]=new Student(4,"Кертанов","Алексей","Сергеевич",1991,"Адропова 28",124552,"Физика",1,"Б");
        studentArray[4]=new Student(5,"Турчин","Николай","Юрьевич",1989,"Советская 20",450396,"Математика",4,"А");
        studentArray[5]=new Student(6,"Пушков","Гриша","Яковливвич",1986,"Курилова 76",367180,"Биология",2,"А");
        studentArray[6]=new Student(7,"Ринго","Элькон","Петросьянович",1995,"Айленд 4",542041,"Физика",2,"Б");
        studentArray[7]=new Student(8,"Абдул","Магамед","Мухамедович",1993,"Робинзона 6",824081,"Математика",1,"Б");
        studentArray[8]=new Student(9,"Рисаков","Юра","Аркадьевич",1990,"Киото 99",233501,"Физика",4,"Б");
        studentArray[9]=new Student(10,"Кулешов","Артем","Сергеевич",1990,"Новичкова 66",568672,"Биология",3,"А");
        studentArray[10]=new Student(11,"Афонина","Ольга","Дмитриевна",1991,"Райская 15",803313,"Математика",2,"Б");
        studentArray[11]=new Student(12,"Лисакова","Ольга","Афонасьевна",1980,"Адовая 999",257861,"Физика",4,"А");
        studentArray[12]=new Student(13,"Коршун","Дмитрий","Иванович",1976,"Киплинга 7",537733,"Физика",3,"Б");
        studentArray[13]=new Student(14,"Сокол","Екатерина","Анатольевна",1987,"Набережная 84",286334,"Математика",1,"Б");
        studentArray[14]=new Student(15,"Гиндюк","Артем","Анатольевич",1992,"Аймедова 5",999999,"Биология",1,"А");
        studentArray[15]=new Student(16,"Новачук","Николай","Юльевич",1992,"Шейхова 13",344366,"Физика",2,"А");
        studentArray[16]=new Student(17,"Назаренко","Евгений","Сергеевич",1993,"Калининградская 104",235461,"Математика",3,"А");
        studentArray[17]=new Student(18,"Куликова","Елена","Васильевна",1994,"Уручье 9",289463,"Биология",1,"Б");
        studentArray[18]=new Student(19,"Понасенко","Анастасия","Николаевна",1989,"Гуськина 15",789541,"Физика",3,"А");
        studentArray[19]=new Student(20,"Трофимук","Кирил","Александрович",1988,"Адресная 1",255741,"Математика",4,"Б");
        University brest=new University(studentArray.length ,studentArray);
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
