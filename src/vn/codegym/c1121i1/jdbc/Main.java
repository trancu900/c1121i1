package vn.codegym.c1121i1.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] permision = {1, 3, 4};
//       addUser("rich","rich@gmail.com","aloxia");
        User a = new User("rich", "rich@gmail.com", "aloxia");
        try {
            addUserTransaction(a, permision);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static final String INSERT_USERS_SQL = "INSERT INTO users (name, email, country) VALUES (?, ?, ?);INSERT INTO users (name, email, country) VALUES (?, ?, ++.3?);";

    public static void addUserTransaction(User user, int[] permisions) throws SQLException {
        Connection conn = null;
        // for insert a new user
        PreparedStatement pstmt = null;
        // for assign permision to user
        PreparedStatement pstmtAssignment = null;
        // for getting user id
        ResultSet rs = null;
        try {
            conn = getConnection();
            // set auto commit to false
            conn.setAutoCommit(false);
            //
            // Insert user
            //


            pstmt = conn.prepareStatement(INSERT_USERS_SQL, Statement.RETURN_GENERATED_KEYS);


            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getCountry());

            int rowAffected = pstmt.executeUpdate();

            // get user id

            rs = pstmt.getGeneratedKeys();

            int userId = 0;
            if (rs.next())
                userId = rs.getInt(1);
            String sqlPivot = "INSERT INTO user_permision(user_id,permision_id) VALUES(?,?)";
            pstmtAssignment = conn.prepareStatement(sqlPivot);
            for (int permisionId : permisions) {
                pstmtAssignment.setInt(1, userId);
                pstmtAssignment.setInt(2, permisionId);
                pstmtAssignment.executeUpdate();
                int a = 1 / 0;
            }
        } catch (SQLException | ArithmeticException ex) {
            conn.rollback();
            PreparedStatement prepareStatement = conn.prepareStatement("INSERT INTO messages VALUES (?);");
            prepareStatement.setString(1, ex.getMessage());
            prepareStatement.executeUpdate();
        } finally {
            conn.commit();
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (pstmtAssignment != null) pstmtAssignment.close();
            if (conn != null) conn.close();
        }

    }

    public static void addUser(String name, String email, String country) {
        try (Connection connection = getConnection();
             PreparedStatement prepareStatement = connection.prepareStatement(INSERT_USERS_SQL);
        ) {
            connection.setAutoCommit(false);
            prepareStatement.setString(2, email);
            prepareStatement.setString(3, country);
            prepareStatement.setString(1, name);
            prepareStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected static Connection getConnection() {
        String jdbcURL = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String jdbcUsername = "root";
        String jdbcPassword = "ucvt";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
}
