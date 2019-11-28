package ua.lviv.iot.view;

import ua.lviv.iot.controller.Controller;
import ua.lviv.iot.model.*;

import java.util.Scanner;

public class MyView {
    private static Controller controller;
    private static String submenu =
            "\t1 - Find all\n\t2 - Find by id\n\t3 - Create\n\t4 - Update\n\t5 - Delete\n\tQ - Go back\n";

    public MyView() throws Exception {
        controller = new Controller();
    }

    public void show() throws Exception {
        String menuPoint;
        do {
            System.out.println("Press ENTER key to continue...");
            new Scanner(System.in).nextLine();

            outputMenu();
            System.out.print("\nPlease, select menu point: ");
            menuPoint = new Scanner(System.in).nextLine().toUpperCase();

            switch (menuPoint) {
                case "1":
                    workWithPharmacy();
                    break;
                case "2":
                    workWithChain();
                    break;
                case "3":
                    workWithCategory();
                    break;
                case "4":
                    workWithManufacturer();
                    break;
                case "5":
                    workWithUsing();
                    break;
                case "6":
                    workWithComponents();
                    break;
                case "Q":
                    System.out.println("\n\nBye!");
                    break;
                default:
                    System.out.println("Menu point does not exist!");
            }
        } while (!menuPoint.equals("Q"));
    }

    private void outputMenu() {
        System.out.println("\t\tMenu");
        System.out.println("(Choose Table to work with:)");
        System.out.print("\t1 - Pharmacy\n" + "\t2 - Chain\n" + "\t3 - Category\n" + "\t4 - Manufacturer\n" +
                "\t5 - Using\n" + "\t6 - Components\n" +
                "\tQ - Exit\n");
    }

