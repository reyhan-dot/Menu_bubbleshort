/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuitem;

/**
 *
 * @author ACER
 */
public class Childclass_Favorit extends Menuclass{
    //sorting dari penjualan terbanyak
    public void favorit(){
        
    String[]nama= namaMenu.clone();
    double[] hrg = harga.clone();
    int[] j = jual.clone();
    
    for (int i = 0; i < j.length - 1; i++) {
        for (int k = 0;k < j.length - i - 1; k++){
            if(hrg[k] > hrg[k + 1]){
                double tempHarga = (double) hrg[k];
                    j[k] = j[k + 1];
                    j[k + 1] = (int) tempHarga;

                    String tempNama = nama[k];
                    nama[k] = nama[k + 1];
                    nama[k + 1] = tempNama;

                    int tempJual = jual[k];
                    jual[k] = jual[k + 1];
                    jual[k + 1] = tempJual;
                }
            }
        }
        System.out.println("\nREKOMENDASI MENU FAVORIT");
        System.out.println("-------------------------------------");

        for (int i = 0; i < nama.length; i++) {
            System.out.println(
                nama[i] +
                " | Terjual: " + jual[i] +
                " | Harga: Rp" + hrg[i]
            );
        }
    }
}
