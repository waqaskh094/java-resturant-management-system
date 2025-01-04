import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class order implements Serializable{
    public int orderID, customerId, price;
    public order(int customerId, int price)throws IOException, ClassNotFoundException{
        this.orderID = generateID();
        this.customerId = customerId;
        this.price = price;
    }

    private int generateID() throws IOException, ClassNotFoundException{
        Random random = new Random();
        orderList orderlist = new orderList();
        ArrayList<order> orders = orderlist.getList();
        if(orders == null){
            int id = random.nextInt(9000) + 1000;
            return id;
        }
        else{
            int count = 0;
            while (true){
                int itemId = random.nextInt(9000)+1000;
                for(int i = 0; i < orders.size(); i++){
                    if(itemId == orders.get(i).orderID)
                        count++;
                    if(count == 0){
                        return itemId;
                    }
                }
            }
        }
    }

}