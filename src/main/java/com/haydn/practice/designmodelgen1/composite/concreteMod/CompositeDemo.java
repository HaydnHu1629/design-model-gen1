package com.haydn.practice.designmodelgen1.composite.concreteMod;

/**
 * @Author haydn
 * @create 2020/8/23 13:15
 */
public class CompositeDemo {


    public static void printEmp(Employee e){

        System.out.println("- " +e.getId() + e.getName() + " /");
        if(!e.getSubEmps().isEmpty()){
            for(Employee temp:e.getSubEmps()){
                printEmp(temp);
            }
        }
    }


    public static void main(String[] args) {

        Employee chairMan = new Employee("Alpha", 66, 100000.0f);
        Employee ceo = new Employee("Beta", 42, 50000.0f);
        Employee cfo = new Employee("Gama", 37, 55000.0f);
        Employee managerTec = new Employee("Qiang", 30, 20000.0f);
        Employee managerMar = new Employee("Haydn", 28, 22000.0f);
        Employee staffA = new Employee("hua", 24, 6600.0f);


        chairMan.addEmployee(ceo);
        chairMan.addEmployee(cfo);
        ceo.addEmployee(managerTec);
        ceo.addEmployee(managerMar);
        managerTec.addEmployee(staffA);

        printEmp(ceo);

    }


}
