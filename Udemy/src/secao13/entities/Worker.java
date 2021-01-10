package secao13.entities;

import secao13.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private double baseSalary;

    Deparment deparment;
    private List<HourContract> list = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, WorkerLevel level, double baseSalary, Deparment deparment) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.deparment = deparment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract) {
        list.add(contract);
    }

    public void removeContract(HourContract contract) {
        list.remove(contract);
    }

    public List<HourContract> getList() {
        return list;
    }

    public Deparment getDeparment() {
        return deparment;
    }

    public void setDeparment(Deparment deparment) {
        this.deparment = deparment;
    }

    public double income(Integer year, Integer month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : list) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (c_year == year && c_month == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

    public String toString() {
        return "";
    }
}
