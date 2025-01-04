import javax.swing.*;
import java.io.*;
import java.util.ArrayList;


public class customerRegistration extends person{
    public customerRegistration(String name, String password, String phoneNum, String address) throws IOException, ClassNotFoundException{
        super(name, password, phoneNum, address);
        File file = new File("Customer.dat");
        ObjectInputStream ois;
        ArrayList<person> customer = new ArrayList<>();
        if(file.isFile()){
            ois = new ObjectInputStream((new FileInputStream(file)));
            customer = (ArrayList<person>)  ois.readObject();
            ois.close();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        customer.add(this);
        oos.writeObject(customer);
        JOptionPane.showMessageDialog(null, "Customer Added. Your Account Id is: " + customer.get(customer.size() - 1).id);
        oos.close();
        for (person i : customer) {
            System.out.println(i.name + " Account Number: " + i.id + "Address: " + i.address);
        }
    }


}
