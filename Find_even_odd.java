//In the above Question find the sum of Even and Odd Numbers

class Find_even_odd
{
 public static void main(String[]args)
 {
   int n=34567834;
   int i,rem,sum=0,odd=0;
      i=n;
  while(i!=0)
     {
         rem=i%10;
            if(rem%2==0)
             sum= sum+rem;
               else
                 odd=odd+rem;
          i=i/10;
        }
           System.out.println("sum of even number is ="+sum);
           System.out.println("sum of even number is= "+odd);
         }
    } 