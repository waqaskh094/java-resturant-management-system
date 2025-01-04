import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class delFood {
    public getFoodList foodList = new getFoodList();
    public ArrayList<item> foodArray;
    public ArrayList<item> delArray;

    public delFood()throws IOException, ClassNotFoundException{

    }

    public boolean delFoodItem(String name, int id, String path) throws IOException, ClassNotFoundException{
        System.out.println(path);
        File file = new File(path);
        File file2 = new File("deleted_"+path);
        ObjectOutputStream oos, oos1;
        ObjectInputStream ois = null, ois1 = null;
        foodArray = foodList.getList(path);
        delArray = new ArrayList<>();
        ListIterator li = foodArray.listIterator();
        boolean found = false;
        while (li.hasNext()) {
            item it = (item) li.next();
            if(it.name.equals(name) && it.id == id){
                if (file2.isFile()) {
                    ois1 = new ObjectInputStream(new FileInputStream(file));
                    delArray = (ArrayList<item>) ois1.readObject();
                    ois.close();
                }
                oos1 = new ObjectOutputStream(new FileOutputStream(file2));
                delArray.add(it);
                oos1.writeObject(delArray);
                li.remove();
                found = true;
                for(item Item : delArray){
                    System.out.println("Name: " + Item.name );
                }
            }

        }
        if(found){
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(foodArray);
            oos.close();
            JOptionPane.showMessageDialog(null, "Food Item Deleted Successfully.");
        }
        else
            JOptionPane.showMessageDialog(null, "Food Name or Id is in correct.");
        return found;
    }
}
