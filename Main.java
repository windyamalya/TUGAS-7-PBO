import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int menu;
        Scanner input = new Scanner(System.in);
        Datapenitip windi = new Datapenitip();
        do {
            System.out.println("-------------------------------------");
            System.out.println("|     PROGRAM PENITIPAN MOTOR        |");
            System.out.println("---------------------------------------");
            System.out.println("1.PENITIPAN MOTOR");
            System.out.println("2.STRUK");
            System.out.println("3.KELUAR");
            System.out.print("MASUKAN PILIHAN ANDA = ");
            menu = input.nextInt();
            if (menu==1){
                windi.setData();
            } else if (menu==2) {
                windi.tampilData();
            }else if (menu==3) {
                System.out.println("TERIMAKASIH !!!!!!!!");
                break;
            }else {
                System.out.println("DATA ERROR 404.!!!!!!");
            }
        }while (menu!=4);
    }
}
