package University;

import java.util.Scanner;

public class University {
    private int numberOfStudents;
    private Student[] students;
    private final String[] faculty = {"Физика", "Математика", "Биология"};
    private final int[] course = {1, 2, 3, 4};
    private final String[] group = {"А", "Б"};

    public University(int numberOfStudents, Student[] students) {
        this.numberOfStudents = numberOfStudents;
        this.students = students;
    }

    public University(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
        this.students = new Student[numberOfStudents];

    }

    public University() {
        this.numberOfStudents = 0;
        this.students = new Student[numberOfStudents];
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String[] getFaculty() {
        return faculty;
    }

    //МЕТОД ВЫВОДА СПИСКА ФАКУЛЬТЕТОВ
    public void listFaculty() {
        System.out.println("\nДоступные факультеты:");
        for (int i = 0; i < faculty.length; i++) {
            System.out.println(i + 1 + "." + faculty[i]);
        }
    }

    public int[] getCourse() {
        return course;
    }

    //МЕТОД ВЫВОДА СПИСКА КУРСОВ
    public void listCourse() {
        System.out.println("\nДоступные курсы:");
        for (int i = 0; i < course.length; i++) {
            System.out.println(course[i]);
        }
    }

    public String[] getGroup() {
        return group;
    }

    //МЕТОД ВЫВОДА СПИСКА ГРУПП
    public void listGroup() {
        for (int i = 0; i < group.length; i++) {
            System.out.println(i + 1 + "." + group[i]);
        }
    }

    //МЕТОД ДЛЯ ДОБАВЛЕНИЯ СТУДЕНТОВ В УНИВЕРСИТЕТ(МАССИВ ОБЬЕКТОВ ДЛЯ ЗАДАЧИ)
    public void setStudentsKeyboard() {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Студент №%d", i + 1);
            Scanner in = new Scanner(System.in);
            students[i] = new Student();
            System.out.print("Введите ID студента:");
            students[i].setId(Funtional.values());
            System.out.print("Введите Фамилию студента:");
            students[i].setSurname(Funtional.str());
            System.out.print("Введите имя студента:");
            students[i].setName(Funtional.str());
            System.out.print("Введите Отчество студента:");
            students[i].setSurnameRus(Funtional.str());
            System.out.print("Введите год рождения студента:");
            students[i].setDataBorn(Funtional.values());
            System.out.print("Введите Адресс студента:");
            students[i].setAdress(in.nextLine());
            System.out.print("Введите телефон студента:");
            students[i].setNumberPhone(Funtional.values());
            System.out.print("Введите факультет студента.");
            students[i].setFacultet(checkFaculty());
            System.out.print("Введите номер курса студента:");
            students[i].setCourse(checkCourse());
            System.out.print("Введите букву группы студента:");
            students[i].setGroup(checkGroup());
        }
    }

