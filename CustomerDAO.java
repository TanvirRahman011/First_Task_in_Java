package Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {

    public static void saveCustomer(Customer c, int personId) {
        String sql = "INSERT INTO Customer(customerId, person_id, discount) VALUES(?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, c.getCustomerId());
            ps.setInt(2, personId);
            ps.setInt(3, c.getDiscount());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
