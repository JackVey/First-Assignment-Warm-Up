public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        if (n == 0)
            return 1;
        return factorial(n - 1) * n;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        if (rows == 1) {
            System.out.println('*');
            return null;
        }
        generateTriangle(rows - 1);
        for (int i = 0 ; i < rows ; i++)
            System.out.print('*');
        System.out.println();
        return null;
    }


    public static void main(String[] args) {
        Exercises1 a = new Exercises1();
        System.out.print(a.generateTriangle(6));
    }

}