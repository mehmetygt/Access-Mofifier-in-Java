
package com.mehmetygt.paket2;

import com.mehmetygt.paket1.Araba1;
//import com.mehmetygt.paket1.Araba2;


public class Main { 
    public static void main(String[] args) {
        Araba1 a1=new Araba1();
        System.out.println(" arabab1 a nın rengi: "+a1.getRenk());
        
       /*burda da public olan araba1 e ve dolaysıyla methodlarına 
        farklı bir paketten import ederek rahatca ulaşabiliyoruz*/
       
       
      /*  
       // ama burada default olan araba2 clasını java import ettiği halde  kullanamıyoruz.
       
       Araba2 a2=new Araba2();
        System.out.println(" arabab1 a nın Marka: "+a1.getMarka());
    */
}}
