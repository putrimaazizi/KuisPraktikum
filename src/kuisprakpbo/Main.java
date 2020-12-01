/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisprakpbo;
import java.util.Scanner;
/**
 *
 * @author zizi
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        char pilih2;
        
        String nik;
        String nama;
        int nilaiTulis;
        int nilaiCoding;
        int nilaiWawancara;
       
            System.out.println("FORM PENDAFTARAN PT.ALFA");
            System.out.println("1. Android Development ");
            System.out.println("2. Web Development ");
            System.out.print("Pilih Jenis Form : ");
            pilih = input.nextInt();
           
            System.out.println("");
            System.out.println("FORM PENDAFTARAN");
            System.out.println("");
                    
            System.out.print("Input NIK : ");
            nik = input.nextLine();
        
            System.out.print("Input Nama : ");
            nama = input.nextLine();
                    
            System.out.print("Input Nilai Tes Tulis : ");
            nilaiTulis = input.nextInt();
                    
            System.out.print("Input Nilai Tes Coding : ");
            nilaiCoding = input.nextInt();
                    
            System.out.print("Input Nilai Tes Wawancara : ");
            nilaiWawancara = input.nextInt();
                    
            formPendaftaran pendaftaran = new formPendaftaran(nik, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
            web Web = new web();
            android Android = new android();
            
            switch(pilih){
                case '1' : {
                    int menu;
                    while(true){ 
                        System.out.println("Menu ");
                        System.out.println("1. Edit");
                        System.out.println("2. Tampil");
                        System.out.println("3. Exit");
                        System.out.print("Pilih : ");
                        menu = input.nextInt();
                        if(menu == 1){ 
                                Scanner edit = new Scanner(System.in);
                                System.out.println("FORM EDIT");
                                System.out.print("Input Nilai Tes Tulis : ");
                                pendaftaran.nilaiTulis = edit.nextInt();
                    
                                System.out.print("Input Nilai Tes Coding : ");
                                pendaftaran.nilaiCoding = edit.nextInt();
                    
                                System.out.print("Input Nilai Tes Wawancara : ");
                                pendaftaran.nilaiWawancara = edit.nextInt();
                        }else if(menu == 2){ 
                                Android.tampil();  
                        }else if(menu == 3){ 
                            System.exit(0);
                        }
                    }
                    break;
                }
                case '2' : {
                    int menu2;
                    while(true){
                        System.out.println("Menu ");
                        System.out.println("1. Edit");
                        System.out.println("2. Tampil");
                        System.out.println("3. Exit");
                        System.out.print("Pilih : ");
                        menu2 = input.nextInt();
                        if(menu2 == 1){ 
                                Scanner edit = new Scanner(System.in);
                                System.out.println("FORM EDIT");
                                System.out.print("Input Nilai Tes Tulis : ");
                                pendaftaran.nilaiTulis = edit.nextInt();
                    
                                System.out.print("Input Nilai Tes Coding : ");
                                pendaftaran.nilaiCoding = edit.nextInt();
                    
                                System.out.print("Input Nilai Tes Wawancara : ");
                                pendaftaran.nilaiWawancara = edit.nextInt();
                        } else if(menu2 == 2){
                                Web.tampil();
                        } else{
                                System.exit(0);
                        }
                    }
                    break;
                }
                default: System.out.println("salah input");
            } 
    }  
}
