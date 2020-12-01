/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisprakpbo;

/**
 *
 * @author hp
 */
public class formPendaftaran {
    String nik;
    String nama;
    int nilaiTulis;
    int nilaiCoding;
    int nilaiWawancara;
 
    public formPendaftaran(String nik, String nama, int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
        this.nik = nik;
        this.nama = nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
    
    public formPendaftaran(){
        
    }
   
}
