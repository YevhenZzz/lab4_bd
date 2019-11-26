package ua.lviv.iot.controller;

import ua.lviv.iot.model.Category;
import ua.lviv.iot.model.Using;
import ua.lviv.iot.model.Manufacturer;
import ua.lviv.iot.model.Pharmacy;
import ua.lviv.iot.model.Components;
import ua.lviv.iot.model.Chain;

import java.sql.SQLException;

public class Controller implements IController {
    private static Pharmacy pharmacy;
    private static Manufacturer manufacturer;
    private static Chain chain;
    private static Using using;
    private static Category category;
    private static Components components;

    public Controller() throws SQLException {
        pharmacy = new Pharmacy();
        manufacturer = new Manufacturer();
        chain = new Chain();
        using = new Using();
        category = new Category();
        components = new Components();
    }

    @Override
    public void findAllPharmacy() throws SQLException {
        pharmacy.findAll();
    }

    @Override
    public void findPharmacyById(Integer id) throws SQLException {
        pharmacy.findById(id);
    }

    @Override
    public void createPharmacy(Integer id, String username, String location, String popularity, String products, String chain) throws SQLException {
        pharmacy.create(id, username, location, popularity, products, chain);
    }

    @Override
    public void updatePharmacy(Integer pharmacy_id, Integer id, String username, String location, String popularity,String products,String chain)
            throws SQLException {
        pharmacy.update(pharmacy_id,  id, username, location, popularity, products, chain);
    }

    @Override
    public void deletePharmacy(Integer id) throws SQLException {
        pharmacy.delete(id);
    }

    @Override
    public void findAllChain() throws SQLException {
        chain.findAll();
    }

    @Override
    public void findChainById(Integer id) throws SQLException {
        chain.findById(id);
    }

    @Override
    public void createChain(Integer id, String podorozhnik, String ze, String ds) throws SQLException {
        chain.create(id, podorozhnik, ze, ds);
    }

    @Override
    public void updateChain(Integer chain_id, Integer id, String podorozhnik, String ze, String ds)
            throws SQLException {
        chain.update(chain_id, id, podorozhnik, ze, ds);
    }

    @Override
    public void deleteChain(Integer id) throws SQLException {
        chain.delete(id);
    }

    @Override
    public void findAllComponents() throws SQLException {
        components.findAll();
    }

    @Override
    public void findComponentsById(Integer id) throws SQLException {
        components.findById(id);
    }

    @Override
    public void createComponents(Integer id, String name, String properties, String contents) throws SQLException {
        components.create(id, name, properties, contents);
    }

    @Override
    public void updateComponents(Integer components_id, Integer id, String name, String properties, String contents) throws SQLException {
        components.update(components_id, id, name, properties, contents);
    }

    @Override
    public void deleteComponents(Integer id) throws SQLException {
        components.delete(id);
    }

    @Override
    public void findAllManufacturer() throws SQLException {
        manufacturer.findAll();
    }

    @Override
    public void findManufacturerrById(Integer id) throws SQLException {
        manufacturer.findById(id);
    }

    @Override
    public void createManufacturer(Integer id, String  country, String type_of_drugs, String safety, String stock) throws SQLException {
        manufacturer.create(id, country, type_of_drugs, safety, stock);
    }

    @Override
    public void updateManufacturer(Integer manufacturer_id, Integer id, String  country, String type_of_drugs, String safety, String stock) throws SQLException {
        manufacturer.update(manufacturer_id, id, country, type_of_drugs, safety, stock);
    }

    @Override
    public void deleteManufacturer(Integer id) throws SQLException {
        manufacturer.delete(id);
    }

    public void findAllUsing() throws SQLException {
        using.findAll();
    }

    @Override
    public void findUsingById(Integer id) throws SQLException {
        using.findById(id);
    }

    @Override
    public void createUsing(Integer id, String name, String type_of_using, String time, String usingcol, String contrainidation) throws SQLException {
        using.create(id, name, type_of_using, time, usingcol, contrainidation);
    }

    @Override
    public void updateUsing(Integer using_id, Integer id, String name, String type_of_using, String time, String usingcol, String contrainidation) throws SQLException {
        using.update(using_id, id, name, type_of_using, time, usingcol, contrainidation );
    }

    @Override
    public void deleteUsing(Integer id) throws SQLException {
        using.delete(id);
    }

    @Override
    public void findAllCategory() throws SQLException {
        category.findAll();
    }

    @Override
    public void findCategoryById(Integer id) throws SQLException {
        category.findById(id);
    }

    @Override
    public void createCategory(Integer id, String name, String type, String quantity)
            throws SQLException {
        category.create(id, name, type, quantity);
    }

    @Override
    public void updateCategory(Integer category_id, Integer id, String name, String type, String quantity) throws SQLException {
        category.update(category_id, id, name, type, quantity);
    }

    @Override
    public void deleteCategory(Integer id) throws SQLException {
        category.delete(id);
    }

}
