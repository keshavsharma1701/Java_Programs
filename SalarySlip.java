public class SalarySlip {
      private String empname, designation, department;
      private int empid;
      private double basicsalary, grosssalary, houserentall, medicalall, transportall, pf, profftax, netpay;
      public void takeinput(String name, String designation, String department, int empid, double basicsalary)
      {
            empname= name;
            this.designation= designation;
            this.department = department;
            this.empid= empid;
            this.basicsalary = basicsalary;
            houserentall= basicsalary/2;     //50% of basic salary
            medicalall= basicsalary/4;       //30% of basic salary
            transportall= basicsalary*0.4;   //40% of basic salary
            grosssalary = basicsalary+houserentall+medicalall+transportall;
            pf= basicsalary*0.05;            //5% of basic salary
            profftax= grosssalary*0.1;       //10% of gross salary
            netpay= grosssalary-pf-profftax;
      }
      public void printsalaryslip()
      {
            System.out.println("\n\n\t\t\tSalary Slip");
            System.out.print("\n\nEmployee Name :  ");
            System.out.println(empname);
            System.out.print("Employee ID   :  ");
            System.out.println(empid);
            System.out.print("Designation   :  ");
            System.out.println(designation);
            System.out.print("Department    :  ");
            System.out.println(department);
            System.out.print("\nBasic Salary            :    Rs ");
            System.out.println(basicsalary);
            System.out.print("House Rent Allowence    :    Rs ");
            System.out.println(houserentall);
            System.out.print("Medical Allowence       :    Rs ");
            System.out.println(medicalall);
            System.out.print("Transport Allowence     :    Rs ");
            System.out.println(transportall);
            System.out.print("\nGross Salary            :    Rs ");
            System.out.println(grosssalary);
            System.out.print("\nProvident Fund          :    Rs ");
            System.out.println(pf);
            System.out.print("Professional Tax        :    Rs ");
            System.out.println(profftax);
            System.out.print("\n\nNet Pay                 :    Rs ");
            System.out.println(netpay);
      }

}
