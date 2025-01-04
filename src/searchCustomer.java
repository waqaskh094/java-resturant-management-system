import java.io.IOException;
import java.util.ArrayList;

public class searchCustomer{
    public String password, accountID;
    public getCustomerList list = new getCustomerList();
    public ArrayList<person> customerList = list.getList();
    public searchCustomer(String accountID, String password) throws IOException, ClassNotFoundException {
        this.accountID = accountID;
        this.password = password;
    }

    public boolean login(){
        for(int i = 0; i < customerList.size(); i++){
            int acctID = Integer.parseInt(accountID);
            System.out.println(customerList.get(i).id + "   " + customerList.get(i).password);
            if(acctID == customerList.get(i).id && password.equals(customerList.get(i).password))
            {
                System.out.println("True");
                return true;
            }
            System.out.println("Inside For Loop");
        }
        return false;

    }

    public searchCustomer() throws IOException, ClassNotFoundException {
    }
}