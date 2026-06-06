/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuitem;

/**
 *
 * @author ACER
 */
public class Menuclass {

    
    protected String[] namaMenu ={
       "menu1","menu2","menu3"
      
    };
    protected double[] harga ={
        5000,7000,2000
    };
    protected int[] jual ={
        12,5,7
    };
    
    public void tampilkanMenu(){
        
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println(
                namaMenu[i] +
                " | Harga: Rp" + harga[i] +
                " | Terjual: " + jual[i]
            );
    }
    }
}
