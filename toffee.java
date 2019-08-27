import java.util.*;
public class toffee
{
    public static void main(String[] args)
    {
        int d,r,x,i,cnt=0;
        Scanner sc=new Scanner(System.in);
        d=sc.nextInt();
        for(i=0;i<d;i++)
        {
            int run=0;
            r=sc.nextInt();
            x=sc.nextInt();
            run=((2*22*r)/7);
            if(100*x>=run)
            {
                cnt++;
            }
        }
        System.out.print(cnt);
        
    }
}
