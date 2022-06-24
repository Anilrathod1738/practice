/*1: WAP  print the total sum of square  from 1 to 10;
  Number   Square


Total            Value */

 class Sum_square
  {
    public static void main(String[]args)
     {
        
        int i=1, sum=0;
        System.out.println("\t\t\tnumber   square=");
         while(i<=10)
            {
                
              
                 int s=i*i;
               System.out.println("\t\t\t"+i+"         "+s);
               sum= sum+s;
                
                 
                i++;
              }
         System.out.println("\t\t\tTotal\t"+sum);
          
 }

   }