package ua.lviv.iot.controller;

import java.sql.SQLException;

public interface IController {

    void findAllPharmacy() throws SQLException;

    void findPharmacyById(Integer id) throws SQLException;

    void createPharmacy(Integer id, String username, String location, String popularity,String products,String chain) throws SQLException;

    void deletePharmacy(Integer id) throws SQLException;

    void updatePharmacy(Integer pharmacy_id, Integer id, String username, String location, String popularity,String products,String chain)
            throws SQLException;

     void findAllChain() throws SQLException;

     void findChainById(Integer id) throws SQLException;

     void createChain(Integer id, String podorozhnik, String ze, String ds) throws SQLException;

     void updateChain(Integer chain_id, Integer id, String podorozhnik, String ze, String ds)

            throws SQLException;
     void deleteChain(Integer id) throws SQLException;

     void findAllComponents() throws SQLException;

     void findComponentsById(Integer id) throws SQLException;

     void createComponents(Integer id, String name, String properties, String contents) throws SQLException;

     void updateComponents(Integer components_id, Integer id, String name, String properties, String contents) throws SQLException;

     void deleteComponents(Integer id) throws SQLException;

     void findAllManufacturer() throws SQLException;

     void findManufacturerrById(Integer id) throws SQLException;

     void createManufacturer(Integer id, String  country, String type_of_drugs, String safety, String stock) throws SQLException;

     void updateManufacturer(Integer manufacturer_id, Integer id, String  country, String type_of_drugs, String safety, String stock) throws SQLException;

     void deleteManufacturer(Integer id) throws SQLException;

     void findAllUsing() throws SQLException;

     void findUsingById(Integer id) throws SQLException;

     void createUsing(Integer id, String name, String type_of_using, String time, String usingcol, String contrainidation) throws SQLException;

     void updateUsing(Integer using_id, Integer id, String name, String type_of_using, String time, String usingcol, String contrainidation) throws SQLException;

     void deleteUsing(Integer id) throws SQLException;

     void findAllCategory() throws SQLException;

     void findCategoryById(Integer id) throws SQLException;

    void createCategory(Integer id, String name, String type, String quantity)
            throws SQLException;
    void updateCategory(Integer category_id, Integer id, String name, String type, String quantity) throws SQLException;

    void deleteCategory(Integer id) throws SQLException;

}
