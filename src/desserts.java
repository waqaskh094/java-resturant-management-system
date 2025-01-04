import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class desserts extends item{
    public desserts(String name, int price, String path) throws IOException, ClassNotFoundException {
        super(name, price, path);
        File file = new File("desserts.dat");
        ObjectInputStream ois;
        ArrayList<item> desserts = new ArrayList<>();
        if(file.isFile()){
            ois = new ObjectInputStream((new FileInputStream(file)));
            desserts = (ArrayList<item>) ois.readObject();
            ois.close();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        desserts.add(this);
        oos.writeObject(desserts);
        JOptionPane.showMessageDialog(null, desserts.get(desserts.size() - 1).name + " added. Item id is: " + desserts.get(desserts.size() - 1).id);
        oos.close();
        for(item i : desserts)
        {
            System.out.println(i.name + " Food ID: " + i.id + " " + i.price);
        }
    }


}
