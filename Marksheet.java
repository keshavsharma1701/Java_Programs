public class Marksheet {
      private String StudentName;
      private int Rollno, total;
      private int subMarks[]=new int[3];
      private double percentage;
      private char grade;
      void takeinput(String StudentName, int Rollno, int marks[])
      {
            this.StudentName = StudentName;
            this.Rollno = Rollno;
            subMarks = marks;
            total= subMarks[0]+subMarks[1]+subMarks[2];
            percentage= total/3;    //(total/300)*100
            if(percentage>=90)
            {
                  grade='A';
            }
            else if(percentage>=70)
            {
                  grade='B';
            }
            else if(percentage>=60)
            {
                  grade='C';
            }
            else if(percentage>=50)
            {
                  grade='D';
            }
            else if(percentage>=40)
            {
                  grade='E';
            }
            else
            {
                  grade='F';
            }
      }
      void printMarksheet()
      {
            System.out.println("\n\n\t\tStudent Marksheet");
            System.out.print("Name          :  ");
            System.out.println(StudentName);
            System.out.print("Roll No.      :  ");
            System.out.println(Rollno);
            System.out.print("Percentage    :  ");
            System.out.println(percentage);
            System.out.print("Grade         :  ");
            System.out.println(grade);
            System.out.println("\nSubjects\tMarksObtained\tMax Marks\n");
            System.out.print("Subject 1   :\t");
            System.out.print(subMarks[0]);
            System.out.println("\t\t100");
            System.out.print("Subject 2   :\t");
            System.out.print(subMarks[1]);
            System.out.println("\t\t100");
            System.out.print("Subject 3   :\t");
            System.out.print(subMarks[2]);
            System.out.println("\t\t100");
            System.out.print("\nTotal       :\t");
            System.out.print(total);
            System.out.println("\t\t300");
      }
}
