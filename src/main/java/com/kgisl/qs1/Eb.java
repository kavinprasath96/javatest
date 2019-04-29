package com.kgisl.qs1;

import java.util.Scanner;



/**
 * Eb
 */
public class Eb {

  



    public static void main(String[] args) {

        float Amount,charge;         
          float total=0;

         System.out.println("Customer Id");
         Scanner s= new Scanner(System.in);
         int id=s.nextInt();

         System.out.println("Customer Name");
         String name=s.next();

         System.out.println("Unit Consumed");
         float unit=s.nextFloat();

        //  System.out.println("surcharge");
        // float total=unit;
        

if(unit <= 199)
{
   
    System.out.println("Amount Charges @Rs. 1.2 per unit :"+ (unit*1.2+100));
            
}
else if (unit >200 && unit<=400)
{
    

    System.out.println("Amount Charges @Rs. 1.5 per unit :"+ ((100*1.2)+(100*1.5)+(unit-200)*1.5+100+"Including Minimum Charge Rs:100"));
}
else if(unit >400 && unit <= 600)
{
  

    System.out.println("Amount Charges @Rs. 1.8 per unit :"+((100*1.2)+(300*1.5)+(unit-400)*1.8+100+" Including Minimum Charge Rs:100"));
// total amount=15/100;
}
else if(unit >=600)
{
        //     Amount = unit * 2;
        //     charge = Amount * (15 / 100);
        // float tt=charge + Amount;
        // total=tt;
        //     System.out.println("Surcharge :"+total);
            

System.out.println("Amount Charges @Rs. 2.00 per unit :"+ ((100*1.2)+(500*1.5)+(unit-600)*2+100+" Including Minimum Charge Rs:100"));//*15/100);
}
// if(total >= 400) {
//             float d = total*(15 / 100);
//     System.out.println("Surcharge :"+d);

// }



}
}