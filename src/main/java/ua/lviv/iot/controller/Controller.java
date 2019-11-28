package ua.lviv.iot.controller;

import ua.lviv.iot.service.ComponentsService;
import ua.lviv.iot.service.CategoryService;
import ua.lviv.iot.service.UsingService;
import ua.lviv.iot.service.ChainService;
import ua.lviv.iot.service.ManufacturerService;
import ua.lviv.iot.service.PharmacyService;
import ua.lviv.iot.model.CategoryEntity;
import ua.lviv.iot.model.UsingEntity;
import ua.lviv.iot.model.ManufacturerEntity;
import ua.lviv.iot.model.PharmacyEntity;
import ua.lviv.iot.model.ComponentsEntity;
import ua.lviv.iot.model.ChainEntity;

import java.util.List;

public class Controller implements IController {
    private static PharmacyService pharmacyService;
    private static ManufacturerService manufacturerService;
    private static ChainService chainService;
    private static UsingService usingService;
    private static CategoryService categoryService;
    private static ComponentsService componentsService;

    public Controller()  {
        pharmacyService = new PharmacyService();
        manufacturerService = new ManufacturerService();
        chainService = new ChainService();
        usingService = new UsingService();
        categoryService = new CategoryService();
        componentsService = new ComponentsService();
    }

    @Override
    public List<PharmacyEntity> findAllPharmacy() throws Exception {
        return pharmacyService.findAll();
    }

    @Override
    public PharmacyEntity findPharmacyById(Integer id) throws Exception {
        return pharmacyService.findById(id);
    }

    @Override
    public void createPharmacy(PharmacyEntity entity) throws Exception {
        pharmacyService.create(entity);
    }

    @Override
    public void updatePharmacy(PharmacyEntity entity) throws Exception {
        pharmacyService.update(entity);
    }

    @Override
    public void deletePharmacy(Integer id) throws Exception {
        pharmacyService.delete(id);
    }


    @Override
    public List<UsingEntity> findAllUsing() throws Exception {
        return usingService.findAll();
    }

    @Override
    public UsingEntity findUsingById(Integer id) throws Exception {
        return usingService.findById(id);
    }

    @Override
    public void createUsing(UsingEntity entity) throws Exception {
        usingService.create(entity);
    }

    @Override
    public void updateUsing(UsingEntity entity) throws Exception {
        usingService.update(entity);
    }

    @Override
    public void deleteUsing(Integer id) throws Exception {
        usingService.delete(id);
    }


    @Override
    public List<ManufacturerEntity> findAllManufacturer() throws Exception {
        return manufacturerService.findAll();
    }

    @Override
    public ManufacturerEntity findManufacturerById(Integer id) throws Exception {
        return manufacturerService.findById(id);
    }

    @Override
    public void createManufacturer(ManufacturerEntity entity) throws Exception {
        manufacturerService.create(entity);
    }

    @Override
    public void updateManufacturer(ManufacturerEntity entity) throws Exception {
        manufacturerService.update(entity);
    }

    @Override
    public void deleteManufacturer(Integer id) throws Exception {
        manufacturerService.delete(id);

    }


    @Override
    public List<ChainEntity> findAllChain() throws Exception {
        return chainService.findAll();
    }

    @Override
    public ChainEntity findChainById(Integer id) throws Exception {
        return chainService.findById(id);
    }

    @Override
    public void createChain(ChainEntity entity) throws Exception {
        chainService.create(entity);
    }

    @Override
    public void updateChain(ChainEntity entity) throws Exception {
        chainService.update(entity);
    }

    @Override
    public void deleteChain(Integer id) throws Exception {
        chainService.delete(id);
    }


    @Override
    public List<ComponentsEntity> findAllComponents() throws Exception {
        return componentsService.findAll();
    }

    @Override
    public ComponentsEntity findComponentsById(Integer id) throws Exception {
        return componentsService.findById(id);
    }

    @Override
    public void createComponents(ComponentsEntity entity) throws Exception {
        componentsService.create(entity);
    }

    @Override
    public void updateComponents(ComponentsEntity entity) throws Exception {
        componentsService.update(entity);
    }

    @Override
    public void deleteComponents(Integer id) throws Exception {
        componentsService.delete(id);
    }

    @Override
    public List<CategoryEntity> findAllCategory() throws Exception {
        return categoryService.findAll();
    }

    @Override
    public CategoryEntity findCategoryById(Integer id) throws Exception {
        return categoryService.findById(id);
    }

    @Override
    public void createCategory(CategoryEntity entity) throws Exception {
        categoryService.create(entity);
    }

    @Override
    public void updateCategory(CategoryEntity entity) throws Exception {
        categoryService.update(entity);
    }

    @Override
    public void deleteCategory(Integer id) throws Exception {
        categoryService.delete(id);
    }

}