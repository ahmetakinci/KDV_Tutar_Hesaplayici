import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tutar,kdv_bedeli1=0.18,kdv_bedeli2=0.08,kdvli_tutar,kdv_tutarı;

        System.out.print("Ürünün Fiyatının Giriniz: ");
        tutar = scanner.nextDouble();

        kdv_tutarı = 0<tutar && tutar<=1000 ? tutar*kdv_bedeli1 : tutar*kdv_bedeli2;
        kdvli_tutar = tutar + kdv_tutarı;
        System.out.println("KDV siz tutar: " + tutar);
        System.out.println("1000 lira ve altı için kdv bedeli: " + kdv_bedeli1 );
        System.out.println("1000 liranı üstü için kdv bedeli: " + kdv_bedeli2 );
        System.out.println("KDV tutarı: " + kdv_tutarı);
        System.out.println("KDV li tutar: " + kdvli_tutar);
    }
}