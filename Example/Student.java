
public class Student {
    String name;
    String surname;
    float midTerm;

    float finalExam;
    float average;

    void setInfo(String n, String s, float m, float f) {
        this.name = n;
        this.surname = s;
        this.midTerm = m;
        this.finalExam = f;
    }
    float computeAverage() {
        average = midTerm * 0.4f + finalExam * 0.6f ;
        return average;
    }
    void showInfo(){
        System.out.printf("Name: %s Surname: %s %n", name, surname);
    }
}
