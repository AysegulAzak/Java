public class Main {
    public int sayi1 = 6;

    public static void main(String[] args) {
        int sayi = 5;
        sayi = 7;
        System.out.println(sayi);
        //sayi1 = 4;
        // sayi1 = 8;
        // System.out.println(sayi1);
        Main main = new Main();
        main.sayi1 = 9;
        System.out.println(main.sayi1);

        Person person = new Person();
        Person person1 = new Person();
        person.firstName = "Furkan";
        person1.firstName = "Anıl";
        person.lastName = "Baysan";
        person1.lastName = "Toprak";
        person.age = 23;
        person1.age = 22;
        System.out.println(person.firstName + person.lastName + person.age);
        System.out.println(person1.firstName + person1.lastName + person1.age);

        Ford focus = new Ford();
        Ford mondeo = new Ford();
        //System.out.println(focus.numberOfGears);
        //System.out.println(mondeo.numberOfGears);
        focus.numberOfGears = 6;
        mondeo.numberOfGears = 5; //bir nesneyle yapılan müdahale diğerini etkiler
        System.out.println(focus.numberOfGears);
        Ford.numberOfGears = 8;
        System.out.println(Ford.numberOfGears);
    }
}