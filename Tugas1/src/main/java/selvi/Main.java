/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selvi;

import static java.lang.System.exit;
import java.util.Scanner;
import selvi.konversi;
/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
     
        int pilih = 0;
        int celcius, fahrenheit, kelvin, reamur;
        boolean choose = true;
        Scanner input = new Scanner (System.in);
        
        System.out.println("~~~~~~~~~~~~");
        System.out.println("Nama : Selvi");
        System.out.println("Kelas : IF-E");
        System.out.println("~~~~~~~~~~~~");
        System.out.println("+-------------------------+");
        System.out.println("|PROGRAM KONVERSI SUHU AIR|");
        System.out.println("+-------------------------+");
        System.out.println("Input Data");
        System.out.println("-----------");
        System.out.print("Suhu Dalam Celius : ");
        celcius = input.nextInt();
        
        konversi suhu = new konversi(celcius);
        do{
          System.out.println("");
            System.out.println("Opsi");
            System.out.println("1.Lihat Data Koversi");
            System.out.println("2.Edit Data Konversi");
            System.out.println("3.Exit");
            System.out.print("pilih : ");
            pilih = input.nextInt();
            
            if (pilih==1){
                suhu.simpan();
            }
            else if (pilih==2){
                System.out.println("Input Data");
                System.out.println("-----------");
                System.out.print("Suhu Dalam Celcius : ");
                suhu.celcius=input.nextInt();
            }
            else if (pilih==3){
                System.exit(0);
            }
            else {
             System.out.println("Opsi tidak ada, Mohon masukkan opsi dengan benar :(");
             choose=true;
            }
            }while(choose=true);
            
    }
    
}
