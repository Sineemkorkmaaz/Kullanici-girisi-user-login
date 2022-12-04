import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {
        String sifre, userName, yeniSifre, select;


        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adiniz : ");
        userName = input.nextLine();
        System.out.println("Sifreniz : ");
        sifre = input.nextLine();


        if (userName.equals("sinem") && sifre.equals("sinem1234")) {
            System.out.println("Giris basarili");

        } else if (sifre != "sinem1234" && userName.equals("sinem")) {
            System.out.println("Yanlis sifre");
            System.out.println("Sifrenizi sifirlamak ister misiniz?");
            select = input.nextLine();

            if (select.equals("evet")) {
                System.out.println("yeni sifrenizi giriniz");
                System.out.println("yeni girdiği şifrenin hatalı girdiğin ve\n" +
                        "  unuttuğu şifre ile aynı olmaması gerekir");

                System.out.println("Lutfen yeni sifre giriniz : ");
                sifre = input.nextLine();

                if (sifre.equals("sinem1234")) {

                    System.out.println("Sifre olusturulamadi \nFarkli sifre giriniz");
                    yeniSifre = input.nextLine();
                    System.out.println("sifre olusturuldu");
                }


            }
        }
    }
}