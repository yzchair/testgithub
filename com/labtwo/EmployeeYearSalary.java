package com.labtwo;

abstract class AbstractEmployee {
    abstract double getTotalSalary();
}


class DayEmployee extends AbstractEmployee {
    private double daySalary;
    private double totalSalary;

    public DayEmployee(double daySalary) {
        this.daySalary = daySalary;
    }

    @Override
    public double getTotalSalary() {
        this.totalSalary = 365.0 * daySalary;
        return this.totalSalary;
    }
}


class WeekEmployee extends AbstractEmployee {
    private double weekSalary;
    private double totalSalary;

    public WeekEmployee(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    @Override
    public double getTotalSalary() {
        this.totalSalary = 56.0 * weekSalary;
        return this.totalSalary;
    }
}


class MonthEmployee extends AbstractEmployee {
    private double monthSalary;
    private double totalSalary;

    public MonthEmployee(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public double getTotalSalary() {
        this.totalSalary = 12.0 * monthSalary;
        return this.totalSalary;
    }
}


class Company {
    private DayEmployee[] dEmp; // 日薪员工
    private WeekEmployee[] wEmp; // 周薪员工
    private MonthEmployee[] mEmp; // 月薪员工
    private double totalSalary;

    public Company(DayEmployee[] dEmp, WeekEmployee[] wEmp, MonthEmployee[] mEmp) {
        this.dEmp = new DayEmployee[dEmp.length];
        System.arraycopy(dEmp, 0, this.dEmp, 0, dEmp.length);
        this.wEmp = new WeekEmployee[wEmp.length];
        System.arraycopy(wEmp, 0, this.wEmp, 0, wEmp.length);
        this.mEmp = new MonthEmployee[mEmp.length];
        System.arraycopy(mEmp, 0, this.mEmp, 0, mEmp.length);
    }

    public double getTotalSalary() {
        for (DayEmployee d : this.dEmp)
            this.totalSalary += d.getTotalSalary();
        for (WeekEmployee w : this.wEmp)
            this.totalSalary += w.getTotalSalary();
        for (MonthEmployee m : this.mEmp)
            this.totalSalary += m.getTotalSalary();

        return this.totalSalary;
    }
}


public class EmployeeYearSalary {
    public static void main(String[] args) {

        DayEmployee[] dEmp = new DayEmployee[3];
        dEmp[0] = new DayEmployee(50.0);
        dEmp[1] = new DayEmployee(60.0);
        dEmp[2] = new DayEmployee(70.0);

        WeekEmployee[] wEmp = new WeekEmployee[2];
        wEmp[0] = new WeekEmployee(1500.0);
        wEmp[1] = new WeekEmployee(2000.0);

        MonthEmployee[] mEmp = new MonthEmployee[2];
        mEmp[0] = new MonthEmployee(8000.0);
        mEmp[1] = new MonthEmployee(9000.0);

        Company cpy = new Company(dEmp, wEmp, mEmp);
        System.out.println("公司总年薪 : " + cpy.getTotalSalary());
    }
}



