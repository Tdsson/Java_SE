package day20_code.src;

import java.util.Objects;

public class Employee implements Comparable{
    private int id;
    private String name;
    private Double salar;

    public Employee() {
    }

    public Employee(int id, String name, Double salar) {
        this.id = id;
        this.name = name;
        this.salar = salar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalar() {
        return salar;
    }

    public void setSalar(Double salar) {
        this.salar = salar;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salar=" + salar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee)o;

        if(this.salar > other.salar){
            return 1;
        }else if(this.salar < other.salar){
            return -1;
        }
        return 0;
    }
}
