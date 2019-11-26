package ua.lviv.iot.model;

import ua.lviv.iot.controller.connection.ConnectionManager;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Pharmacy {
    private static final String FIND_ALL = "SELECT * FROM `pharmacy`";
    private static final String FIND_BY_ID = "SELECT * FROM `pharmacy` WHERE id=?";
    private static final String CREATE = "INSERT INTO `pharmacy` (id, username, location, popularity, products, chain)" +
            " VALUES (?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE `pharmacy` SET id=?, username=?, location=? popularity=?, products=?, chain=?, chain_id=? WHERE id=?";
    private static final String DELETE = "DELETE FROM `pharmacy` WHERE id=?";


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

    public void create(Integer id,String username, String location, String popularity, String products, String chain) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, id);
            ps.setString(2, username);
            ps.setString(3, location);
            ps.setString(4, popularity);
            ps.setString(5, products);
            ps.setString(6, chain);
            ps.executeUpdate();
        }
    }

    public void update(Integer pharmacy_id,Integer id, String username, String location, String popularity, String products, String chain) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setInt(1, pharmacy_id);
            ps.setInt(2, id);
            ps.setString(3, username);
            ps.setString(4, location);
            ps.setString(5, popularity);
            ps.setString(6, products);
            ps.setString(7, chain);
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
            System.out.print("{username: " + resultSet.getString("username"));
            System.out.print(", location: " + resultSet.getString("location"));
            System.out.print("{ popularity: " + resultSet.getString("popularity"));
            System.out.print(", products " + resultSet.getString("products"));
            System.out.print("{ chain: " + resultSet.getString("chain"));
            System.out.print(", chain_id " + resultSet.getInt("chain_id"));
            System.out.println("}");
        }
    };

}
