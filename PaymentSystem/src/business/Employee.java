package business;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    
    private String name;
    private String cpf;
    private List<Salary> salaries;
    private List<Discount> discounts;
    private double netSalary;
    private double grossSalary;

    public Employee(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
        this.salaries = new ArrayList<Salary>();
        this.discounts = new ArrayList<Discount>();
        this.netSalary = 0;
        this.grossSalary = 0;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public double getGrossSalary(){
        for (Salary salary : this.getSalaries()) {
            this.setGrossSalary(this.grossSalary + salary.getValue());
        }
        return grossSalary;
    }

    private void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getNetSalary() {
        this.setNetSalary(this.grossSalary);

        for (Discount discount : getDiscounts()) {
            if(discount.getDescription() == DiscountDescription.IR){

                if(this.netSalary > 1058.0f && this.netSalary <= 2115.0f){
                    this.setNetSalary(this.netSalary - (this.netSalary * 0.15));
                }else if(this.netSalary > 2115.0f){
                    this.setNetSalary(this.netSalary - (this.netSalary * 0.275));
                }
                
            }else if(discount.getDescription() == DiscountDescription.INSS){

                if(this.netSalary < 720.0f){
                    this.setNetSalary(this.netSalary - (this.netSalary * 0.765));
                }else if(this.netSalary > 720.0f && this.netSalary <= 1200.0f){
                    this.setNetSalary(this.netSalary - (this.netSalary * 0.900));
                }else if(this.netSalary > 1200.0f && this.netSalary <= 2400.0f){
                    this.setNetSalary(this.netSalary - (this.netSalary * 0.1100));
                }else{
                    this.setNetSalary(this.netSalary - 264.00);
                }

            }else if(discount.getDescription() == DiscountDescription.FGTS){
                this.setNetSalary(this.netSalary - (this.netSalary * 0.8));
            }
        }
        return netSalary;
    }

    private void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
    
}
