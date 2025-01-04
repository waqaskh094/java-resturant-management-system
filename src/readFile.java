import java.io.*;
import java.util.ArrayList;

public class readFile implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {



        System.out.println("\n\n");
        ArrayList<item> foodList = new ArrayList<>();
        File file1 = new File("desserts.dat");
        if (file1.isFile()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file1));
            foodList = (ArrayList<item>) ois.readObject();
            System.out.println("FIle read");
            ois.close();
        }
        else
            System.out.printf("No File");

        for (item item : foodList) {
            System.out.println(item.name);
        }
    }
}
