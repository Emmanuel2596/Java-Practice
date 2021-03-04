import java.net.SocketImpl;

public class ArrayPractice {

    public static void main(String[]args){

        String array [] = new String[9];

            array[0] = "Audi";
            array[1] = "Bmw";
            array[2] = "Honda";
            array[3] = "Hyundai";
            array[4] = "Isuzu";
            array[5] = "Kia";
            array[6] = "Mazda";

        int position = 3;
        String newValue = "BYD";
        int positionTwo = 8;
        String secondNewValue = "Lexus";

        for (int i = array.length-1; i > position -1; i--){

            array[i] = array[i-1];

        }
        array[position-1] = newValue;

        for (int i = array.length-1; i > positionTwo -1; i--){

            array[i] = array[i-1];

        }
        array[positionTwo-1] = secondNewValue;


        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }


    }
}

