import java.util.Scanner;
public class possible {
    public static void main(String[] args)
    {
        int b=0,c=0,d=0;
        int a1= 0,a2=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        b=((a.length)/2);
        if(b==3)
        {
            for(int i=0;i<a.length-2;i++)
            {
                c=c+a[i];
                a1=c/2;
            }
                System.out.println(a1);
      for(int i=3;i<a.length;i++)
              {
         d=d+a[i];
         a2=d/2;
      }
      System.out.println(a2);
     if(a1==a2)
     {
      System.out.println("yes");  }
       else
     {
         System.out.println("no");
     }
        
    }}
}
