package be.intecbrussel.dynamic;


public class Factorial {
    public int getFactorial(int number) {
        if (number < 2) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }
}
