package all.q7;



class squares
{
    static void printSquares(int n)
    {

        int square = 0, prev_x = 0;


        for (int x = 0; x < n; x++)
        {
            square = (square + x + prev_x);

            System.out.print( square + " ");
            prev_x = x;
        }
    }

    // Driver Code
    public static void main (String[] args)
    {
        int n = 10;
        printSquares(n);
    }
}
