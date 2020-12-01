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
    
    double nilaiAkhir(){
        return ((0.2*nilaiTulis)+(0.5*nilaiCoding)+(0.3*nilaiWawancara));
    }
    
    void tampil(){
        System.out.println("Nilai Akhir : " + nilaiAkhir());
        if(nilaiAkhir()>=85){
            System.out.println("KETERANGAN : LOLOS");
            System.out.println("Selamat kepada " + nama + " telah diterima sebagai Android");
        } else {
            System.out.println("KETERANGAN : GAGAL");
            System.out.println("Mohon maaf kepada " + nama + " telah ditolak sebagai Android");
        }  
    }
    
    double nilaiAkhir2(){
        return ((0.4*nilaiTulis)+(0.35*nilaiCoding)+(0.25*nilaiWawancara));
    }
    
    void tampil2(){
        System.out.println("Nilai Akhir : " + nilaiAkhir2());
        if(nilaiAkhir()>=85){
            System.out.println("KETERANGAN : LOLOS");
            System.out.println("Selamat kepada " + nama + "telah diterima sebagai Web");
        } else {
            System.out.println("KETERANGAN : GAGAL");
            System.out.println("Mohon maaf kepada " + nama + "telah ditolak sebagai Web");
        }  
    }
}
