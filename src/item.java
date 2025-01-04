import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;


public class item implements Serializable{
    public String name;
    public int id, price;

    public item(String name, int price, String path) throws IOException, ClassNotFoundException {
        this.name = name;
        this.id = generateId(path);
        this.price = price;
    }

    private int generateId(String path) throws IOException, ClassNotFoundException {
        Random random = new Random();
        getFoodList list = new getFoodList();
        ArrayList<item> foodList = list.getList(path);
        if(foodList == null){
            int id = random.nextInt(9000) + 1000;
            return id;
        }
        else {
            int count = 0;
            while(true){
                int itemId = random.nextInt(9000) + 1000;
                for (item item : foodList) {
                    if (itemId == item.id)
                        count++;
                    if (count == 0) {
                        return itemId;
                    }
                }
            }
        }
    }


}