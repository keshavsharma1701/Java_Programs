import java.util.Scanner;
public class Test_Salaryslip {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            SalarySlip emp1 = new SalarySlip();
            System.out.println("Enter Employee Name");
            String name = sc.nextLine();
            System.out.println("Enter Employee ID");
            int id = sc.nextInt();
            System.out.println("Enter Employee Designation");
            String designation = sc.nextLine();
            System.out.println("Enter Employee Department");
            String department = sc.nextLine();
            System.out.println("Enter Employee Basic Salary");
            double basicSalary = sc.nextDouble();
            emp1.takeinput(name, designation, department, id, basicSalary);
            emp1.printsalaryslip();
            sc.close();
      }
}
