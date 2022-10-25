import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, ebob = 0, ekok, temp1;

        System.out.print("İlk sayıyı giriniz: ");
        n1 = sc.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = sc.nextInt();

        for(int i = 1; i <= n1 || i <= n2; i++){

            if(n1 % i == 0 && n2 % i == 0){
                if(i > ebob){
                    ebob = i;
                }

            }

        }
        ekok = (n1 * n2)/ ebob;
        System.out.print("Bu sayıların EBOB'u " + ebob + "\n");
        System.out.println("Bu sayıların EKOK'u " + ekok);


    }
}
