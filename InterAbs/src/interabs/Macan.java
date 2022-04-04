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
class Macan implements Hewan {
     private String namaHewan;

    // create kucing without input parameter
    public Macan() {
        this.namaHewan = "adalah Macan";
    }

    // create kucing with parameter
    public Macan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    @Override
  public void jenis() {
        System.out.println("adalah Macan");
    }
   @Override
  public void suaraHewan() { 
        System.out.println("dengan bunyi p");
    }

@Override
    public String getNamaHewan() {
        return namaHewan;
    }
}
