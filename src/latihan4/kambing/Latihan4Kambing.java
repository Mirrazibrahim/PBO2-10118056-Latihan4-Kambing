/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.kambing;

/**
 *
 * @author 
 * NAMA     : Mirrazibrahim
 * KELAS    : IF-2
 * NIM      : 10118056
 * Deskripsi Program : Program ini berisi program untuk menampilkan jumlah kambing
 */
public class Latihan4Kambing {
    
    public void tambahKambing() {
    //deklarasi variabel lokal
    int jumlahKambing = 0;
    
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah Kambing setelah ditambah:" + jumlahKambing);        
    }
    
    public static void main(String[] args) {
        Latihan4Kambing kambingJantan = new Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
}
    

