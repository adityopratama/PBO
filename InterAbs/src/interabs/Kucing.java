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
class Kucing implements Hewan {
     private String namaHewan;

    // create kucing without input parameter
    public Kucing() {
        this.namaHewan = "adalah Kucing";
    }

    // create kucing with parameter
    public Kucing(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    @Override
  public void jenis() {
        System.out.println("adalah kucing");
    }
   @Override
  public void suaraHewan() { 
        System.out.println("dengan bunyi Miaw miau");
    }

@Override
    public String getNamaHewan() {
        return namaHewan;
    }
}
