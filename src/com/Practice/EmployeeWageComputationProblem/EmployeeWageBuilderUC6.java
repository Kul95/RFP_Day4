package com.Practice.EmployeeWageComputationProblem;

public class EmployeeWageBuilderUC6 {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int NUM_OF_WORKING_DAYS=2;
    public static final int MAX_HRS_IN_MONTH=10;

    public static void main(String[] args) {
        int empHour=0,totalEmpHrs=0,totalWorkingDays=0;
        while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS){
            totalWorkingDays++;
            int empCheck=(int)Math.floor(Math.random()*10)%3;
            switch(empCheck){
                case IS_PART_TIME:empHour=4;break;
                case IS_FULL_TIME:empHour=8;break;
                default:empHour=0;
            }
            totalEmpHrs=totalEmpHrs+empHour;
            System.out.println("Days: "+totalWorkingDays+" Emp hrs: "+empHour);
        }
        int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
        System.out.println("Total employee wage: "+totalEmpWage);

    }
}
