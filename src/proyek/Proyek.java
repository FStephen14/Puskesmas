/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Proyek {

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
	        Scanner input = new Scanner (System.in);
	        System.out.println(" ----------------------------------------------");
	        System.out.println("|               PUSKESMAS STIKI                |");
	        System.out.println(" ----------------------------------------------");
	        System.out.println("Masukkan Jumlah Pasien :");
	        System.out.println("------------------------");
	        int a = input.nextInt();
	        	int poli;
	        	double administrasi = 20000;
	        	double biaya = 0;
	        	int jenisberobat;
	        	String jeke = "";
	            String [] pasien = new String[a];  
	            String [] jk = new String[a];  
	            int [] umur = new int[a];  
	            String [] berobat = new String [a];  
	            Scanner kun = new Scanner (System.in);  
	            for(int h = 0 ; h < a; h++){  
	                System.out.println("Masukkan Nama Pengunjung :");  
	                pasien[h] = kun.next();  
	                System.out.println("Jenis Kelamin (P/L) :");  
	                jk[h] = kun.next();
	                if (jeke == "P"){
	                	jk[h] = "Perempuan";
	                }else if (jeke == "L"){
	                	jk[h] = "Laki-Laki";
	                }  
	                System.out.println("Usia :");  
	                umur[h] = kun.nextInt();         
	                System.out.println("Berobat Ke Poli :");
	                System.out.println("1. Umum");
	                System.out.println("2. Anak");
	                System.out.println("3. Gigi");
	                System.out.println("4. THT");
	                System.out.println("-----------------");
	                poli = kun.nextInt();
	                System.out.println("-----------------");
	                if (poli == 1){
	                	berobat[h] = "UMUM";
	                }else if (poli == 2){
	                	berobat[h] = "ANAK";
	                }else if (poli == 3){
	                	berobat[h] = "GIGI";
	                }else if (poli == 4){
	                	berobat[h] = "THT";	                
	                }
	                System.out.println("Jenis Berobat :");
	                System.out.println("1. Konsultasi");
	                System.out.println("2. Check Up");
	                System.out.println("3. Kontrol");
	                System.out.println("-----------------");
	                jenisberobat = kun.nextInt();
	                System.out.println("-----------------");
	                if (jenisberobat == 1){
	                	biaya = biaya + administrasi + 35000;     
	                }else if (jenisberobat == 2){
	                	biaya = biaya + administrasi + 50000;
	                }else if (jenisberobat == 3){
	                	biaya = biaya + administrasi + 45000;
	                }
	                System.out.println("Rincian Berobat");
	                System.out.println("-----------------");
	                System.out.println("Nama            : "+pasien[h]);
	                System.out.println("Jenis Kelamin   : "+jk[h]);
	                System.out.println("Umur            : "+umur[h]);
	                System.out.println("Berobat Ke Poli : "+berobat[h]);
	                System.out.println("===================================");
	                System.out.println("Total Biaya : "+biaya);  
	                }
	            }
    
}
