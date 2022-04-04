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
class Kambing implements Hewan {
     private String namaHewan;

    // create kucing without input parameter
    public Kambing() {
        this.namaHewan = "adalah Kambing";
    }

    // create kucing with parameter
    public Kambing(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    @Override
  public void jenis() {
        System.out.println("adalah kambing");
    }
   @Override
  public void suaraHewan() { 
        System.out.println("dengan bunyi k");
    }

@Override
    public String getNamaHewan() {
        return namaHewan;
    }
}
