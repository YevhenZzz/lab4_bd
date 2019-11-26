package ua.lviv.iot.model;

import ua.lviv.iot.controller.connection.ConnectionManager;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Using {
    private static final String FIND_ALL = "SELECT * FROM `using`";
    private static final String FIND_BY_ID = "SELECT * FROM `using` WHERE id=?";
    private static final String CREATE =
            "INSERT INTO `using` (id, name, type_of_using, time, usingcol, contrainidation)" +
                    " VALUES (?, ?, ?, ?, ?, ?)";
    private static final String UPDATE =
            "UPDATE `using` SET id=?, name=?, type_of_using=?, time=?, usingcol=?, contrainidation=? WHERE id=?";
    private static final String DELETE = "DELETE FROM `using` WHERE id=?";

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

    public void create(Integer id, String name, String type_of_using, String time, String usingcol, String contrainidation) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, type_of_using);
            ps.setString(4, time);
            ps.setString(5, usingcol);
            ps.setString(6, contrainidation);
            ps.executeUpdate();
        }
    }

    public void update(Integer using_id, Integer id, String name, String type_of_using, String time, String usingcol, String contrainidation) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setInt(1, using_id);
            ps.setInt(2, id);
            ps.setString(3, name);
            ps.setString(4, type_of_using);
            ps.setString(5, time);
            ps.setString(6, usingcol);
            ps.setString(7, contrainidation);
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
            System.out.print(", name: " + resultSet.getString("name"));
            System.out.print(", type_of_using: " + resultSet.getString("type_of_using"));
            System.out.print(", time: " + resultSet.getString("time"));
            System.out.print(", usingcol: " + resultSet.getString("usingcol"));
            System.out.print(", contrainidation: " + resultSet.getString("contrainidation"));
            System.out.println("}");
        }
    }
}