    private void workWithPharmacy() throws Exception {
        PharmacyEntity entity;
        System.out.println("\tTable 'Pharmacy'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                for (PharmacyEntity pharmacy : controller.findAllPharmacy()) {
                    System.out.println(pharmacy);
                }
                break;
            case "2":
                System.out.print("Enter id: ");
                System.out.println(controller.findPharmacyById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new PharmacyEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter name: ");
                entity.setName(new Scanner(System.in).nextLine());
                System.out.print("Enter location: ");
                entity.setLocation(new Scanner(System.in).nextLine());
                System.out.print("Enter popularity: ");
                entity.setPopularity(new Scanner(System.in).nextLine());
                System.out.print("Enter products: ");
                entity.setProducts(new Scanner(System.in).nextLine());
                System.out.print("Enter chain: ");
                entity.setChain(new Scanner(System.in).nextLine());
                controller.createPharmacy(entity);
                break;
            case "4":
                entity = new PharmacyEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter name: ");
                entity.setName(new Scanner(System.in).nextLine());
                System.out.print("Enter location: ");
                entity.setLocation(new Scanner(System.in).nextLine());
                System.out.print("Enter popularity: ");
                entity.setPopularity(new Scanner(System.in).nextLine());
                System.out.print("Enter products: ");
                entity.setProducts(new Scanner(System.in).nextLine());
                System.out.print("Enter chain: ");
                entity.setChain(new Scanner(System.in).nextLine());
                controller.updatePharmacy(entity);
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deletePharmacy(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithChain() throws Exception {
        ChainEntity entity;
        System.out.println("\tTable 'chain'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                for (ChainEntity chain : controller.findAllChain()) {
                    System.out.println(chain);
                }
                    break;
                    case "2":
                        System.out.print("Enter id: ");
                        System.out.println(controller.findChainById(new Scanner(System.in).nextInt()));

                break;
            case "3":
                entity = new ChainEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter podorozhnik: ");
                entity.setPodorozhnik(new Scanner(System.in).nextLine());
                System.out.print("Enter ze: ");
                entity.setZe(new Scanner(System.in).nextLine());
                System.out.print("Enter ds: ");
                entity.setDs(new Scanner(System.in).nextLine());
                controller.createChain(entity);
                break;
            case "4":
                entity = new ChainEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter podorozhnik: ");
                entity.setPodorozhnik(new Scanner(System.in).nextLine());
                System.out.print("Enter ze: ");
                entity.setZe(new Scanner(System.in).nextLine());
                System.out.print("Enter ds: ");
                entity.setDs(new Scanner(System.in).nextLine());
                controller.updateChain(entity);
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteChain(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithCategory() throws Exception {
        CategoryEntity entity;
        System.out.println("\tTable 'category'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                for (CategoryEntity category : controller.findAllCategory()) {
                    System.out.println(category);
                }
                break;
            case "2":
                System.out.print("Enter id: ");
                System.out.println(controller.findCategoryById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new CategoryEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter name: ");
                entity.setName(new Scanner(System.in).nextLine());
                System.out.print("Enter type: ");
                entity.setType(new Scanner(System.in).nextLine());
                System.out.print("Enter quantity: ");
                entity.setQuantity(new Scanner(System.in).nextLine());
                controller.createCategory(entity);
                break;
            case "4":

                entity = new CategoryEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter name: ");
                entity.setName(new Scanner(System.in).nextLine());
                System.out.print("Enter type: ");
                entity.setType(new Scanner(System.in).nextLine());
                System.out.print("Enter quantity: ");
                entity.setQuantity(new Scanner(System.in).nextLine());
                controller.updateCategory(entity);
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteCategory(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithManufacturer() throws Exception {
        ManufacturerEntity entity;
        System.out.println("\tTable 'manufacturer'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                for (ManufacturerEntity manufacturer : controller.findAllManufacturer()) {
                    System.out.println(manufacturer);
                }
                break;
            case "2":
                System.out.print("Enter id: ");
                System.out.println(controller.findManufacturerById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new ManufacturerEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter country: ");
                entity.setCountry(new Scanner(System.in).nextLine());
                System.out.print("Enter type_of_drugs: ");
                entity.setType_of_drugs(new Scanner(System.in).nextLine());
                System.out.print("Enter safety: ");
                entity.setSafety(new Scanner(System.in).nextLine());
                System.out.print("Enter stock: ");
                entity.setStock(new Scanner(System.in).nextLine());
                controller.createManufacturer(entity);
                break;
            case "4":
                entity = new ManufacturerEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter country: ");
                entity.setCountry(new Scanner(System.in).nextLine());
                System.out.print("Enter type_of_drugs: ");
                entity.setType_of_drugs(new Scanner(System.in).nextLine());
                System.out.print("Enter safety: ");
                entity.setSafety(new Scanner(System.in).nextLine());
                System.out.print("Enter stock: ");
                entity.setStock(new Scanner(System.in).nextLine());
                controller.updateManufacturer(entity);
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteManufacturer(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithUsing() throws Exception {
        UsingEntity entity;
        System.out.println("\tTable 'using'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                for (UsingEntity using : controller.findAllUsing()) {
                    System.out.println(using);
                }
                break;
            case "2":
                System.out.print("Enter id: ");
                System.out.println(controller.findManufacturerById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new UsingEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter name: ");
                entity.setName(new Scanner(System.in).nextLine());
                System.out.print("Enter type_of_using: ");
                entity.setType_of_using(new Scanner(System.in).nextLine());
                System.out.print("Enter time: ");
                entity.setTime(new Scanner(System.in).nextLine());
                System.out.print("Enter usingcol: ");
                entity.setUsingcol(new Scanner(System.in).nextLine());
                System.out.print("Enter contrainadation: ");
                entity.setContrainidation(new Scanner(System.in).nextLine());
                controller.createUsing(entity);
                break;
            case "4":
                entity = new UsingEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter name: ");
                entity.setName(new Scanner(System.in).nextLine());
                System.out.print("Enter type_of_using: ");
                entity.setType_of_using(new Scanner(System.in).nextLine());
                System.out.print("Enter time: ");
                entity.setTime(new Scanner(System.in).nextLine());
                System.out.print("Enter usingcol: ");
                entity.setUsingcol(new Scanner(System.in).nextLine());
                System.out.print("Enter contrainadation: ");
                entity.setContrainidation(new Scanner(System.in).nextLine());
                controller.updateUsing(entity);
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteUsing(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithComponents() throws Exception {
        ComponentsEntity entity;
        System.out.println("\tTable 'components'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                for (ComponentsEntity components : controller.findAllComponents()) {
                    System.out.println(components);
                }
                break;
            case "2":
                System.out.print("Enter id: ");
                System.out.println(controller.findComponentsById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new ComponentsEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter name: ");
                entity.setName(new Scanner(System.in).nextLine());
                System.out.print("Enter properties: ");
                entity.setProperties(new Scanner(System.in).nextLine());
                System.out.print("Enter contents: ");
                entity.setContents(new Scanner(System.in).nextLine());
                controller.createComponents(entity);
                break;
            case "4":
                entity = new ComponentsEntity();
                System.out.print("Enter id: ");
                entity.setId(new Scanner(System.in).nextInt());
                System.out.print("Enter name: ");
                entity.setName(new Scanner(System.in).nextLine());
                System.out.print("Enter properties: ");
                entity.setProperties(new Scanner(System.in).nextLine());
                System.out.print("Enter contents: ");
                entity.setContents(new Scanner(System.in).nextLine());
                controller.updateComponents(entity);
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteComponents(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

}