package ua.lviv.iot.model;

import ua.lviv.iot.controller.connection.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Category {

    private static final String FIND_ALL = "SELECT * FROM `category`";
    private static final String FIND_BY_ID = "SELECT * FROM `category` WHERE id=?";
    private static final String CREATE = "INSERT INTO `category` (id, name, type, quantity)" +
            " VALUES (?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE `category` SET id=?, name=?, type=?, quantity=? WHERE id=?";
    private static final String DELETE = "DELETE FROM `category` WHERE id=?";

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

    public void create(Integer id, String name, String type, String quantity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, type);
            ps.setString(4, quantity);
            ps.executeUpdate();
        }
    }

    public void update(Integer category_id,  Integer id, String name, String type, String quantity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, type);
            ps.setString(4, quantity);
            ps.setInt(5, category_id);

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
            System.out.print("{name: " + resultSet.getString("name"));
            System.out.print("{type: " + resultSet.getString("type"));
            System.out.print("quantity: " + resultSet.getString("quantity"));
            System.out.println("}");
        }
    }
}