    //МЕТОД ДЛЯ ВЫВОДА ИНФОРМАЦИИ О ВСЕХ СТУДЕНТАХ
    public void getStudentList() {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("\nID чтудента:%d", students[i].getId());
            System.out.printf("\nФамилия студента:%s", students[i].getSurname());
            System.out.printf("\nИмя студента: %s", students[i].getName());
            System.out.printf("\nОтчество студента: %s", students[i].getSurnameRus());
            System.out.printf("\nГод рождения студента: %d", students[i].getDataBorn());
            System.out.printf("\nАдресс студента: %s", students[i].getAdress());
            System.out.printf("\nТелефон студента: %d", students[i].getNumberPhone());
            System.out.printf("\nФакультет студента: %s", students[i].getFacultet());
            System.out.printf("\nНомер курса студента: %d", students[i].getCourse());
            System.out.printf("\nБуква группы студента: %s", students[i].getGroup());
        }
    }

    //МЕТОД ДЛЯ ВЫВОДА ИНФОРМАЦИИ О СТУДЕНТАХ ПО ФАКУЛЬТЕТУ
    public void getStudentListToFaculty(String facult) {
        boolean check = false;
        for (int i = 0; i < numberOfStudents; i++) {
            if (facult == students[i].getFacultet()) {
                System.out.printf("\nID чтудента:%d", students[i].getId());
                System.out.printf("\nФамилия студента:%s", students[i].getSurname());
                System.out.printf("\nИмя студента: %s", students[i].getName());
                System.out.printf("\nОтчество студента: %s", students[i].getSurnameRus());
                System.out.printf("\nГод рождения студента: %d", students[i].getDataBorn());
                System.out.printf("\nАдресс студента: %s", students[i].getAdress());
                System.out.printf("\nТелефон студента: %d", students[i].getNumberPhone());
                System.out.printf("\nФакультет студента: %s", students[i].getFacultet());
                System.out.printf("\nНомер курса студента: %d", students[i].getCourse());
                System.out.printf("\nБуква группы студента: %s", students[i].getGroup());
                check = true;
            }
        }
        if (check == false) {
            System.out.printf("\nСтудентов на факультете %s нет!", facult);
        }
    }

    public void getStudentListToDate(int date) {
        boolean check = false;
        for (int i = 0; i < numberOfStudents; i++) {
            if (date < students[i].getDataBorn()) {
                System.out.printf("\nID чтудента:%d", students[i].getId());
                System.out.printf("\nФамилия студента:%s", students[i].getSurname());
                System.out.printf("\nИмя студента: %s", students[i].getName());
                System.out.printf("\nОтчество студента: %s", students[i].getSurnameRus());
                System.out.printf("\nГод рождения студента: %d", students[i].getDataBorn());
                System.out.printf("\nАдресс студента: %s", students[i].getAdress());
                System.out.printf("\nТелефон студента: %d", students[i].getNumberPhone());
                System.out.printf("\nФакультет студента: %s", students[i].getFacultet());
                System.out.printf("\nНомер курса студента: %d", students[i].getCourse());
                System.out.printf("\nБуква группы студента: %s", students[i].getGroup());
                check = true;
            }
        }
        if (check == false) {
            System.out.printf("\nСтудентов родившихся полсе %d нет!", date);
        }
    }

    public void getStudentListToGroup(String cors) {
        boolean check = false;
        for (int i = 0; i < numberOfStudents; i++) {
            if (cors == students[i].getGroup()) {
                System.out.printf("\nID чтудента:%d", students[i].getId());
                System.out.printf("\nФамилия студента:%s", students[i].getSurname());
                System.out.printf("\nИмя студента: %s", students[i].getName());
                System.out.printf("\nОтчество студента: %s", students[i].getSurnameRus());
                System.out.printf("\nГод рождения студента: %d", students[i].getDataBorn());
                System.out.printf("\nАдресс студента: %s", students[i].getAdress());
                System.out.printf("\nТелефон студента: %d", students[i].getNumberPhone());
                System.out.printf("\nФакультет студента: %s", students[i].getFacultet());
                System.out.printf("\nНомер курса студента: %d", students[i].getCourse());
                System.out.printf("\nБуква группы студента: %s", students[i].getGroup());
                check = true;
            }
        }
        if (check == false) {
            System.out.printf("\nСтудентов в группе %s нет!", cors);
        }
    }

    public void getStudentListToAllFaculty() {
        for (int i = 0; i < faculty.length; i++) {
            System.out.printf("\nСтуденты с факультета %S:", faculty[i]);
            getStudentListToFaculty(faculty[i]);
        }
    }

    //МЕТОД ПРОВЕРКИ И ВВОДА ФАКУЛЬТЕТА СТУДЕНТА ИЗ СУЩЕСТВУЮЩИХ
    public String checkFaculty() {
        int check = 0;
        boolean checkFalse = false;
        listFaculty();
        while (checkFalse == false) {
            System.out.print("\nСделайте выбор:");
            check = Funtional.values() - 1;
            if (check < 0 || check > faculty.length - 1) {
                System.out.println("Такого факультета не существует, попробуйте еще!");
            } else {
                checkFalse = true;
            }
        }
        return faculty[check];
    }

    //МЕТОД ПРОВЕРКИ И ВВОДА КУРСА СТУДЕНТА ИЗ СУЩЕСТВУЮЩИХ
    public int checkCourse() {
        int check = 0;
        boolean checkFalse = false;
        listCourse();
        while (checkFalse == false) {
            System.out.print("\nСделайте выбор:");
            check = Funtional.values() - 1;
            if (check < 0 || check > course.length - 1) {
                System.out.println("Такого курса не существует, попробуйте еще!");
            } else {
                checkFalse = true;
            }
        }
        return course[check];
    }

    //МЕТОД ПРОВЕРКИ И ВВОДА ГРУППЫ СТУДЕНТА ИЗ СУЩЕСТВУЮЩИХ
    public String checkGroup() {
        int check = 0;
        boolean checkFalse = false;
        listGroup();
        while (checkFalse == false) {
            System.out.print("\nСделайте выбор:");
            check = Funtional.values() - 1;
            if (check < 0 || check > group.length - 1) {
                System.out.println("Такой группы не существует, попробуйте еще!");
            } else {
                checkFalse = true;
            }
        }
        return group[check];
    }
}
