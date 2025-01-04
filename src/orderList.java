import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class orderList {
    public ArrayList<order> orderlist;
    public orderList(){



    }


    public ArrayList<order> getList() throws IOException, ClassNotFoundException{
        File file = new File("orders.dat");
        if(file.isFile()){
            System.out.println("Orders file is present");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            orderlist = (ArrayList<order>) ois.readObject();
            System.out.println("FIle read");
            ois.close();
        }
        else
            System.out.println("No file");
        return orderlist;
    }
}
