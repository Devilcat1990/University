package University;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String surnameRus;
    private int dataBorn;
    private String address;
    private int numberPhone;
    private String faculty;
    private int course;
    private String group;

    public Student() {
    }

    public Student(int id, String surname, String name, String surnameRus, int dataBorn, String adress, int numberPhone, String facultet, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.surnameRus = surnameRus;
        this.dataBorn = dataBorn;
        this.address = adress;
        this.numberPhone = numberPhone;
        this.faculty = facultet;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSurnameRus() {
        return surnameRus;
    }

    public int getDataBorn() {
        return dataBorn;
    }

    public String getAdress() {
        return address;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public String getFacultet() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurnameRus(String surnameRus) {
        this.surnameRus = surnameRus;
    }

    public void setDataBorn(int dataBorn) {
        this.dataBorn = dataBorn;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setFacultet(String facultet) {
        this.faculty = facultet;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", surnameRus='" + surnameRus + '\'' +
                ", dataBorn='" + dataBorn + '\'' +
                ", address='" + address + '\'' +
                ", numberPhone=" + numberPhone +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
