import java.util.*;
class A
{
    public static void main(String [] args)
    {
        Calendar c1=Calendar.getInstance();
        c1.set(1998,1, 27 );
        Calendar c2=Calendar.getInstance();
        c2.set(2019,11,12);

        Date d1=c1.getTime();
        Date d2=c2.getTime();
 
        long diff=d2.getTime()-d1.getTime();
        int noofdays=(int)(diff/(1000*24*60*60));
        System.out.println(noofdays);
    }
}