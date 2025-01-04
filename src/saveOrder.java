import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class saveOrder extends order{
    public saveOrder(int customerId, int price) throws IOException, ClassNotFoundException {
        super(customerId, price);
        File file = new File("orders.dat");
        ObjectInputStream ois;
        ArrayList<order> orders = new ArrayList<>();
        if(file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            orders = (ArrayList<order>) ois.readObject();
            ois.close();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        orders.add(this);
        oos.writeObject(orders);
        JOptionPane.showMessageDialog(null, "Order is being prepared. Order ID: "+ orders.get(orders.size()-1).orderID + " Price: " + orders.get(orders.size()-1).price);
        oos.close();
        for(int i = 0; i < orders.size(); i++){
            System.out.println("Order ID: " + orders.get(i).orderID + " CustomerID: " + orders.get(i).customerId);
        }
    }
}
