package all.q6;

import java.util.*;
class Swap
{
    public static void main(String a[])
    {
        int x = 10;
        int y = 20;
        System.out.println("before swapping numbers: "+x +" "+ y);
        /*Swapping*/
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: "+x +"  " + y);
    }
}