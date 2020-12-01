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
public class web extends formPendaftaran implements Interface{

    public web(String nik, String nama, int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
        super(nik, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
    }
    
    public web(){
        
    }
    
    @Override
    public double nilaiAkhir(){
        return ((0.4*nilaiTulis)+(0.35*nilaiCoding)+(0.25*nilaiWawancara));
    }
    
    @Override
    public void tampil(){
        System.out.println("Nilai Akhir : " + nilaiAkhir());
        if(nilaiAkhir()>=85){
            System.out.println("KETERANGAN : LOLOS");
            System.out.println("Selamat kepada " + nama + "telah diterima sebagai Web");
        } else {
            System.out.println("KETERANGAN : GAGAL");
            System.out.println("Mohon maaf kepada " + nama + "telah ditolak sebagai Web");
        }  
    }
}
