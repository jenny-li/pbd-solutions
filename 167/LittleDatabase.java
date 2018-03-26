import java.util.Scanner;

class Student {
  String name;
  int grade;
  int average;
}

class LittleDatabase {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    Student[] studentList = new Student[3];
    
    studentList[0] = new Student();
    System.out.print("Enter the first student's name: ");
    studentList[0].name = in.next();
    System.out.print("Enter the first student's grade: ");
    studentList[0].grade = in.nextInt();
    System.out.print("Enter the first student's average: ");
    studentList[0].average = in.nextInt();
    
    studentList[1] = new Student();
    System.out.print("\nEnter the second student's name: ");
    studentList[1].name = in.next();
    System.out.print("Enter the second student's grade: ");
    studentList[1].grade = in.nextInt();
    System.out.print("Enter the second student's average: ");
    studentList[1].average = in.nextInt();
    
    studentList[2] = new Student();
    System.out.print("\nEnter the third student's name: ");
    studentList[2].name = in.next();
    System.out.print("Enter the third student's grade: ");
    studentList[2].grade = in.nextInt();
    System.out.print("Enter the third student's average: ");
    studentList[2].average = in.nextInt();
    
    System.out.println("\nThe names are: " + studentList[0].name + " " + studentList[1].name + " " + studentList[2].name);
    System.out.println("The grades are: " + studentList[0].grade + " " + studentList[1].grade + " " + studentList[2].grade);
    System.out.println("The averagese are: " + studentList[0].average + " " + studentList[1].average + " " + studentList[2].average);
    
    double mean = (studentList[0].average + studentList[1].average + studentList[2].average) / 3;
    
    System.out.println("\nThe average for the three students is: " + mean);
    
  }
}
