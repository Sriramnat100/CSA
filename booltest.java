public class booltest {
    public static void main (String[] args)
    {
        double largest;
        double smaller1;
        double smaller2;
	
        double a = 0.00005;
        double b = 0.00012;
        double c = 0.00013;


        if (a == 0 || b == 0 || c == 0)
        {
            System.out.print(-1);
        }
        if (a >= b && a >= c)
        {
            largest = a;
            smaller1 = b;
            smaller2 = c;
        }
        else if (b >= c  && b >= a)
        {
            largest = b;
            smaller1 = a;
            smaller2 = c;
        }

        else
        {
            if (c >= b && c >= a)
            {
                largest = c;
                smaller1 = a;
                smaller2 = b;
            }
            else
            {
                System.out.print(-1);
                largest = c;
                smaller1 = a;
                smaller2 = b;
            }
        }

        if (smaller1 + smaller2 >= largest)
        {
            if ((smaller1 * smaller1 + smaller2 * smaller2 - (largest * largest)) > 0.0000000000000001 )
            {
                System.out.print(1);
            }
            else if((largest * largest - (smaller1 * smaller1 + smaller2 * smaller2)) <= 0.000000000000000001)
            {
                System.out.print(2);
            }
            else
            {
                System.out.print(3);
            }
        }
        else
        {
            System.out.print(-1);
        }
    }
    
}
