public class ArrayAsAReference {
    public void changeTheArray(int []array) {
        array = new int[]{7,8,9}; // değişmez
        array[0] = array[0] + 7; // değişir
       // array[0] =95;
    }

}
