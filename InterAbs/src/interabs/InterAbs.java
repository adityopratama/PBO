/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interabs;

/**
 *
 * @author Adityo
 */
public class InterAbs {
  public static void main(String[] args) {
    Macan miaw = new Macan("ml");
    Macan miaw2 = new Macan ("m1");
    Kambing mbek = new Kambing ("k");
    Ayam yam = new Ayam ("a");
    

    System.out.println(miaw.getNamaHewan());
    miaw.jenis();
    miaw.suaraHewan();

    System.out.println(miaw2.getNamaHewan());
    miaw.jenis();
    miaw.suaraHewan();

    System.out.println(mbek.getNamaHewan());
    mbek.jenis();
    mbek.suaraHewan();
 
    System.out.println(yam.getNamaHewan());
    yam.jenis();
    yam.suaraHewan();
   
  }
}
