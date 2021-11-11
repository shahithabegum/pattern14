import java.util.*;
class pattern20	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j,k;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
           for(i = 1; i <= n; i++)
         {
          
        // Inner loop print space
             for(j = 1; j >i; j--)
            {
               System.out.print(" ");
            }
          
        // Inner loop print star
            for(k= 1; k<=i; k++)
              {
	System.out.print("k");
	}
        // Ending line after each row
        System.out.println("");
    } 
       }
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
