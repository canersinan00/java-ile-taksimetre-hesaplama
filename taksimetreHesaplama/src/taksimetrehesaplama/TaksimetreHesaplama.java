
package taksimetrehesaplama;

import java.util.Scanner;
public class TaksimetreHesaplama {


    public static void main(String[] args) {

        double mesafe,tutar,perKm=2.20;
        int açılışÜcreti=10;
           Scanner scn=new Scanner(System.in);
        System.out.print("Lutfen Gideceginiz Mesafeyi KM Cinsinden Giriniz : ");
        mesafe=scn.nextDouble();
        
        tutar=(mesafe*perKm)+açılışÜcreti;
        tutar=(tutar<20)? 20:tutar;
        System.out.println("Toplam Tutariniz : "+tutar);
        
        
        
        
        
        
        
               
          
         
    }
    
}
