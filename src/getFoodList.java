import java.io.*;
import java.util.ArrayList;

public class getFoodList {
    public ArrayList<item> foodList;

    public getFoodList() {


    }

    public ArrayList<item> getList(String path) throws IOException, ClassNotFoundException {
        System.out.println(path);
        System.out.println("getList method");
        File file = new File(path);
        if (file.isFile()) {
            System.out.println("File is present");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            foodList = (ArrayList<item>) ois.readObject();
            System.out.println("FIle read");
            ois.close();
        } else
            System.out.println("No file");
        return foodList;
    }

}