package ui;

import business.Discount;
import business.DiscountDescription;
import business.Employee;
import business.PaymentSystem;
import business.Salary;
import business.SalaryDescription;

public class Main {
    
    public static void main(String[] args){

        PaymentSystem paymentSystem = new PaymentSystem(
            new Employee("Luís Fernando", "1234")
        );

        paymentSystem.getEmployee().getSalaries().add(
            new Salary(
                SalaryDescription.BASE_SALARY, 
                3000
            )
        );

        paymentSystem.getEmployee().getSalaries().add(
            new Salary(
                SalaryDescription.ADDITIONAL_HAZARD, 
                300
            )
        );

        paymentSystem.getEmployee().getSalaries().add(
            new Salary(
                SalaryDescription.ADDITIONAL_SERVICE_TIME, 
                120
            )
        );

        paymentSystem.getEmployee().getSalaries().add(
            new Salary(
                SalaryDescription.OVERTIME_VALUE, 
                50
            )
        );

        /* ******************** */

        paymentSystem.getEmployee().getDiscounts().add(
            new Discount(
                DiscountDescription.IR
            )
        );

        paymentSystem.getEmployee().getDiscounts().add(
            new Discount(
                DiscountDescription.INSS
            )
        );

        paymentSystem.getEmployee().getDiscounts().add(
            new Discount(
                DiscountDescription.FGTS
            )
        );

        /* ******************** */
        System.out.println(paymentSystem.getEmployee().getGrossSalary());
        System.out.println(paymentSystem.getEmployee().getNetSalary());
    }
}
            