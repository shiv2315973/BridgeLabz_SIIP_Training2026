import java.util.Arrays;

public class AttendanceRanking {
    static class Employee implements Comparable<Employee> {
        int id, attendance;
        Employee(int id, int attendance) { this.id = id; this.attendance = attendance; }
        public int compareTo(Employee other) {
            return attendance != other.attendance ? Integer.compare(other.attendance, attendance) : Integer.compare(id, other.id);
        }
    }
    public static int[] getTopKEmployees(int[] employeeIds, int[] attendance, int k) {
        if (employeeIds == null || attendance == null || employeeIds.length != attendance.length || k < 0 || k > employeeIds.length) throw new IllegalArgumentException("Invalid input");
        Employee[] employees = new Employee[employeeIds.length];
        for (int i = 0; i < employees.length; i++) employees[i] = new Employee(employeeIds[i], attendance[i]);
        Arrays.sort(employees); int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = employees[i].id;
        return result;
    }
}
