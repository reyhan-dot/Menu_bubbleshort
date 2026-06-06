/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuitem;


import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MainMenuItem {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        Menuclass menu = new Menuclass();
        Childclass_Hemat murah = new Childclass_Hemat();
        Childclass_Favorit favorit = new Childclass_Favorit();
        
        int pilihan;
        System.out.println("==== Menu ====");
        menu.tampilkanMenu();
        
        do{
        
            System.out.println("==========");
        System.out.println("Pilihan Type Menu:");
        //dari harga termurah
        System.out.println("1. Pilihan Hemat");
        //dari penjualan terbanyak
        System.out.println("2. Pilihan Puas");
        System.out.println("3. exit");
        
        pilihan = sc.nextInt();
        
        switch(pilihan){
            
            case 1:
                System.out.println("Rekomendasi Menu Hemat");
                murah.hemat();
                break;
                
            case 2:
                System.out.println("Rekomendasi Menu Favorit");
                favorit.favorit();
                break;
                
            case 3:
                System.out.println("Program Selesai");
                
                break;
        }
        
        }while (pilihan !=3);
        Scanner close;
        
    }
    
}
