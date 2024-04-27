import java.util.Map;

public class Accounting implements Observer{
    private int income = 0;
    private final String PASSWORD = "admin";
    private static Accounting uniqueAccounting;
    static Subject shop;
    private Accounting(Subject shop) {
        Accounting.shop=shop;
        shop.registerObserver(this);
    }

    public static Accounting geAccounting(Subject shop)
    {
        if (uniqueAccounting==null)
            uniqueAccounting=new Accounting(shop);      
        return uniqueAccounting;
    }

    public void getIncome(String psw){
        if (psw.equals(PASSWORD)) 
            System.out.println("Your income is " + income);
        else 
            System.out.println("Неверный пароль");
    }

    public void update(String string,int newOrder,Map <String, Integer> price,Map<String, Integer> quantity){
        if (string.indexOf(" ") >= 0)
        {
            if(string.substring(0, 6).equals("income"))
                getIncome(string.substring(string.indexOf(" ")+1));
            else
                System.out.println("Неверная команда");
        }
        else {
            if (price.containsKey(string))
        {
            if (quantity.get(string)>0)
                income += newOrder;
        }
            else
                if (!string.equals("товары")) 
                    System.out.println("Товара "+string+" нет в наличии"); 
    }}}
