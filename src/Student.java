public class Student {
    String name;
    String surName;
    int year;
    double mark;
    boolean isArmenian;
    char gender;

    public void bigger(Student s1, Student s2) {
        if (s1.year < s2.year) {
            showStudent(s1);
        } else {
            showStudent(s2);
        }
    }

    public void youngest(Student s1, Student s2) {
        if (s1.year > s2.year) {
            showStudent(s1);
        } else {
            showStudent(s2);
        }
    }

    public void biggestMark(Student s1, Student s2) {
        if (s1.mark > s2.mark) {
            showStudent(s1);
        } else {
            showStudent(s2);
        }
    }

    public void checkedIsArmenian(Student s1, Student s2) {
        if (s1.isArmenian) {
            showStudent(s1);
        }
        if (s2.isArmenian) {
            showStudent(s2);
        }
    }

    public void showFemale(Student s1, Student s2) {
        if (s1.gender == 'f') {
            showStudent(s1);
        }
        if (s2.gender == 'f') {
            showStudent(s2);
        }
    }

    public void showGirlsMaxMark(Student s1, Student s2) {
        if (s1.gender == 'f' && s2.gender == 'f') {
            biggestMark(s1, s2);
        }
    }


    public void showStudent(Student s) {
        System.out.println(s.name + " " + s.surName);
        System.out.println("----------------------------");
    }

    public void showAllInfoStudent(Student s) {
        System.out.println(" Name = " + s.name +
                "\n Surname = " + s.surName +
                "\n Year =  " + s.year +
                "\n Mark = " + s.mark +
                "\n Is Armenian = " + s.isArmenian +
                "\n Gender = " + s.gender);
        System.out.println("----------------------------");
    }

}
