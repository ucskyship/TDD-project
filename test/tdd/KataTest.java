package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int result = calculator.add(2, 6);
        assertEquals(8, result);
        assertEquals(66, calculator.add(54, 12));
    }
    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(4, 2);
        assertEquals(2, result);
    }
    @Test
    public void absoluteSubtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 4);
        assertEquals(2, result);
    }
    @Test
    public void productTest() {
        Kata calculator = new Kata();
        int result = calculator.product(10, 2);
        assertEquals(20, result);
    }
    @Test
    public void quotientTest(){
        Kata calculator = new Kata();
        int result = calculator.quotient(20, 2);
        assertEquals(10, result);
    }
    @Test
    public void quotient2ndTest(){
        Kata calculator = new Kata();
        int result = calculator.quotient(20, 0);
        assertEquals(0, result);
    }
//                              PseudoCode:
//  Given that I have iam a student;
//  When I enter my student score;
//  Output grades as follows:
//      If student score is greater and equal to 90, and student score is lesser or equal to 100, output Grade A;
//      If student score is greater and equal to 80, and student score is lesser than 90, output Grade B;
//      If student score is greater and equal to 70, and student score is less than 80, output Grade C;
//      If student score is greater and equal to 60, and student score is less than 70 output Grade D;
//      If student score is lesser than 60, output Grade F.
    @Test
    public void studentGradeTest(){
        Kata mySchool = new Kata();
        String studentScore = mySchool.getGrade(90);
        assertEquals("Grade A", studentScore);
    }
    @Test
    public void student2ndGradeTest(){
        Kata mySchool = new Kata();
        String studentScore = mySchool.getGrade(80);
        assertEquals("Grade B", studentScore);
    }
    @Test
    public void student3rdGradeTest(){
        Kata mySchool = new Kata();
        String studentScore = mySchool.getGrade(70);
        assertEquals("Grade C", studentScore);
    }
    @Test
    public void student4thGradeTest(){
        Kata mySchool = new Kata();
        String studentScore = mySchool.getGrade(60);
        assertEquals("Grade D", studentScore);
    }
    @Test
    public void student5thGradeTest(){
        Kata mySchool = new Kata();
        String studentScore = mySchool.getGrade(50);
        assertEquals("Grade F", studentScore);
    }
}
