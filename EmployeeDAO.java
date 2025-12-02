package Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {

    public static void saveEmployee(Employee e, int personId) {
        String sql = "INSERT INTO Employee(employeeId, person_id, jobTitle, salary) VALUES(?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, e.getEmployeeId());
            ps.setInt(2, personId);
            ps.setString(3, e.getJobTitle());
            ps.setDouble(4, e.getSalary());

            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
