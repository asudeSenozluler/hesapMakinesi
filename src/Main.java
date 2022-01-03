import java.util.Scanner;

public class Main {
    public static int cikarma(int a,int b){
        return (a-b);
    }
    public static double bolme(int a,int b){
        return ((double)a/b);
    }
    public static int topla(int a,int b){
        return (a+b);

    }
    public static int carp(int a,int b){
        return (a*b);
    }
    public static int topla(int a,int b,int c){
        return (a+b+c);

    }
    public static int carp(int a,int b,int c){
        return (a*b*c);
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        String islemler="1.Toplama İşlemi"+
                "2.Çıkarma İşlemi"+
                "3.Çarpma İşlemi"+
                "4.Bölme İşlemi"+
                "Çıkış için q'ya basın.";
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("*******************************");
        while (true){
            System.out.println("İşlem Seçiniz: ");
            String islem=scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
            break;
            }
            else if (islem.equals("1")) {
                System.out.println("Kaç değer gireceksiniz?");
                int kacSayi = scanner.nextInt();
                if (kacSayi == 2) {
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların Toplamlar: " + topla(a, b));
                } else if (kacSayi == 3) {
                    if (kacSayi == 2) {
                        System.out.println("a:");
                        int a = scanner.nextInt();
                        System.out.println("b:");
                        int b = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("c:");
                        int c = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Girilen Sayıların Toplamlar: " + topla(a, b, c));
                    }

                } else {
                    System.out.println("Bunun İçin Uygun Bir Metod Yok!");

                }
            }
                        else if (islem.equals("2")){
                    System.out.println("a:");
                    int a=scanner.nextInt();
                    System.out.println("b:");
                    int b=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("İşlem sonucu: "+cikarma(a,b));



                }
                        else if (islem.equals("3")) {
                System.out.println("Kaç değer gireceksiniz?");
                int kacSayi = scanner.nextInt();
                if (kacSayi == 2) {
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların Çarpımları: " + carp(a, b));
                } else if (kacSayi == 3) {
                    if (kacSayi == 2) {
                        System.out.println("a:");
                        int a = scanner.nextInt();
                        System.out.println("b:");
                        int b = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("c:");
                        int c = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Girilen Sayıların Çarpımları: " + carp(a, b, c));
                    }

                } else {
                    System.out.println("Bunun İçin Uygun Bir Metod Yok!");

                }
                     if (islem.equals("4")) {
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("İşlem sonucu: " + bolme(a, b));

                }
            }
                    else {
                        System.out.println("Geçersiz İşlem...!");
                    }

                }




        }
    }
}
