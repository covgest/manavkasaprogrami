import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç Kg Armut Aldınız : ");
        armut = inp.nextDouble();

        System.out.print("Kaç Kg Elma Aldınız : ");
        elma = inp.nextDouble();

        System.out.print("Kaç Kg Domates Aldınız : ");
        domates = inp.nextDouble();

        System.out.print("Kaç Kg Muz Aldınız  :");
        muz = inp.nextDouble();

        System.out.print("Kaç Kg Patlıcan Aldınız : ");
        patlican = inp.nextDouble();

        double tutar = (armut*2.14 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5.00);
        System.out.println("Toplam Tutar : " + tutar);
    }
}