import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class desiFoods extends item{
    public desiFoods(String name, int price, String path) throws IOException, ClassNotFoundException {
        super(name, price, path);
        File file = new File("desiFood.dat");
        ObjectInputStream ois;
        ArrayList<item> desiFood = new ArrayList<>();
        if(file.isFile()){
            ois = new ObjectInputStream((new FileInputStream(file)));
            desiFood = (ArrayList<item>) ois.readObject();
            ois.close();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        desiFood.add(this);
        oos.writeObject(desiFood);
        JOptionPane.showMessageDialog(null, desiFood.get(desiFood.size() - 1).name + " added. Item id is: " + desiFood.get(desiFood.size() - 1).id);
        oos.close();
        for(item i : desiFood)
        {
            System.out.println(i.name + " Food ID: " + i.id + " " + i.price);
        }
    }


}
