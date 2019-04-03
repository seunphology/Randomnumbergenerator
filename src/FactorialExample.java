import acm.program.ConsoleProgram;

// I am building a system that computes the factorial of numbers

public class FactorialExample extends ConsoleProgram {

    private static final int MAX_NUM = 10;

    public void run () {

        for (int i = 0; i < MAX_NUM; i++) {
            println(i + "! = " + factorial(i) );
        }
    }

    private int factorial (int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) { /*notice how i is used in the method above also. possible because of 2 reasons :
        first, a curly bracket at the end of a method marks the end of the use of a declared variable. 2ndly, a variable
        of same name can be declared inside every method..without disturbing each other. variables in different methods are local to it.
        */

            result *= i;
        }
        return result;
    }
}

/* when factorial of 2 is to be computed, that is n=2, 1 (result) is multiplied by 1 (first count i) first = 1 and
then goes tru the for loop the 2nd time for i=2(2 here is n) and computes 1 (result) times 2(n). it returns result which
is 2. This result is then what is applied when the method 'factorial' is called as in the first method.

so we have 2!= 2 (as in the 2 we got from the return result)

In essence, this code runs the 2nd method before the 1st.
 */