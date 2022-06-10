
package com.mehmetygt.paket1;


public class Main {
    public static void main(String[] args) {
        Araba1 a1=new Araba1();
        System.out.println(" arabab1 a nın marka: "+a1.getMarka());
        
       //burda public olan araba1 e ve dolaysıyla methodlarına kendi paketinden rahatca ulaşabiliyoruz
        System.out.println("************************");
       
        Araba2 a2=new Araba2();
        System.out.println(" arabab2 a2 nın marka: "+a2.getMarka());
        //burda default olan araba1 e ve dolaysıyla methodlarına kendi paketinden rahatca ulaşabiliyoruz
    }
    
}
