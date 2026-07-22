import java.util.ArrayList;
import java.util.List;

public class OrgChartExporter {
    static class Employee {
        String name;
        List<Employee> children = new ArrayList<>();

        Employee(String name) {
            this.name = name;
        }
    }

    public static void printHierarchy(Employee root) {
        if (root == null) return;
        System.out.println(root.name);
        for (Employee child : root.children) {
            printHierarchy(child);
        }
    }

    public static void main(String[] args) {
        Employee ceo = new Employee("CEO");
        Employee manager1 = new Employee("Manager 1");
        Employee manager2 = new Employee("Manager 2");
        ceo.children.add(manager1);
        ceo.children.add(manager2);
        manager1.children.add(new Employee("Engineer A"));
        manager2.children.add(new Employee("Engineer B"));

        printHierarchy(ceo);
    }
}
