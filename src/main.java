import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class main extends JFrame implements Serializable {
    public static ArrayList<Integer> price1 = new ArrayList<>();
    public static int total = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel;

        //INITIALIZING BUTTONS
        JButton Manager = new JButton("MANAGER");
        JButton Customer = new JButton("Customer");
        JButton aboutUs = new JButton("About Us");
        JLabel label = new JLabel("THE FOODIES");
        label.setFont(new Font("Monospaced", Font.BOLD, 17));
        label.setBounds(160, 11, 300, 41);
        JButton close = new JButton("EXIT");
        frame.setTitle("OOSE FINAL PROJECT");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 450, 300);
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.setContentPane(panel);
        panel.setLayout(null);
        panel.add(label);

        Manager.addActionListener(e -> {
            JLabel password1, label2;
            JTextField username;
            JButton managerLogin;
            JPasswordField Password;
            JPanel panel2 = new JPanel();
            panel2.setLayout(null);
            JFrame frame2 = new JFrame();
            frame2.setTitle("LOGIN PAGE FOR MANAGER");
            frame2.setLocation(new Point(500, 300));
            frame2.add(panel2);
            frame2.setSize(new Dimension(400, 200));
            frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Username label constructor
            label2 = new JLabel("Username");
            label2.setBounds(100, 8, 70, 20);
            panel2.add(label2);

            // Username TextField constructor
            username = new JTextField();
            username.setBounds(100, 27, 193, 28);
            panel2.add(username);

            // Password Label constructor
            password1 = new JLabel("Password");
            password1.setBounds(100, 55, 70, 20);
            panel2.add(password1);


            // Password TextField
            Password = new JPasswordField();
            Password.setBounds(100, 75, 193, 28);
            panel2.add(Password);


            managerLogin = new JButton("Login");
            managerLogin.setBounds(100, 110, 90, 25);
            managerLogin.setForeground(Color.WHITE);
            managerLogin.setBackground(Color.BLACK);
            managerLogin.addActionListener(e3 -> {
                String userName = username.getText();
                String password = Password.getText();
                if(userName.equals("admin") && password.equals("admin")){
                    JOptionPane.showMessageDialog(frame2.getComponent(0), "Login Successfully");
                    JFrame frame3 = new JFrame();
                    JPanel panel3;

                    JButton update_menu = new JButton("Update Menu");
                    JButton orderHistory = new JButton("Order History");
                    JButton feedBack = new JButton("Check Feedbacks");
                    JButton customerList = new JButton("Customer List");
                    JButton close1 = new JButton("EXIT");
                    frame3.setTitle("OOSE FINAL PROJECT");
                    frame3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    frame3.setBounds(100, 100, 450, 300);
                    panel3 = new JPanel();
                    panel3.setBorder(new EmptyBorder(5, 5, 5 , 5));
                    frame3.setContentPane(panel3);
                    panel3.setLayout(null);
                    panel3.add(label);


                    update_menu.addActionListener(e4 -> {
                        JFrame frame1 = new JFrame();
                        JPanel panel1 = new JPanel();
                        JButton addFood = new JButton("Add Food Item");
                        JButton delete = new JButton("Delete Food Item");
                        JButton close2 = new JButton("Exit");
                        frame1.setTitle("OOSE FINAL PROJECT");
                        frame1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        frame1.setBounds(100, 100, 450, 300);
                        panel1.setBorder(new EmptyBorder(5, 5, 5 , 5));
                        frame1.setContentPane(panel1);
                        panel1.setLayout(null);
                        panel1.add(label);


                        addFood.addActionListener(e1 -> {
                            JFrame frame7 = new JFrame();
                            JPanel panel7 = new JPanel();
                            frame7.setTitle("OOSE FINAL PROJECT");
                            frame7.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                            frame7.setBounds(100, 100, 450, 300);
                            frame7.setContentPane(panel7);
                            panel7.setLayout(null);

                            JLabel labelH = new JLabel("Add Any Food Item: ");
                            labelH.setFont(new Font("Monospaced", Font.BOLD, 15));
                            labelH.setBounds(10, 11, 414, 34);
                            labelH.setHorizontalAlignment(0);
                            panel7.add(labelH);

                            JLabel nameLabel = new JLabel("Food Item Name");
                            nameLabel.setFont(new Font("Thoma", Font.PLAIN, 11));
                            nameLabel.setBounds(10, 72, 250, 14);
                            panel7.add(nameLabel);
                            JTextField nameField = new JTextField();
                            nameField.setBounds(200, 69, 200, 20);
                            panel7.add(nameField);
                            nameField.setColumns(10);

                            JLabel price = new JLabel("Price");
                            price.setFont(new Font("Thoma", Font.PLAIN, 11));
                            price.setBounds(10, 118, 250, 14);
                            panel7.add(price);
                            JTextField priceField = new JTextField();
                            priceField.setColumns(10);
                            priceField.setBounds(200, 115, 200, 20);
                            panel7.add(priceField);

                            JLabel comboBoxLabel = new JLabel("SELECT FOOD CATEGORY");
                            comboBoxLabel.setFont(new Font("Thoma", Font.PLAIN, 11));
                            comboBoxLabel.setBounds(10, 163, 250, 14);
                            panel7.add(comboBoxLabel);
                            String foodType[] = {"Desi Food", "Fast Food", "Dessert", "Drink"};
                            JComboBox cb = new JComboBox(foodType);
                            cb.setBounds(200, 160, 200, 20);
                            panel7.add(cb);


                            // Button to delete
                            JButton ADD = new JButton("ADD");
                            ADD.addActionListener(e7 -> {
                                String foodItemName = nameField.getText();
                                int priceI = Integer.parseInt(priceField.getText());
                                String itemType = (String) cb.getItemAt(cb.getSelectedIndex());
                                if(nameField.getText().isEmpty() || priceField.getText().isEmpty())
                                    JOptionPane.showMessageDialog(frame7.getComponent(0), "Each Field is Required");
                                else
                                    switch (itemType) {
                                        case "Desi Food" -> {
                                            try {
                                                desiFoods desi_Food = new desiFoods(foodItemName, priceI, "desiFood.dat");
                                            } catch (IOException | ClassNotFoundException ex) {
                                                ex.printStackTrace();
                                            }
                                        }
                                        case "Fast Food" -> {
                                            try {
                                                fastFood fast_Food = new fastFood(foodItemName, priceI, "fastFoods.dat");
                                            } catch (IOException | ClassNotFoundException ex) {
                                                ex.printStackTrace();
                                            }
                                        }
                                        case "Dessert" -> {
                                            try {
                                                desserts dessert_s = new desserts(foodItemName, priceI, "desserts.dat");
                                            } catch (IOException | ClassNotFoundException ex) {
                                                ex.printStackTrace();
                                            }
                                        }
                                        case "Drink" -> {
                                            try {
                                                drinks drink_s = new drinks(foodItemName, priceI, "drinks.dat");
                                            } catch (IOException | ClassNotFoundException ex) {
                                                ex.printStackTrace();
                                            }
                                        }
                                        default -> JOptionPane.showMessageDialog(null, "Something Wrong");
                                    }

                            });
                            ADD.setBounds(240, 209, 89, 23);
                            panel7.add(ADD);
                            frame7.setVisible(true);
                        });
                        addFood.setBounds(122, 81, 200, 25);
                        addFood.setForeground(Color.WHITE);
                        addFood.setBackground(Color.BLACK);
                        panel1.add(addFood);


                        delete.addActionListener(e1 -> {
                            JFrame frame7 = new JFrame();
                            JPanel panel7 = new JPanel();
                            frame7.setTitle("OOSE FINAL PROJECT");
                            frame7.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                            frame7.setBounds(100, 100, 450, 300);
                            frame7.setContentPane(panel7);
                            panel7.setLayout(null);

                            JLabel labelH = new JLabel("Delete Any Food Item: ");
                            labelH.setFont(new Font("Monospaced", Font.BOLD, 15));
                            labelH.setBounds(10, 11, 414, 34);
                            labelH.setHorizontalAlignment(0);
                            panel7.add(labelH);

                            JLabel nameLabel = new JLabel("Food Item Name");
                            nameLabel.setFont(new Font("Thoma", Font.PLAIN, 11));
                            nameLabel.setBounds(10, 72, 250, 14);
                            panel7.add(nameLabel);
                            JTextField nameField = new JTextField();
                            nameField.setBounds(200, 69, 200, 20);
                            panel7.add(nameField);
                            nameField.setColumns(10);

                            JLabel food_item_id = new JLabel("Food Item ID");
                            food_item_id.setFont(new Font("Thoma", Font.PLAIN, 11));
                            food_item_id.setBounds(10, 118, 250, 14);
                            panel7.add(food_item_id);
                            JTextField itemIDField = new JTextField();
                            itemIDField.setColumns(10);
                            itemIDField.setBounds(200, 115, 200, 20);
                            panel7.add(itemIDField);

                            JLabel comboBoxLabel = new JLabel("SELECT FOOD CATEGORY");
                            comboBoxLabel.setFont(new Font("Thoma", Font.PLAIN, 11));
                            comboBoxLabel.setBounds(10, 163, 250, 14);
                            panel7.add(comboBoxLabel);
                            String foodType[] = {"Desi Food", "Fast Food", "Dessert", "Drink"};
                            JComboBox cb = new JComboBox(foodType);
                            cb.setBounds(200, 160, 200, 20);
                            panel7.add(cb);


                            // Button to delete
                            JButton delete1 = new JButton("Delete");
                            delete1.addActionListener(e7 -> {
                                String name = nameField.getText();
                                int itemId = Integer.parseInt(itemIDField.getText());
                                String path = (String) cb.getItemAt(cb.getSelectedIndex());
                                if(nameField.getText().isEmpty() || itemIDField.getText().isEmpty())
                                    JOptionPane.showMessageDialog(frame7.getComponent(0), "Each Field is Required");
                                else
                                    switch (path){
                                    case "Desi Food" -> {
                                        try{
                                            delFood del = new delFood();
                                            del.delFoodItem(name, itemId, "desiFood.dat");
                                        }catch (IOException | ClassNotFoundException ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                        case "Fast Food" -> {
                                            try{
                                                delFood del = new delFood();
                                                del.delFoodItem(name, itemId, "fastFoods.dat");
                                            }catch (IOException | ClassNotFoundException ex) {
                                                ex.printStackTrace();
                                            }
                                        }
                                        case "Dessert" -> {
                                            try{
                                                delFood del = new delFood();
                                                del.delFoodItem(name, itemId, "desserts.dat");
                                            }catch (IOException | ClassNotFoundException ex) {
                                                ex.printStackTrace();
                                            }
                                        }
                                        case "Drink" -> {
                                            try{
                                                delFood del = new delFood();
                                                del.delFoodItem(name, itemId, "drinks.dat");
                                            }catch (IOException | ClassNotFoundException ex) {
                                                ex.printStackTrace();
                                            }
                                        }
                                        default -> JOptionPane.showMessageDialog(null, "Something Wrong");
                                    }

                            });
                            delete1.setBounds(240, 209, 89, 23);
                            panel7.add(delete1);
                            frame7.setVisible(true);
                        });
                        delete.setBounds(122, 132, 200, 25);
                        delete.setForeground(Color.WHITE);
                        delete.setBackground(Color.BLACK);
                        panel1.add(delete);


                        close2.addActionListener(e1 -> {});
                        close2.setBounds(122, 183, 200, 25);
                        close2.setForeground(Color.WHITE);
                        close2.setBackground(Color.BLACK);
                        panel1.add(close2);
                        frame1.setVisible(true);
                    });
                    update_menu.setBounds(122, 81, 200, 25);
                    update_menu.setForeground(Color.WHITE);
                    update_menu.setBackground(Color.BLACK);
                    panel3.add(update_menu);


                    orderHistory.addActionListener(e4 -> {
                        JFrame frameT = new JFrame();
                        frameT.setTitle("OOSE FINAL PROJECT");
                        ArrayList<order> listOrders;
                        orderList lists = new orderList();
                        String[] headings = {"Order ID", " Customer ID", "Price"};
                        try{
                            listOrders = lists.getList();
                            String data[][] = new String[listOrders.size()][3];
                            for(int k = 0; k < listOrders.size(); k++){
                                data[k] = new String[]{String.valueOf(listOrders.get(k).orderID), String.valueOf(listOrders.get(k).customerId), String.valueOf(listOrders.get(k).price)};
                            }
                            JTable table = new JTable(data, headings);
                            table.setBounds(30, 40, 200, 300);
                            JScrollPane sp = new JScrollPane(table);
                            frameT.setSize(500, 200);
                            frameT.setVisible(true);
                        } catch (IOException | ClassNotFoundException ex) {
                            ex.printStackTrace();
                        }
                    });
                    orderHistory.setBounds(122, 115, 200, 25);
                    orderHistory.setForeground(Color.WHITE);
                    orderHistory.setBackground(Color.BLACK);
                    panel3.add(orderHistory);


                    feedBack.addActionListener(e4 -> {});
                    feedBack.setBounds(122, 149, 200, 25);
                    feedBack.setForeground(Color.WHITE);
                    feedBack.setBackground(Color.BLACK);


                    customerList.addActionListener(e4 -> {
                        JFrame frameT = new JFrame();
                        frameT.setTitle("OOSE Final Project");
                        ArrayList<person> listCustomer;
                        getCustomerList listObj = new getCustomerList();
                        String[] headings = {"Account ID", "Name", "Address"};

                        try{
                            listCustomer = listObj.getList();
                            String data[][] = new String[listCustomer.size()][3];
                            for(int k = 0; k < listCustomer.size(); k++){
                                data[k] = new String[]{String.valueOf(listCustomer.get(k).id), listCustomer.get(k).name, listCustomer.get(k).address};
                            }
                            JTable table = new JTable(data, headings);
                            table.setBounds(30, 40, 200, 300);
                            JScrollPane sp = new JScrollPane(table);
                            frameT.add(sp);
                            frameT.setSize(500, 200);
                            frameT.setVisible(true);
                        } catch (IOException | ClassNotFoundException ex) {
                            ex.printStackTrace();
                        }
                    });
                    customerList.setBounds(122, 183, 200, 25);
                    customerList.setForeground(Color.WHITE);
                    customerList.setBackground(Color.BLACK);
                    panel3.add(customerList);


                    close1.addActionListener(arg0 -> System.exit(0));
                    close1.setBounds(122, 223, 200, 25);
                    close1.setForeground(Color.WHITE);
                    close1.setBackground(Color.BLACK);
                    panel3.add(close1);
                    frame3.setVisible(true);
                }
                else
                    JOptionPane.showMessageDialog(frame2.getComponent(0), "Login Failed");



            });
            panel2.add(managerLogin);
            frame2.setVisible(true);





        });
        Manager.setBounds(122, 81, 200, 25);
        Manager.setForeground(Color.WHITE);
        Manager.setBackground(Color.BLACK);
        panel.add(Manager);


        Customer.addActionListener(e -> {
            JFrame frame1 = new JFrame();
            JPanel panel1;

            JButton logIn = new JButton("Log In");
            JButton signUp = new JButton("Sign Up");
            JButton exit = new JButton("Exit");
            frame1.setTitle("OOSE SEMESTER PROJECT");
            frame1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            frame1.setBounds(100, 100, 450, 300);
            panel1 = new JPanel();
            panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
            frame1.setContentPane(panel1);
            panel1.setLayout(null);
            panel1.add(label);

            //LogIN for Customer
            logIn.addActionListener(e1 -> {
                JLabel password1, label2;
                JTextField username;
                JButton customerLogIn;
                JPasswordField Password;
                JPanel panel2 = new JPanel();
                panel2.setLayout(null);
                JFrame frame2 = new JFrame();
                frame2.setTitle("LOGIN PAGE");
                frame2.setLocation(new Point(500, 300));
                frame2.add(panel2);
                frame2.setSize(new Dimension(400, 200));
                frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Username label constructor
                label2 = new JLabel("Account ID");
                label2.setBounds(100, 8, 70, 20);
                panel2.add(label2);

                // Username TextField constructor
                username = new JTextField();
                username.setBounds(100, 27, 193, 28);
                panel2.add(username);

                // Password Label constructor
                password1 = new JLabel("Password");
                password1.setBounds(100, 55, 70, 20);
                panel2.add(password1);


                // Password TextField
                Password = new JPasswordField();
                Password.setBounds(100, 75, 193, 28);
                panel2.add(Password);


                customerLogIn = new JButton("Login");
                customerLogIn.setBounds(100, 110, 90, 25);
                customerLogIn.setForeground(Color.WHITE);
                customerLogIn.setBackground(Color.BLACK);
                panel2.add(customerLogIn);
                frame2.setVisible(true);
                customerLogIn.addActionListener(e2 -> {
                    String accountID = username.getText();
                    String password = Password.getText();
                    System.out.println(accountID + " " + password);
                    searchCustomer authorize = null;
                    try {
                        authorize = new searchCustomer(accountID, password);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    if(authorize.login()){
                        JOptionPane.showMessageDialog(null, "Login Successfully");
                        JFrame frame3 = new JFrame();
                        JPanel panel3;

                        JButton menu = new JButton("Open Menu");
                        JButton orderHistory = new JButton("Order History");
                        JButton feedBack = new JButton("Give Feedback");
                        JButton updateProfile = new JButton("Update your Profile");
                        JButton close1 = new JButton("EXIT");
                        frame3.setTitle("OOSE FINAL PROJECT");
                        frame3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        frame3.setBounds(100, 100, 450, 300);
                        panel3 = new JPanel();
                        panel3.setBorder(new EmptyBorder(5, 5, 5 , 5));
                        frame3.setContentPane(panel3);
                        panel3.setLayout(null);
                        panel3.add(label);


                        menu.addActionListener(e3 -> {
                            JFrame frameM = new JFrame();
                            frameM.setTitle("OOSE FINAL PROJECT");
                            frameM.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            frameM.setLayout(null);
                            frameM.setBounds(100, 100, 1200, 750);
                            Border br = BorderFactory.createLineBorder(Color.BLACK);
                            Container c = frameM.getContentPane();

                            JPanel panel11 = new JPanel();
                            JPanel panel12 = new JPanel();
                            JPanel panel13 = new JPanel();
                            JPanel panel14 = new JPanel();
                            JPanel panel15 = new JPanel();
                            JPanel panel16 = new JPanel();

                            panel11.setLayout(null);
                            panel12.setLayout(null);
                            panel13.setLayout(null);
                            panel14.setLayout(null);
                            panel15.setLayout(null);
                            panel16.setLayout(null);

                            panel11.setBounds(10, 10, 400, 200);
                            panel12.setBounds(420, 10, 400, 200);
                            panel13.setBounds(10, 220, 400, 200);
                            panel14.setBounds(420, 220, 400, 200);
                            panel15.setBounds(850, 10, 200, 410);
                            panel16.setBounds(650, 430, 400, 190);

                            JLabel label1 = new JLabel("THE FOODIES");
                            label1.setFont(new Font("Monospaced", Font.BOLD,50));
                            label1.setBounds(150, 500, 500, 100);


                            ArrayList<item> dessertFood;
                            getFoodList list = new getFoodList();
                            try{
                                dessertFood = list.getList("desiFood.dat");
                                String data[][] = new String[dessertFood.size()][3];
                                for(int k = 0; k < dessertFood.size(); k++){
                                    data[k] = new String[]{String.valueOf(dessertFood.get(k).id), dessertFood.get(k).name, String.valueOf(dessertFood.get(k).price)};
                                }
                                JTable table = new JTable(data, new String[]{"Item Id", " Name", "Price"});
                                table.setBounds(0, 0, 400, 200);
                                JScrollPane sp = new JScrollPane(table);
                                panel11.add(sp);
                                panel11.add(table);
                            } catch (IOException | ClassNotFoundException ex) {
                                ex.printStackTrace();
                            }


                            ArrayList<item> fastFoods;
                            getFoodList listf = new getFoodList();
                            try{
                                fastFoods = listf.getList("fastFoods.dat");
                                String data[][] = new String[fastFoods.size()][3];
                                for(int k = 0; k < fastFoods.size(); k++){
                                    data[k] = new String[]{String.valueOf(fastFoods.get(k).id), fastFoods.get(k).name, String.valueOf(fastFoods.get(k).price)};
                                }
                                JTable table = new JTable(data, new String[]{"Item Id", " Name", "Price"});
                                table.setBounds(0, 0, 400, 200);
                                JScrollPane sp = new JScrollPane(table);
                                panel12.add(sp);
                                panel12.add(table);
                            } catch (IOException | ClassNotFoundException ex) {
                                ex.printStackTrace();
                            }


                            ArrayList<item> desserts;
                            getFoodList listd = new getFoodList();
                            try{
                                dessertFood = listd.getList("desserts.dat");
                                String data[][] = new String[dessertFood.size()][3];
                                for(int k = 0; k < dessertFood.size(); k++){
                                    data[k] = new String[]{String.valueOf(dessertFood.get(k).id), dessertFood.get(k).name, String.valueOf(dessertFood.get(k).price)};
                                }
                                JTable table = new JTable(data, new String[]{"Item Id", " Name", "Price"});
                                table.setBounds(0, 0, 400, 200);
                                JScrollPane sp = new JScrollPane(table);
                                panel13.add(sp);
                                panel13.add(table);
                            } catch (IOException | ClassNotFoundException ex) {
                                ex.printStackTrace();
                            }


                            ArrayList<item> drinks;
                            getFoodList listDr = new getFoodList();
                            try{
                                dessertFood = listDr.getList("drinks.dat");
                                String data[][] = new String[dessertFood.size()][3];
                                for(int k = 0; k < dessertFood.size(); k++){
                                    data[k] = new String[]{String.valueOf(dessertFood.get(k).id), dessertFood.get(k).name, String.valueOf(dessertFood.get(k).price)};
                                }
                                JTable table = new JTable(data, new String[]{"Item Id", " Name", "Price"});
                                table.setBounds(0, 0, 400, 200);
                                JScrollPane sp = new JScrollPane(table);
                                panel14.add(sp);
                                panel14.add(table);
                            } catch (IOException | ClassNotFoundException ex) {
                                ex.printStackTrace();
                            }


                            JLabel label11 = new JLabel("Item ID");
                            JLabel label12 = new JLabel("Qty");
                            JLabel label13 = new JLabel("Category");
                            label11.setFont(new Font("Monospaced", Font.ROMAN_BASELINE, 15));
                            label11.setBounds(5, 72, 250, 15);
                            label12.setFont(new Font("Monospaced", Font.ROMAN_BASELINE, 15));
                            label12.setBounds(125, 72, 250, 15);
                            label13.setFont(new Font("Monospaced", Font.ROMAN_BASELINE, 15));
                            label13.setBounds(200, 72, 250, 15);
                            JTextField idField = new JTextField();
                            JSpinner qty = new JSpinner();
                            idField.setBounds(75, 74, 50, 20);
                            qty.setBounds(150, 74, 50, 20);
                            String foodType[] = {"Desi Food", "Fast Food", "Dessert", "Drink"};
                            JComboBox cb = new JComboBox(foodType);
                            cb.setBounds(280, 74, 100, 20);
                            JButton add = new JButton("Add To Cart");
                            JButton reset = new JButton("Reset");
                            JButton exit1 = new JButton("CheckOut");
                            JButton close12 = new JButton("Exit");

                            String intro = "------------------------------------------\n" +
                                    "         THE FOODIES         \n" +
                                    "------------------------------------------\n" +
                                    "   NAME        QTY     PRICE\n\n";

                            TextArea area = new TextArea(intro);
                            area.setBounds(0, 0, 190, 400);
                            ArrayList<String> order = new ArrayList<>();
                            add.addActionListener(e6 ->{
                                String intro1 = intro;
                                int totalPrice = 0;
                                int price = 0;
                                int count = 0;
                                int id = Integer.parseInt(idField.getText());
                                int quantity = (int) qty.getValue();
                                int typ = cb.getSelectedIndex();
                                getFoodList listdd = new getFoodList();
                                System.out.println(typ);
                                switch(typ){
                                    case 0 -> {
                                        try{
                                            ArrayList<item> listDF;
                                            listDF = listdd.getList("desiFood.dat");
                                            for(int i = 0; i < listDF.size(); i++){
                                                if(listDF.get(i).id == id){
                                                    price = quantity * listDF.get(i).price;
                                                    count++;
                                                    order.add(listDF.get(i).name+ "       " + quantity + "        " +price +"\n");
                                                    totalOrderPrice(price);
                                                }
                                            }
                                            if(count == 0){
                                                JOptionPane.showMessageDialog(null, "Item id is Wrong.");
                                            }

                                        } catch (IOException | ClassNotFoundException ex) {
                                            ex.printStackTrace();
                                        }

                                    }

                                    case 1 -> {
                                        try{
                                            ArrayList<item> listDF;
                                            listDF = listdd.getList("fastFoods.dat");
                                            for(int i = 0; i < listDF.size(); i++){
                                                if(listDF.get(i).id == id){
                                                    price = quantity * listDF.get(i).price;
                                                    count++;
                                                    order.add(listDF.get(i).name+ "       " + quantity + "        " +price +"\n");
                                                    totalOrderPrice(price);
                                                }
                                            }
                                            if(count == 0){
                                                JOptionPane.showMessageDialog(null, "Item id is Wrong.");
                                            }
                                        } catch (IOException | ClassNotFoundException ex) {
                                            ex.printStackTrace();
                                        }
                                    }

                                    case 2 -> {
                                        try{
                                            ArrayList<item> listDF;
                                            listDF = listdd.getList("desserts.dat");
                                            for(int i = 0; i < listDF.size(); i++){
                                                if(listDF.get(i).id == id){
                                                    price = quantity * listDF.get(i).price;
                                                    count++;
                                                    order.add(listDF.get(i).name+ "       " + quantity + "        " +price +"\n");
                                                    totalOrderPrice(price);
                                                }
                                            }
                                            if(count == 0){
                                                JOptionPane.showMessageDialog(null, "Item id is Wrong.");
                                            }
                                        } catch (IOException | ClassNotFoundException ex) {
                                            ex.printStackTrace();
                                        }
                                    }

                                    case 3 ->{
                                        try{
                                            ArrayList<item> listDF;
                                            listDF = listdd.getList("drinks.dat");
                                            for(int i = 0; i < listDF.size(); i++){
                                                if(listDF.get(i).id == id){
                                                    price = quantity * listDF.get(i).price;
                                                    count++;
                                                    order.add(listDF.get(i).name+ "       " + quantity + "        " +price +"\n");
                                                    totalOrderPrice(price);
                                                }
                                            }
                                            if(count == 0){
                                                JOptionPane.showMessageDialog(null, "Item id is Wrong.");
                                            }
                                        } catch (IOException | ClassNotFoundException ex) {
                                            ex.printStackTrace();
                                        }
                                    }

                                    default ->
                                            JOptionPane.showMessageDialog(null, "Not Found");
                                }
                                for(int i = 0; i < order.size(); i++){
                                intro1 = intro1 + order.get(i);
                                }
                                System.out.println(totalPrice);
                                area.setText(intro1);
                            });
                            add.setBounds(10, 120, 130, 25);
                            add.setForeground(Color.WHITE);
                            add.setBackground(Color.BLACK);

                            reset.addActionListener(e6 -> {
                                idField.setText(null);
                            });
                            reset.setBounds(150, 120, 130, 25);
                            reset.setForeground(Color.WHITE);
                            reset.setBackground(Color.BLACK);

                            exit1.addActionListener(e6 -> {
                                JOptionPane.showMessageDialog(null, "Total price is : " + totalOrderPrice(0));
                                try {
                                    saveOrder save = new saveOrder(Integer.parseInt(accountID), totalOrderPrice(0));
                                } catch (IOException | ClassNotFoundException ex) {
                                    ex.printStackTrace();
                                }
                            });
                            exit1.setBounds(280, 120, 130, 25);
                            exit1.setForeground(Color.WHITE);
                            exit1.setBackground(Color.BLACK);

                            close12.addActionListener(arg0 -> System.exit(0));
                            close12.setBounds(280, 160, 130, 25);
                            close12.setForeground(Color.WHITE);
                            close12.setBackground(Color.BLACK);

                            panel15.add(area);
                            panel16.add(add);
                            panel16.add(reset);
                            panel16.add(exit1);
                            panel16.add(close12);
                            panel16.add(idField);
                            panel16.add(qty);
                            panel16.add(cb);
                            panel16.add(label11);
                            panel16.add(label12);
                            panel16.add(label13);

                            panel11.setBorder(br);
                            panel12.setBorder(br);
                            panel13.setBorder(br);
                            panel14.setBorder(br);
                            panel15.setBorder(br);
                            panel16.setBorder(br);

                            c.add(label1);


                            c.add(panel11);
                            c.add(panel12);
                            c.add(panel13);
                            c.add(panel14);
                            c.add(panel15);
                            c.add(panel16);



                            frameM.setVisible(true);
                        });
                        menu.setBounds(122, 81, 200, 25);
                        menu.setForeground(Color.WHITE);
                        menu.setBackground(Color.BLACK);
                        panel3.add(menu);


                        orderHistory.addActionListener(e3 -> {
                            JFrame frameT = new JFrame();
                            frameT.setTitle("OOSE FINAL PROJECT");
                            ArrayList<order> listOrders;
                            orderList list = new orderList();
                            String[] headings = {"Order ID", "Price"};
                            try {
                                listOrders = list.getList();
                                String data[][] = new String[listOrders.size()][2];
                                for(int k = 0; k < listOrders.size(); k++){
                                    if(Integer.parseInt(accountID) == listOrders.get(k).customerId)
                                        data[k] = new String[]{String.valueOf(listOrders.get(k).orderID), String.valueOf(listOrders.get(k).price) };
                                }
                                JTable table = new JTable(data, headings);
                                table.setBounds(30, 40, 200, 300);
                                JScrollPane sp = new JScrollPane(table);
                                frameT.add(sp);
                                frameT.setSize(500, 200);
                                frameT.add(table);
                                frameT.setVisible(true);
                            } catch (IOException | ClassNotFoundException ex) {
                                ex.printStackTrace();
                            }
                        });
                        orderHistory.setBounds(122, 150, 200, 25);
                        orderHistory.setForeground(Color.WHITE);
                        orderHistory.setBackground(Color.BLACK);
                        panel3.add(orderHistory);


                        feedBack.addActionListener(e3 -> {});
                        feedBack.setBounds(122, 149, 200, 25);
                        feedBack.setForeground(Color.WHITE);
                        feedBack.setBackground(Color.BLACK);


                        updateProfile.addActionListener(e3 -> {
                            JLabel addressL, mobileNumberL;
                            JTextField address, mobileNumber;
                            JFrame frameU = new JFrame();
                            JPanel panelU = new JPanel();
                            panelU.setLayout(null);
                            frameU.setLayout(null);
                            frameU.setTitle("OOSE FINAL PROJECT");
                            frameU.setLocation(500, 300);
                            frameU.add(panelU);
                            frameU.setSize(new Dimension(400, 200));
                            frameU.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                            addressL = new JLabel("New Address: ");
                            mobileNumberL = new JLabel("Confirm Number: ");
                            addressL.setBounds(100, 8, 70, 20);
                            mobileNumberL.setBounds(100, 27, 193, 28);
                            panelU.add(addressL);
                            mobileNumberL.add(mobileNumberL);

                            address = new JTextField();
                            address.setBounds(100, 27, 193, 28);
                            panelU.add(address);

                            mobileNumber = new JTextField();
                            mobileNumber.setBounds(100, 75, 193, 28);
                            panelU.add(mobileNumber);

                            JButton update = new JButton("Update");
                            update.setBounds(100, 110, 90, 25);
                            update.setForeground(Color.WHITE);
                            update.setBackground(Color.BLACK);
                            panelU.add(update);
                            frameU.setVisible(true);
                            update.addActionListener(e4 ->{
                                String add = address.getText();
                                String mob = mobileNumber.getText();

                            });
                        });
                        updateProfile.setBounds(122, 183, 200, 25);
                        updateProfile.setForeground(Color.WHITE);
                        updateProfile.setBackground(Color.BLACK);


                        close1.addActionListener(arg0 -> System.exit(0));
                        close1.setBounds(122, 223, 200, 25);
                        close1.setForeground(Color.WHITE);
                        close1.setBackground(Color.BLACK);
                        panel3.add(close1);
                        frame3.setVisible(true);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Wrong Account ID or Password!");
                });
            });
            logIn.setBounds(122, 81, 200, 23);
            logIn.setForeground(Color.WHITE);
            logIn.setBackground(Color.BLACK);
            panel1.add(logIn);


                //Sign Up for Customer
            signUp.addActionListener(e1 -> {
                JFrame frame6 = new JFrame();
                JLabel title, name, mobile, password, address, res, rePassword;
                JTextField nameField, mobileField;
                JPasswordField passwordField, rePasswordField;
                JTextArea addressArea;
                JCheckBox term;
                JButton submit, reset;



                frame6.setTitle("Registration Form");
                frame6.setBounds(300, 90, 900, 600);
                frame6.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


                frame6.setLayout(null);

                title = new JLabel("Registration Form");
                title.setFont(new Font("Arial", Font.PLAIN, 30));
                title.setSize(300, 30);
                title.setLocation(120, 30);
                frame6.add(title);

                name = new JLabel("Name");
                name.setFont(new Font("Arial", Font.PLAIN, 20));
                name.setSize(100, 20);
                name.setLocation(80, 100);
                frame6.add(name);

                nameField = new JTextField();
                nameField.setFont(new Font("Arial", Font.PLAIN, 15));
                nameField.setSize(190, 20);
                nameField.setLocation(200, 100);
                frame6.add(nameField);

                mobile = new JLabel("Mobile");
                mobile.setFont(new Font("Arial", Font.PLAIN, 20));
                mobile.setSize(100, 20);
                mobile.setLocation(80, 150);
                frame6.add(mobile);

                mobileField = new JTextField();
                mobileField.setFont(new Font("Arial", Font.PLAIN, 15));
                mobileField.setSize(190, 20);
                mobileField.setLocation(200, 150);
                frame6.add(mobileField);

                password = new JLabel("Password");
                password.setFont(new Font("Arial", Font.PLAIN, 20));
                password.setSize(100, 20);
                password.setLocation(80, 200);
                frame6.add(password);

                passwordField = new JPasswordField();
                passwordField.setSize(190, 20);
                passwordField.setLocation(200, 200);
                frame6.add(passwordField);


                rePassword = new JLabel("Re Type Password");
                rePassword.setFont(new Font("Arial", Font.PLAIN, 20));
                rePassword.setSize(100, 20);
                rePassword.setLocation(80, 250);
                frame6.add(rePassword);

                rePasswordField = new JPasswordField();
                rePasswordField.setSize(190, 20);
                rePasswordField.setLocation(200, 250);
                frame6.add(rePasswordField);





                address = new JLabel("Address");
                address.setFont(new Font("Arial", Font.PLAIN, 20));
                address.setSize(100, 20);
                address.setLocation(100, 300);
                frame6.add(address);

                addressArea = new JTextArea();
                addressArea.setFont(new Font("Arial", Font.PLAIN, 15));
                addressArea.setSize(200, 75);
                addressArea.setLocation(200, 300);
                addressArea.setLineWrap(true);
                addressArea.setText("Address");
                frame6.add(addressArea);

                term = new JCheckBox("Accept Terms And Conditions.");
                term.setFont(new Font("Arial", Font.PLAIN, 15));
                term.setSize(250, 20);
                term.setLocation(150, 400);
                frame6.add(term);

                submit = new JButton("Sign Up");
                submit.setFont(new Font("Arial", Font.PLAIN, 15));
                submit.setSize(100, 20);
                submit.setLocation(150, 450);
                submit.addActionListener(e2 -> {
                    JFrame frame2 = new JFrame();
                    JFrame frame3 = new JFrame();
                    if(nameField.getText().isEmpty() | mobileField.getText().isEmpty() | passwordField.getText().isEmpty() | rePasswordField.getText().isEmpty() | addressArea.getText().isEmpty()){
                        JOptionPane.showMessageDialog(frame2.getComponent(0), "Each Field is Required");
                    }
                    else/*(String.valueOf(passwordField).equals(String.valueOf(rePasswordField)))*/{
                        String name1 = String.valueOf(nameField.getText());
                        String password1 = String.valueOf(passwordField.getText());
                        String mobileNumber = String.valueOf(mobileField.getText());
                        String address1= String.valueOf(addressArea.getText());
                        try{
                            customerRegistration newCust = new customerRegistration(name1, password1, mobileNumber, address1);
                        }catch (IOException | ClassNotFoundException ex) {
                            ex.printStackTrace();
                        }
                    }
                    /*else
                        JOptionPane.showMessageDialog(frame3.getComponent(0), "Passwords are not Same");*/
                });
                frame6.add(submit);

                reset = new JButton("Reset");
                reset.setFont(new Font("Arial", Font.PLAIN, 15));
                reset.setSize(100, 20);
                reset.setLocation(270, 450);
                reset.addActionListener(e9 -> {
                    mobileField.setText(null);
                    nameField.setText(null);
                    passwordField.setText(null);
                    rePasswordField.setText(null);
                });
                frame6.add(reset);


                res = new JLabel("");
                res.setFont(new Font("Arial", Font.PLAIN, 20));
                res.setSize(500, 25);
                res.setLocation(100, 500);
                frame6.add(res);


                frame6.setVisible(true);


                });
            signUp.setBounds(122, 132, 200, 23);
            signUp.setForeground(Color.WHITE);
            signUp.setBackground(Color.BLACK);
            panel1.add(signUp);


            //Close
            exit.addActionListener(arg0 -> System.exit(0));
            exit.setBounds(122, 183, 200, 23);
            exit.setForeground(Color.WHITE);
            exit.setBackground(Color.BLACK);
            panel1.add(exit);
            frame1.setVisible(true);

            });
        Customer.setBounds(122, 115, 200, 25);
        Customer.setForeground(Color.WHITE);
        Customer.setBackground(Color.BLACK);
        panel.add(Customer);


        aboutUs.addActionListener(e4 -> {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Our aim is to serve our customers with lavish dining experiences at affordable prices.");
        });
        aboutUs.setBounds(122, 149, 200, 25);
        aboutUs.setForeground(Color.WHITE);
        aboutUs.setBackground(Color.BLACK);
        panel.add(aboutUs);


        close.addActionListener(arg0 -> System.exit(0));
        close.setBounds(122, 183, 200, 25);
        close.setForeground(Color.WHITE);
        close.setBackground(Color.BLACK);
        panel.add(close);
        frame.setBackground(Color.YELLOW);
        frame.setVisible(true);
        }



        public static int totalOrderPrice(int price){
        System.out.println("Inside total method"+price);
        price1.add(price);
        for(int i = 0; i < price1.size(); i++){
            total = total + price1.get(i);
            System.out.println(total);
        }
        int sum = price1.stream().mapToInt(Integer :: intValue).sum();
            System.out.println(sum);
        return sum;
        }
}
