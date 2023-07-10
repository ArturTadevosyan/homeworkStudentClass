public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Artur";
        student1.surName = "Tadevosyan";
        student1.year = 1994;
        student1.mark = 84.8;
        student1.gender = 'm';
        student1.isArmenian = true;
        student1.showAllInfoStudent(student1);

        student2.name = "Aren";
        student2.surName = "Ayvazov";
        student2.year = 2000;
        student2.mark = 94.8;
        student2.gender = 'm';
        student2.isArmenian = false;
        student2.showAllInfoStudent(student2);

        System.out.println("Show bigger student");
        student1.biggest(student1, student2);

        System.out.println("Show younger student");
        student1.youngest(student1, student2);

        System.out.println("Show bigger mark student");
        student1.biggestMark(student1, student2);

        System.out.println("Show Is Armenian student");
        student1.checkedIsArmenian(student1, student2);

        System.out.println("Show Female student");
        student1.showFemale(student1, student2);

        System.out.println("Show Male student");
        student1.showMale(student1, student2);

        System.out.println("Show Female max mark student (two students gender is female)");
        student1.showGirlsMaxMark(student1, student2);

    }
}