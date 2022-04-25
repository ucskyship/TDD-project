package tdd;

public class Kata {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber){
            return secondNumber - firstNumber;
        }
        return firstNumber - secondNumber;
    }

    public int quotient(int firstNumber, int secondNumber) {
        if (secondNumber == 0){
            return 0;
        }
        return firstNumber/secondNumber;
    }

    public int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
