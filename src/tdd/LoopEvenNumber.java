package tdd;

public class LoopEvenNumber {
        public static void main(String[] args) {
            int i = 2;
            while (i <= 20) {
                if(i%2==0){
                    System.out.print(i+ " ");
                }
                i++;
            }
        }
}
