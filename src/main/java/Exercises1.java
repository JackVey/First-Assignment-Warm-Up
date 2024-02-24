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
        /*if (rows <= 0)
            return null;
        if (rows == 1) {
            System.out.println('*');
            return null;
        }
        generateTriangle(rows - 1);
        for (int i = 0 ; i < rows ; i++)
            System.out.print('*');
        System.out.println();*/
        char[][] tria = new char[rows][];
        for (int i = 0; i < rows; i++) {
            char[] stars = new char[i + 1];
            for (int j = 0; j <= i ; j++) {
                stars[j] = '*';
            }
            tria[i] = stars;
        }
        return tria;
    }


    public static void main(String[] args) {
        Exercises1 a = new Exercises1();
        char[][] tria = a.generateTriangle(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(tria[i][j]);
            }
            System.out.println();
        }
        /*char[][] tria = new char[2][];
        tria[0] = new char[]{'*'};
        tria[1] = new char[]{'*', '*'};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(tria[i][j]);
            }
            System.out.println();
        }*/
    }

}