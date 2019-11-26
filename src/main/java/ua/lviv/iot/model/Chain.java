package ua.lviv.iot.model;

import ua.lviv.iot.controller.connection.ConnectionManager;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Chain {
    private static final String FIND_ALL = "SELECT * FROM `chain`";
    private static final String FIND_BY_ID = "SELECT * FROM `chain` WHERE id=?";
    private static final String CREATE =
            "INSERT INTO `chain` (id, podorozhnik, ze, ds)" +
                    " VALUES (?, ?, ?, ?)";
    private static final String UPDATE =
            "UPDATE `chain` SET id=?, podorozhnik=?, ze=?, ds=? WHERE id=?";
    private static final String DELETE = "DELETE FROM `chain` WHERE id=?";

    public void findAll() throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(FIND_ALL)) {
                print(resultSet);
            }
        }
    }

    public void findById(Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(FIND_BY_ID)) {
            ps.setInt(1, id);
            try (ResultSet resultSet = ps.executeQuery()) {
                print(resultSet);
            }
        }
    }

    public void create(Integer id, String podorozhnik, String ze, String ds) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, id);
            ps.setString(2, podorozhnik);
            ps.setString(3, ze);
            ps.setString(4, ds);
            ps.executeUpdate();
        }
    }

    public void update (Integer chain_id, Integer id, String podorozhnik, String ze, String ds)  throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setInt(1, id);
            ps.setString(2, podorozhnik);
            ps.setString(3, ze);
            ps.setString(4, ds);
            ps.setInt(5, chain_id);
            ps.executeUpdate();
        }
    }

    public void delete(Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(DELETE)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    private void print(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            System.out.print("{id: " + resultSet.getInt("id"));
            System.out.print(", chain_id: " + resultSet.getInt("chain_id"));
            System.out.print(", podorozhnik: " + resultSet.getString("podorozhnik"));
            System.out.print(", ze: " + resultSet.getString("ze"));
            System.out.print(", ds: " + resultSet.getString("ds"));
            System.out.println("}");
        }
    }
}
