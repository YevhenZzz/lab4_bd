package ua.lviv.iot.view;

import ua.lviv.iot.controller.Controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

public class MyView {
    private static Controller controller;
    private static String submenu =
            "\t1 - Find all\n\t2 - Find by id\n\t3 - Create\n\t4 - Update\n\t5 - Delete\n\tQ - Go back\n";

    public MyView() throws SQLException {
        controller = new Controller();
    }

    public void show() throws SQLException {
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

    private void workWithPharmacy() throws SQLException {
        System.out.println("\tTable 'Pharmacy'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllPharmacy();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findPharmacyById(new Scanner(System.in).nextInt());
                break;
            case "3":
                System.out.print("Enter id: ");
                Integer id = new Scanner(System.in).nextInt();
                System.out.print("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.print("Enter location: ");
                String location = new Scanner(System.in).nextLine();
                System.out.print("Enter popularity: ");
                String popularity = new Scanner(System.in).nextLine();
                System.out.print("Enter products: ");
                String products = new Scanner(System.in).nextLine();
                System.out.print("Enter chain: ");
                String chain = new Scanner(System.in).nextLine();
                controller.createPharmacy(id, name, location, popularity, products, chain);
                break;
            case "4":
                System.out.print("Enter pharmacy id: ");
                Integer pharmacy_id = new Scanner(System.in).nextInt();
                System.out.print("Enter id: ");
                Integer xId = new Scanner(System.in).nextInt();
                System.out.print("Enter new name: ");
                String newName = new Scanner(System.in).nextLine();
                System.out.print("Enter new location: ");
                String newLocation = new Scanner(System.in).nextLine();
                System.out.print("Enter new popularity: ");
                String newPopularity = new Scanner(System.in).nextLine();
                System.out.print("Enter new products: ");
                String newProducts = new Scanner(System.in).nextLine();
                System.out.print("Enter new chain: ");
                String newChain = new Scanner(System.in).nextLine();
                controller.updatePharmacy(pharmacy_id, xId, newName, newLocation, newPopularity, newProducts, newChain);
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

    private void workWithChain() throws SQLException {
        System.out.println("\tTable 'chain'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllChain();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findChainById(new Scanner(System.in).nextInt());
                break;
            case "3":
                System.out.print("Enter id: ");
                Integer id = new Scanner(System.in).nextInt();
                System.out.print("Enter podorozhnik: ");
                String podorozhnik = new Scanner(System.in).nextLine();
                System.out.print("Enter ze: ");
                String ze = new Scanner(System.in).nextLine();
                System.out.print("Enter ds: ");
                String ds = new Scanner(System.in).nextLine();
                controller.createChain(id, podorozhnik, ze, ds);
                break;
            case "4":
                System.out.print("Enter chain id: ");
                Integer chain_id = new Scanner(System.in).nextInt();
                System.out.print("Enter id: ");
                Integer xid = new Scanner(System.in).nextInt();
                System.out.print("Enter new podorozhnik: ");
                String newPodorozhnik = new Scanner(System.in).nextLine();
                System.out.print("Enter new ze: ");
                String newZe = new Scanner(System.in).nextLine();
                System.out.print("Enter new ds: ");
                String newDs = new Scanner(System.in).nextLine();
                controller.updateChain(chain_id, xid, newPodorozhnik, newZe, newDs);
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

    private void workWithCategory() throws SQLException {
        System.out.println("\tTable 'category'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllCategory();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findCategoryById(new Scanner(System.in).nextInt());
                break;
            case "3":
                System.out.print("Enter id: ");
                Integer id = new Scanner(System.in).nextInt();
                System.out.print("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.print("Enter type: ");
                String type = new Scanner(System.in).nextLine();
                System.out.print("Enter quantity: ");
                String quantity = new Scanner(System.in).nextLine();
                controller.createCategory(id, name, type, quantity);
                break;
            case "4":
                System.out.print("Enter category id: ");
                Integer category_id = new Scanner(System.in).nextInt();
                System.out.print("Enter new id: ");
                Integer xId = new Scanner(System.in).nextInt();
                System.out.print("Enter new surname: ");
                String newName = new Scanner(System.in).nextLine();
                System.out.print("Enter new phone: ");
                String newType = new Scanner(System.in).nextLine();
                System.out.print("Enter new address: ");
                String newQuantity = new Scanner(System.in).nextLine();
                controller.updateCategory(category_id, xId, newName, newType, newQuantity);
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

    private void workWithManufacturer() throws SQLException {
        System.out.println("\tTable 'manufacturer'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllManufacturer();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findManufacturerrById(new Scanner(System.in).nextInt());
                break;
            case "3":
                System.out.print("Enter id: ");
                Integer id = new Scanner(System.in).nextInt();
                System.out.print("Enter country: ");
                String country = new Scanner(System.in).nextLine();
                System.out.print("Enter type_of_drugs: ");

                String type_of_drugs = new Scanner(System.in).nextLine();
                System.out.print("Enter safety: ");
                String safety = new Scanner(System.in).nextLine();
                System.out.print("Enter stock: ");
                String stock = new Scanner(System.in).nextLine();
                controller.createManufacturer(id, country, type_of_drugs, safety, stock);
                break;
            case "4":
                System.out.print("Enter manufacturer id: ");
                Integer manufacturer_id = new Scanner(System.in).nextInt();
                System.out.print("Enter new id: ");
                Integer xId = new Scanner(System.in).nextInt();
                System.out.print("Enter new country: ");
                String newCountry = new Scanner(System.in).nextLine();
                System.out.print("Enter new type_of_drugs: ");
                String newType_of_drugs = new Scanner(System.in).nextLine();
                System.out.print("Enter new safety: ");
                String newSafety = new Scanner(System.in).nextLine();
                System.out.print("Enter new stock: ");
                String newStock = new Scanner(System.in).nextLine();
                controller.updateManufacturer(manufacturer_id, xId, newCountry, newType_of_drugs, newSafety, newStock);
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

    private void workWithUsing() throws SQLException {
        System.out.println("\tTable 'using'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllUsing();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findUsingById(new Scanner(System.in).nextInt());
                break;
            case "3":
                System.out.print("Enter id: ");
                Integer id = new Scanner(System.in).nextInt();
                System.out.print("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.print("Enter type_of_using: ");
                String type_of_using = new Scanner(System.in).nextLine();
                System.out.print("Enter time: ");
                String time = new Scanner(System.in).nextLine();
                System.out.print("Enter usingcol: ");
                String usingcol = new Scanner(System.in).nextLine();
                System.out.print("Enter contrainadation: ");
                String contrainidation = new Scanner(System.in).nextLine();
                controller.createUsing(id, name, type_of_using, time, usingcol, contrainidation);
                break;
            case "4":
                System.out.print("Enter using id: ");
                Integer using_id = new Scanner(System.in).nextInt();
                System.out.print("Enter new id: ");
                Integer xId = new Scanner(System.in).nextInt();
                System.out.print("Enter new name: ");
                String newName = new Scanner(System.in).nextLine();
                System.out.print("Enter new type_of_using: ");
                String newType_of_using = new Scanner(System.in).nextLine();
                System.out.print("Enter new time: ");
                String newTime = new Scanner(System.in).nextLine();
                System.out.print("Enter new usingcol: ");
                String newUsingcol = new Scanner(System.in).nextLine();
                System.out.print("Enter new contrainadation: ");
                String newContrainidation = new Scanner(System.in).nextLine();
                controller.updateUsing(using_id, xId, newName, newType_of_using, newTime, newUsingcol, newContrainidation);
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

    private void workWithComponents() throws SQLException {
        System.out.println("\tTable 'components'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllComponents();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findComponentsById(new Scanner(System.in).nextInt());
                break;
            case "3":
                System.out.print("Enter id: ");
                Integer id = new Scanner(System.in).nextInt();
                System.out.print("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.print("Enter properties: ");
                String properties = new Scanner(System.in).nextLine();
                System.out.print("Enter contents: ");
                String contents = new Scanner(System.in).nextLine();
                controller.createComponents(id, name, properties, contents);
                break;
            case "4":
                System.out.print("Enter components id: ");
                Integer components_id = new Scanner(System.in).nextInt();
                System.out.print("Enter id: ");
                Integer xId = new Scanner(System.in).nextInt();
                System.out.print("Enter name: ");
                String newName = new Scanner(System.in).nextLine();
                System.out.print("Enter properties: ");
                String newProperties = new Scanner(System.in).nextLine();
                System.out.print("Enter contents: ");
                String newContents = new Scanner(System.in).nextLine();
                controller.updateComponents(components_id, xId, newName, newProperties, newContents);
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