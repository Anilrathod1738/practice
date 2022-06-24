/* 3:WAP  calculate simple interest for 3 years , Amount rate and time inputted by user.

       Year :1 
                     
                     Amount=
                    Rate=
                   Interest:
                 Total Payable Amount=( Amunt+ Interest)


         Year : 2
                     
                     Amount=
                    Rate=
                   Interest:
                 Total Payable Amount=( Amunt+ Interest)


            Year :3 
                     
                     Amount=
                    Rate=
                   Interest:
                 Total Payable Amount=( Amunt+ Interest)*/

import java.util.*; 
class simple_intrest
 {
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
    System.out.print("Enter the amount=");
   double A=sc.nextDouble();
    System.out.print("Enter the Rate=");
      double R=sc.nextDouble();
   int i=1;
       while(i<=3)
           {
             if(i==1)
              {
                  System.out.println("year:1");
                 double SI=(A*R*1)/100;
                System.out.println("Principal amount is="+A);
                System.out.println("Rate of intrest is="+R);
                System.out.println("intrest amount is="+SI);
                double T=SI+A;
                 System.out.println("total payable amount is="+T);
                 }
              else if(i==2)
              {
                  System.out.println("year:2");
                 double SI=(A*R*2)/100;
                System.out.println("Principal amount is="+A);
                System.out.println("Rate of intrest is="+R);
                System.out.println("intrest amount is="+SI);
                double T=SI+A;
                 System.out.println("total payable amount is="+T);
                 }
                  else if(i==3)
              {
                  System.out.println("year:3");
                 double SI=(A*R*3)/100;
                System.out.println("Principal amount is="+A);
                System.out.println("Rate of intrest is="+R);
                System.out.println("intrest amount is="+SI);
                double T=SI+A;
                 System.out.println("total payable amount is="+T);
                 }
            i++;
            }
       }
 }
          
                

    


