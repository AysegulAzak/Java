public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setInfo("jack", "sparrow", 45, 90);
        System.out.println("Final score" + student1.finalExam);
        student1.showInfo();

        System.out.println(student1.computeAverage());

        System.out.println(student1);

        Student student2 = new Student();
        student2.name = "Jane";
        student2.surname = "James";
        student2.midTerm = 45;
        student2.finalExam = 74;

        student2.showInfo();
        System.out.println(student2.computeAverage());

        Student[] students = {student1, student2};
        System.out.println("----------------");
        for (Student s : students)
            System.out.println(s.average);
        //FirstMethod
        //Pop();
    }

    static void Pop() {
        String name = "Ali";
        String surname = "Can";
        String name1 = "Berk";
        String surname1 = "Can";
        float midTerm = 90;
        float finalExam = 85;
        float average;

        ShowStudentInfo(name, surname);
        ShowStudentInfo(name1, surname1);

        average = computeAverage(midTerm, finalExam);

        System.out.println("score" + average);

    }

    static float computeAverage(float midTerm, float finalExam) {
        return midTerm * 0.4f + finalExam * 0.6f;

    }

    static void ShowStudentInfo(String name, String surname) {
        System.out.printf("name: %s Surname: %s %n", name, surname);
    }

}
