package lt.v;

import com.github.javafaker.Number;

import java.io.Serializable;

public class Imone implements Serializable {
    private  String companyName;
    private  long companyId;
    private long employeesNumber;

    public Imone() {
    }

    public Imone(String companyName, long companyId, long employeesNumber) {
        this.companyName = companyName;
        this.companyId = companyId;
        this.employeesNumber = employeesNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public long getCompanyId() {
        return companyId;
    }

    public long getEmployeesNumber() {
        return employeesNumber;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public void setEmployeesNumber(long employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public String toString() {
        return "Imone{" +
                "companyName='" + companyName + '\'' +
                ", companyId='" + companyId + '\'' +
                ", employeesNumber=" + employeesNumber +
                '}';
    }
}
