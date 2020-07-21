package GoFDesignPatterns.CreationalDesignPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        this.empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
        empList.add("Andrew");
        empList.add("Paul");
        empList.add("Henry");
    }

    public  List<String> getEmpList(){
        return empList;
    }

    @Override
    protected Object clone() {
        List<String> temp = new ArrayList<>();
        temp.addAll(this.getEmpList());
        return new Employees(temp);
    }
/*    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s: this.getEmpList()){
            temp.add(s);
s        }
        return new Employees(temp);
    }*/
}
