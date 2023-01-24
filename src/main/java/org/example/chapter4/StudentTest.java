package org.example.chapter4;
//Creates and test Student object
public class StudentTest {
    public static void main(String[] args) {
        Student account1 = new Student("Tunde Yusuf", 94.5);
        Student account2 = new Student ("Lovely Amanda", 72.7);
    System.out.printf("%s's letter grade is: %s\n", account1.getName(),account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s\n",account2.getName(),account2.getLetterGrade());
    }
}//end class
