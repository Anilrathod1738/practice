//ind the sum of a number 34567834

class Sum_of_number
{
  public static void main(String args[])
 {
  
   long n=34567834;
  long i,rem,sum=0L;
    i=n;
     while(i!=0)
        {
              rem=i%10;
             sum=sum+rem;
		i=i/10;
            
              
            
            
          }
           System.out.print("sum of the number is="+sum);
      }
 }
          