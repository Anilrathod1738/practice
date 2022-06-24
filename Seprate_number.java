//wap input a number and seprate it

import java.util.*;
class Seprate_number
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number=");
     
   int n=sc.nextInt();
         int i, rem;
      i=n;
  while(i!=0)
     {
        rem=i%10;
       System.out.print(" "+rem);
       i=i/10;
        
         }
            
      }
 }
   