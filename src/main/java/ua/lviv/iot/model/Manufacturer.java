package ua.lviv.iot.model;

import ua.lviv.iot.controller.connection.ConnectionManager;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manufacturer {
    private static final String FIND_ALL = "SELECT * FROM `manufacturer`";
    private static final String FIND_BY_ID = "SELECT * FROM `manufacturer` WHERE id=?";
    private static final String CREATE = "INSERT INTO `manufacturer` (id, country, type_of_drugs, safety, stock) " +
            "VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE `manufacturer` SET id=?, country=?, type_of_drugs=?, safety=?, stock=? WHERE id=?";
    private static final String DELETE = "DELETE FROM `manufacturer` WHERE id=?";

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

    public void create(Integer id, String  country, String type_of_drugs, String safety, String stock) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, id);
            ps.setString(2, country);
            ps.setString(3, type_of_drugs);
            ps.setString(4, safety);
            ps.setString(5, stock);


            ps.executeUpdate();
        }
    }

    public void update(Integer manufacturer_id, Integer id, String  country, String type_of_drugs, String safety, String stock) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setInt(1, id);
            ps.setString(2, country);
            ps.setString(3, type_of_drugs);
            ps.setString(4, safety);
            ps.setString(5, stock);
            ps.setInt(6, manufacturer_id);


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
            System.out.print(", country: " + resultSet.getString("country"));
            System.out.print(", surname: " + resultSet.getString("type_of_drugs"));
            System.out.print(", safety: " + resultSet.getString("safety"));
            System.out.print(", stock: " + resultSet.getString("stock"));
            System.out.println("}");
        }
    }
}
