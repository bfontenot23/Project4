public class Utilities {


    public static void main(String[] args)
    {
        System.out.printf("%-10s%-15s%-20s%-10s\n", "x", "fib(x)", "Recursive(ns)", "Iterative(ns)");
        System.out.println("==========================================================");
        for(int i = 10; i <= 50; i += 10)
        {
//Calculate time in nano second for recursive Fibonacci
            long start= System.nanoTime();
            Utilities.recursiveFib(i);
            long elapsedRec = System.nanoTime() - start;
//Calculate time in nano second for iterative Fibonacci
            start= System.nanoTime();
            long feb = Utilities.iterativeFib(i);
            long elapsedIter = System.nanoTime() - start;
            System.out.printf("%-10d%-15d%,-20d%,-10d\n",i, feb, elapsedRec, elapsedIter);
        }
        System.out.println("==========================================================");
    }

    private static long iterativeFib(int n)
    {
        if (n <= 2)
            return 1;
        else {
            long older = 1;
            long old = 1;
            long current = 1;

            for (int i = 3; i <= n; i++)
            {
                current = old + older;
                older = old;
                old = current;
            }
            return current;
        }
    }

    private static int recursiveFib(int n)
    {
        if (n <= 2)
            return 1;
        else
            return recursiveFib(n-1) + recursiveFib(n-2);
    }
}
