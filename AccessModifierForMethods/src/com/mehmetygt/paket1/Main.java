
package com.mehmetygt.paket1;


public class Main {
    public static void main(String[] args) {
        Araba1 a1=new Araba1();
        System.out.println(" arabab1 a1 nın marka: "+a1.marka);
        
       //burda public olan araba1 in özelliği public olduğundan erişiebiliyorum
        System.out.println("************************");
       
        Araba2 a2=new Araba2();
      //  System.out.println(" arabab2 a2 nın rengi: "+a2.renk);
       //burda public olan araba1 in özelliği private olduğu için farklı bir clasttan direk erişemiyoruz
        
             System.out.println("************************");
             
        Araba3 a3=new Araba3();
        System.out.println(" arababa3 a3 nın model: "+a3.model);
        //burda public olan araba1 in özelliği default aynı paket olduğu için farklı bir clasttan direk eişebiliyoruz
        
        
        
        Hayvan hayvan =new Hayvan("hektor");
        System.out.println("hayvanın ismi :"+hayvan.isim);
        // aynı pakette olduğumdan dolyı hayvan clasının protacted olan özelliğine erişebiliyorum.
    }
    
}
