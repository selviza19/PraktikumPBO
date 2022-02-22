/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selvi;

/**
 *
 * @author ASUS
 */
public class konversi {
  int celcius;
  public konversi(int celcius){
      this.celcius = celcius;
  }
  
  void simpan(){
      System.out.println("Suhu Dalam Celcius :  " + celcius + ".0° C");
      System.out.println("Suhu Dalam Fahrenheit : "+ fahrenheit()+"° F");
      System.out.println("Suhu Dalam Reamur : "+ reamur()+"° R");
      System.out.println("Suhu Dalam Kelvin : "+ kelvin()+" K");
      
      if(celcius <= 0){
          System.out.println("Kondisi air beku");
      }else if(celcius > 0 && celcius < 100){
          System.out.println("Kondisi air normal");
      }else if(celcius >= 100){
          System.out.println("Kondidi air mendidih");
      }
  }

    float fahrenheit() {
      return ((9*celcius)/5)+32;  
    }

    float reamur() {
      return (4*celcius)/5;
    }

    double kelvin() {
      return celcius + 273.15;
    }
 }

