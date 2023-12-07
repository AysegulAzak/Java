public class Main {
    public static void main(String[] args) {
        //int sayi=5;
        //int sayi1;
        //int Sayi;

        //primitive data types
        int sayi1 = 5;
        int sayi2 = 10;
        sayi1 = sayi2;
        sayi1 = 20;
        System.out.println(sayi2);

        //reference data types
    /*       int  []  numbers= {15,25,35,45};
            //int  []  numbers2=new int[] {55,65,75,85}; üsttekiyle aynı
            int [] numbers2=new int[numbers.length];
            for(int i=0; i<numbers.length; i++) {
                numbers2[i]=numbers[i]; //deep copy
            }
            for(int i=0; i<numbers2.length; i++) {
                System.out.println(numbers2[i]);
            }
            numbers[1]=48;
            System.out.println(numbers2[1]);

            //numbers2=numbers; //shallow copy (soldakine müdahale var)
            //numbers[0]=5;
            //System.out.println(numbers2[0]); */


        //wrapper class
         /*   int sayi3 = 55;  // ikisi aynı şey yapar
            Integer sayi4 = new Integer(55); // ikisi aynı şey yapar
            System.out.println(sayi3);
            System.out.println(sayi4); */

        //String name = "Ayşegül AZAK";
        String channelName = new String("Yazilim");
        //System.out.println(name + " " + channelName);

        String name;
        String firstName = "Ayşegül ";
        name = firstName + "Azak";
        System.out.println(name);

        String fname = "Omer";
        String lname = "Tasci";
        fname = lname;
        System.out.println(fname);
    }
}




