package com.Practice.EmployeeWageComputationProblem;

public class EmployeeWageBuilderUC5 {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int NUM_OF_WORKING_DAYS=2;
    public static void main(String[] args) {
        int empHour=0;
        int empWage=0;
        int totalEmployeWage=0;
        for(int day=0;day<NUM_OF_WORKING_DAYS;day++){
            int empCheck=(int)Math.floor(Math.random()*10)%3;
            switch(empCheck){
                case IS_PART_TIME:empHour=4;break;
                case IS_FULL_TIME:empHour=8;break;
                default:empHour=0;
            }
            empWage=empHour*EMP_RATE_PER_HOUR;
            totalEmployeWage=totalEmployeWage+empWage;
            System.out.println("Employee wage: "+empWage);
        }
        System.out.println("Total Employee wage: "+totalEmployeWage);
    }
}
