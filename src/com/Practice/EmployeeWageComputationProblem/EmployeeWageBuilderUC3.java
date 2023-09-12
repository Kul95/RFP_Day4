package com.Practice.EmployeeWageComputationProblem;

public class EmployeeWageBuilderUC3 {
    public static void main(String[] args) {
        int IS_PART_TIME=1;
        int IS_FULL_TIME=2;
        int EMP_RATE_PER_HOUR=20;
        int empHours=0;
        int empWage=0;
        double empCheck=Math.floor(Math.random()*10)%3;
        if(empCheck==IS_PART_TIME){
            empHours=4;
            empWage=empHours*EMP_RATE_PER_HOUR;
        }else if(empCheck==IS_FULL_TIME){
            empHours=8;
            empWage=empHours*EMP_RATE_PER_HOUR;
        }else{
            empHours=0;
            empWage=empHours*EMP_RATE_PER_HOUR;
        }
        System.out.println("Emp Wage: "+empWage);
    }
}
