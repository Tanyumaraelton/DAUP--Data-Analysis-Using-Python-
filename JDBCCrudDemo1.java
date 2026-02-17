import java.sql.*;

public class JDBCCrudDemo1 {

    public static void main(String[] args) {

        try {
            // 1. Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE","system","12345");

            // 3. INSERT
            PreparedStatement ps1 =
                con.prepareStatement("INSERT INTO student10 VALUES (?, ?, ?)");
            ps1.setInt(1, 12);
            ps1.setString(2, "Rahul");
            ps1.setInt(3, 22);
            ps1.executeUpdate();

 	    ps1.setInt(1,13);
            ps1.setString(2, "Ramu");
            ps1.setInt(3, 23);
            ps1.executeUpdate();

            // 4. SELECT
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student10");

            System.out.println("ID   NAME     AGE");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "   " +
                    rs.getString("name") + "   " +
                    rs.getInt("age")
                );
            }

            // 5. UPDATE
            PreparedStatement ps2 =
                con.prepareStatement("UPDATE student10 SET age=? WHERE id=?");
            ps2.setInt(1, 19);
            ps2.setInt(2, 7);
            ps2.executeUpdate();

            // 6. DELETE
            PreparedStatement ps3 =
                con.prepareStatement("DELETE FROM student10 WHERE id=?");
            ps3.setInt(1, 11);
            ps3.executeUpdate();

            // 7. Close Connection
            con.close();
            System.out.println("JDBC Operations Completed Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
