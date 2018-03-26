import java.util.Scanner;

class Student {
  String name;
  int grade;
  int average;
}

class LittleDatabaseLoop {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    Student[] studentList = new Student[3];
    
    double sum = 0;
    
    for (int i = 0; i < 3; i++) {
      studentList[i] = new Student();
      System.out.print("Enter student " + (i + 1) + "'s name: ");
      studentList[i].name = in.next();
      System.out.print("Enter student " + (i + 1) + "'s grade: ");
      studentList[i].grade = in.nextInt();
      System.out.print("Enter student " + (i + 1) + "'s average: ");
      studentList[i].average = in.nextInt();
      
      sum = sum + studentList[i].average;
    }

    
    System.out.println("\nThe names are: " + studentList[0].name + " " + studentList[1].name + " " + studentList[2].name);
    System.out.println("The grades are: " + studentList[0].grade + " " + studentList[1].grade + " " + studentList[2].grade);
    System.out.println("The averages are: " + studentList[0].average + " " + studentList[1].average + " " + studentList[2].average);
    
    double mean = sum / 3;
    
    System.out.println("\nThe average for the three students is: " + mean);
    
  }
}
