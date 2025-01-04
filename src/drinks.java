import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class drinks extends item{
    public drinks(String name, int price, String path) throws IOException, ClassNotFoundException {
        super(name, price, path);
        File file = new File("drinks.dat");
        ObjectInputStream ois;
        ArrayList<item> drink = new ArrayList<>();
        if(file.isFile()){
            ois = new ObjectInputStream((new FileInputStream(file)));
            drink = (ArrayList<item>) ois.readObject();
            ois.close();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        drink.add(this);
        oos.writeObject(drink);
        JOptionPane.showMessageDialog(null, drink.get(drink.size() - 1).name + " added. Item id is: " + drink.get(drink.size() - 1).id);
        oos.close();
        for(item i : drink)
        {
            System.out.println(i.name + " Food ID: " + i.id + " " + i.price);
        }
    }


}
