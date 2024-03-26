package PackageLCD;

import java.util.Scanner;

public class MainLCD {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        LCD LCD1 = new LCD();

        LCD1.display();

        System.out.println("==================================================");
        System.out.println("-                   SET UP LCD                   -");
        System.out.println("==================================================");

        System.out.println("Menu : ");
            System.out.println("1. Hidupkan LCD " );
            System.out.println("2. Matikan LCD ");
            System.out.println("3. Freeze LCD");
            System.out.println("4. Set Volume LCD");
            System.out.println("5. Set Kecerahan LCD");
            System.out.println("6. Set Kabel LCD");
            System.out.println("7. Naikkan Volume");
            System.out.println("8. Turunkan Volume");
            System.out.println("9. Naikkan Kecerahan");
            System.out.println("10. Turunkan Kecerahan");
            System.out.println("11. Tampilkan Status LCD");

        while (!exit) {
            

            System.out.print("Pilih Menu : ");
            int angka = sc.nextInt();

            switch (angka) {
                case 1:
                    LCD1.turnOn();
                    break;
                
                case 2:
                    LCD1.turnOn();
                    break;
                
                case 3:
                    LCD1.freeze();
                    break;
                
                case 4:
                    System.out.print("Masukkan volume yang anda inginkan : ");
                    LCD1.setVolume(sc.nextInt());
                    break;
                
                case 5:
                    System.out.print("Masukkan kecerahan yang anda inginkan : ");
                    LCD1.setBrightness(sc.nextInt());
                    break;
                
                case 6:
                    System.out.print("Masukkan kabel yang ingin anda pasang : ");
                    LCD1.setCable(sc.next());
                    break;
                
                case 7 :
                    LCD1.volumeUp();
                    break;
                
                case 8:
                    LCD1.volumeDown();
                    break;
                case 9:
                    LCD1.brightnessUp();
                    break;
                
                case 10:
                    LCD1.brightnessDown();
                    break;
                
                case 11 :
                System.out.println();
                System.out.println();
                    LCD1.display();
                
                System.out.println();
                    exit = true;
                    break;
            
                default:
                    break;
            }

        }
        




        


        



    }
    
}
