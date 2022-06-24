/*WAP find the difference between even and odd number  from 201 to 400;
    Total Even Number :
    Total Odd Number :
     Difference 
    Count of Even Number  :
    Count of Odd Number:*/

 class Difference
 {
  public static void main(String[]args)
  {
    int i=201,sum=0,count=0,s=0,O=0;
   
   while(i<=400)
        {
          if(i%2==0)
           {
           
             sum=sum+i;
             count++;
           }
            else
               {
                    s=s+i;
                   O++;
               }
                   
          i++;
         }
                          System.out.println("Total Even Number = "+sum);
			System.out.println("Total Odd Number = "+s);
			int diff = sum-s;
			System.out.println("Difference = "+diff);
			System.out.println("Total Even Number = "+count);
			System.out.println("Total Odd Number = "+O);           



      }
  }