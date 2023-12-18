package clase03;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PracticaScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String s = sc.next();
        Double d;
        d = sc.nextDouble();

        System.out.println("Un entero: " + num);
        System.out.println("Un string: " + s);
        System.out.println("Un double: " + d);

    }


}
