import java.io.*;
import java.util.ArrayList;

public class getCustomerList {
    public ArrayList<person> customerList;
    public getCustomerList(){


    }

    public ArrayList<person> getList() throws IOException, ClassNotFoundException {
        System.out.println("getList method");
        File file = new File("Customer.dat");
        if(file.isFile()){
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            customerList = (ArrayList<person>) ois.readObject();
            System.out.println("FIle read");
            ois.close();
        }
        else
            System.out.println("No file");
        return customerList;
    }


}
