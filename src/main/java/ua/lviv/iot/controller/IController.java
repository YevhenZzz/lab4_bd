package ua.lviv.iot.controller;

import ua.lviv.iot.model.PharmacyEntity;
import ua.lviv.iot.model.ChainEntity;
import ua.lviv.iot.model.ManufacturerEntity;
import ua.lviv.iot.model.ComponentsEntity;
import ua.lviv.iot.model.CategoryEntity;
import ua.lviv.iot.model.UsingEntity;


import java.sql.SQLException;
import java.util.List;

public interface IController {
    List<PharmacyEntity> findAllPharmacy() throws Exception;

    PharmacyEntity findPharmacyById(Integer id) throws Exception;

    void createPharmacy(PharmacyEntity entity) throws Exception;

    void updatePharmacy(PharmacyEntity entity) throws Exception;

    void deletePharmacy(Integer id) throws Exception;

    List<UsingEntity> findAllUsing() throws Exception;

    UsingEntity findUsingById(Integer id) throws Exception;

    void createUsing(UsingEntity entity) throws Exception;

    void updateUsing(UsingEntity entity) throws Exception;

    void deleteUsing(Integer id) throws Exception;

    List<ManufacturerEntity> findAllManufacturer() throws Exception;

    ManufacturerEntity findManufacturerById(Integer id) throws Exception;

    void createManufacturer(ManufacturerEntity entity) throws Exception;

    void updateManufacturer(ManufacturerEntity entity) throws Exception;

    void deleteManufacturer(Integer id) throws Exception;

    List<ChainEntity> findAllChain() throws Exception;

    ChainEntity findChainById(Integer id) throws Exception;

    void createChain(ChainEntity entity) throws Exception;

    void updateChain(ChainEntity entity) throws Exception;

    void deleteChain(Integer id) throws Exception;

    List<ComponentsEntity> findAllComponents() throws Exception;

    ComponentsEntity findComponentsById(Integer id) throws Exception;

    void createComponents(ComponentsEntity entity) throws Exception;

    void updateComponents(ComponentsEntity entity) throws Exception;

    void deleteComponents(Integer id) throws Exception;

    List<CategoryEntity> findAllCategory() throws Exception;

    CategoryEntity findCategoryById(Integer id) throws Exception;

    void createCategory(CategoryEntity entity) throws Exception;

    void updateCategory(CategoryEntity entity) throws Exception;

    void deleteCategory(Integer id) throws Exception;
}
