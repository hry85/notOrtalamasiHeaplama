import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat;
        int fizik;
        int kimya;
        int turkce;
        int tarih;
        int muzik;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunuz : " );
        mat=input.nextInt();

        System.out.print("Fizik Notunuz : " );
        fizik=input.nextInt();

        System.out.print("Kimya Notunuz : " );
        kimya=input.nextInt();

        System.out.print("Turkce Notunuz : " );
        turkce=input.nextInt();

        System.out.print("Tarih Notunuz : " );
        tarih=input.nextInt();

        System.out.print("Muzik Notunuz : " );
        muzik=input.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama=toplam/6.0;
        System.out.print("Ortalamaniz : " +ortalama);
        String sonuc=(ortalama>=60) ? " Sinifi Gectiniz" : " Sinifta Kaldiniz";
        System.out.print(sonuc);




    }
}
