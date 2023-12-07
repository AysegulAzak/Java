public class PassByReference {
    public int number2; //instance variable

    public void change(PassByReference reference) {
        reference = new PassByReference(); // orijinal veri değişmez
        reference.number2 = reference.number2 + 3;
        //  reference.number2 = 9;

    }

}
