import java.util.Scanner;

public class sayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {

        int a,b,c;
        Scanner imp = new Scanner(System.in);

        System.out.print("1. Sayı : ");
        a = imp.nextInt();

        System.out.print("2. Sayı : ");
        b = imp.nextInt();

        System.out.print("3. Sayı : ");
        c = imp.nextInt();

        if(a > b && a > c){
            if(b > c){
                System.out.println("c < b < a");
            }else {
                System.out.println("b < c < a");
            }
        } else if (b > a && b > c) {
            if(a > c){
                System.out.println("c < a < b");
            }else{
                System.out.println("a < c < b");
            }
        }else{
            if(a > b){
                System.out.println("b < a < c");
            }else{
                System.out.println("a < b < c");
            }
        }
    }
}
