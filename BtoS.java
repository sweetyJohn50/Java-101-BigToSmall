package BtoS;
import java.util.Scanner;
public class BtoS {
    public static void main(String[] args) {
        int a,b,c;
         
        Scanner i = new Scanner(System.in);

        System.out.print("A sayisini giriniz : ");

        a = i.nextInt();

        System.out.print("B sayisini giriniz : ");

        b = i.nextInt();

        System.out.print("C sayisini giriniz : ");

        c = i.nextInt();
        
        i.close();

        if((a > b)&&(a > c)){
            if(b > c){
                System.out.print("a>b>c");
            } else {
                System.out.print("a>c>b");
            }
        } else if((b > a)&&(b > c)){
            if(a > c){
                System.out.print("b>a>c");
            } else{
                System.out.print("b>c>a");
            }
        } else{
            System.out.print("c>b>a");
        }

    }

}
    //  Hakan Çoban
    // https://app.patika.dev/hknxx