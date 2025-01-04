import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;


public class person implements Serializable{
    public String name, password, phoneNum, address;
    public int id;

    public person(String name, String password, String phoneNum, String address) throws IOException, ClassNotFoundException{
        this.name = name;
        this.password = password;
        this.phoneNum = phoneNum;
        this.address = address;
        this.id = generateId();
    }




    public int generateId() throws IOException, ClassNotFoundException {
        Random random = new Random();
        int accountId ;
        getCustomerList list = new getCustomerList();
        ArrayList<person> customerList = list.getList();
        if(customerList == null){
            accountId = random.nextInt(9000) + 1000;
            return accountId;
        }
        int count = 0;

        while(true){
            accountId = random.nextInt(9000) + 1000;
            for (person person : customerList) {
                if (accountId == person.id)
                    count++;
                if (count == 0) {
                    return accountId;
                }
            }
        }
    }
}
