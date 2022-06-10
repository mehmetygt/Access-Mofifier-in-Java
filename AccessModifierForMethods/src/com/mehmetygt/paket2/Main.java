
package com.mehmetygt.paket2;

import com.mehmetygt.paket1.Araba1;
import com.mehmetygt.paket1.Araba2;
import com.mehmetygt.paket1.Araba3;
import com.mehmetygt.paket1.Hayvan;



public class Main { 
    public static void main(String[] args) {
       Araba1 a1=new Araba1();
        System.out.println(" arabab1 a1 nın modeli: "+a1.model);
        
       //burda public olan araba1 in özelliği public olduğundan farklı bir paketten erişiebiliyorum
        System.out.println("************************");
       
        Araba2 a2=new Araba2();
      //  System.out.println(" arabab2 a2 nın rengi: "+a2.renk);
        //burda public olan araba1 in özelliği private olduğu farklı bir paketten erişemiyoruz
        
         Araba3 a3=new Araba3();
       // System.out.println(" arababa3 a3 nın model: "+a3.model);
        //burda public olan araba1 in özelliği default aynı paket olduğu için farklı bir clasttan direk eişemiyoruz
        
        Hayvan hayvan =new Hayvan("hektor");
       // System.out.println("hayvanın ismi :"+hayvan.isim);
      /*farklı pakette olduğundan dolayı hayvan clasınını
        protacted olan öxelliğinne farklı bir paketten erişemiyorum*/
        System.out.println("***");
    At at=new At("attt");
    at.ismini_soyle();
      
}}
