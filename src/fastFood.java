import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class fastFood extends item{
    public fastFood(String name, int price, String path) throws IOException, ClassNotFoundException {
        super(name, price, path);
        File file = new File("fastFoods.dat");
        ObjectInputStream ois;
        ArrayList<item> fastFoods = new ArrayList<>();
        if(file.isFile()){
            ois = new ObjectInputStream((new FileInputStream(file)));
            fastFoods = (ArrayList<item>) ois.readObject();
            ois.close();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        fastFoods.add(this);
        oos.writeObject(fastFoods);
        JOptionPane.showMessageDialog(null, fastFoods.get(fastFoods.size() - 1).name + " added. Item id is: " + fastFoods.get(fastFoods.size() - 1).id);
        oos.close();
        for(item i : fastFoods)
        {
            System.out.println(i.name + " Food ID: " + i.id + " " + i.price);
        }
    }


}
