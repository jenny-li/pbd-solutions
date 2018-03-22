import java.util.Scanner;

class Student {
  String name;
  int grade;
  int average;
}

class BasicRecords {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    Student s1 = new Student();
    System.out.print("Enter the first student's name: ");
    s1.name = in.next();
    System.out.print("Enter the first student's grade: ");
    s1.grade = in.nextInt();
    System.out.print("Enter the first student's average: ");
    s1.average = in.nextInt();
    
    Student s2 = new Student();
    System.out.print("\nEnter the second student's name: ");
    s2.name = in.next();
    System.out.print("Enter the second student's grade: ");
    s2.grade = in.nextInt();
    System.out.print("Enter the second student's average: ");
    s2.average = in.nextInt();
    
    Student s3 = new Student();
    System.out.print("\nEnter the third student's name: ");
    s3.name = in.next();
    System.out.print("Enter the third student's grade: ");
    s3.grade = in.nextInt();
    System.out.print("Enter the third student's average: ");
    s3.average = in.nextInt();
    
    System.out.println("\nThe names are: " + s1.name + " " + s2.name + " " + s3.name);
    System.out.println("The grades are: " + s1.grade + " " + s2.grade + " " + s3.grade);
    System.out.println("The averages are: " + s1.average + " " + s2.average + " " + s3.average);
    
    double mean = (s1.average + s2.average + s3.average) / 3;
    
    System.out.println("\nThe average for the three students is: " + mean);
    
  }
}
