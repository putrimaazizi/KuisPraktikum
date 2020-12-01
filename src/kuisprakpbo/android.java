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
public class android extends formPendaftaran implements Interface{

    public android(String nik, String nama, int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
        super(nik, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
    }
    
    public android(){
        
    }
    
    @Override
    public double nilaiAkhir(){
        return ((0.2*nilaiTulis)+(0.5*nilaiCoding)+(0.3*nilaiWawancara));
    }
    
    @Override
    public void tampil(){
        System.out.println("Nilai Akhir : " + nilaiAkhir());
        if(nilaiAkhir()>=85){
            System.out.println("KETERANGAN : LOLOS");
            System.out.println("Selamat kepada " + nama + " telah diterima sebagai Android");
        } else {
            System.out.println("KETERANGAN : GAGAL");
            System.out.println("Mohon maaf kepada " + nama + " telah ditolak sebagai Android");
        }  
    }
}
