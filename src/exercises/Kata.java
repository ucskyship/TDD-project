package exercises;

public class Kata {

    public Kata() {
    }

    public static int noOfFactorsOf(int number) {
        int factors = 0;
        int i = 0;
        while(i <= number) {
            if (number % i == 0) factors++;
            i++;
        }
        return factors;
    }

    public static boolean isPrime(int number) {
        if (noOfFactorsOf(number) == 2) return true;
        return false;
    }

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

    public String getGrade(double studentScore) {
        if (studentScore >= 90 && studentScore <= 100){
            return "Grade A";
        }
        if (studentScore >= 80 && studentScore < 90){
            return "Grade B";
        }
        if (studentScore >= 70 && studentScore < 80){
            return "Grade C";
        }
        if (studentScore >= 60 && studentScore < 70){
            return "Grade D";
        }
        if (studentScore < 60){
            return "Grade F";
        }
        return null;
    }
}
