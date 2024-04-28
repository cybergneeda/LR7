import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShopDemo {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String string;
        int number;

        Map <String, Integer> price = new HashMap<>(); //ценник
        price.put("стол", 10000);
        price.put("шкаф", 50000);
        price.put("кресло", 7500);
        price.put("кухня", 150000);
        price.put("диван", 35000);
        price.put("кровать", 25000);

        Map<String, Integer> quantity = new HashMap<>();
        quantity.put("стол", 10);
        quantity.put("шкаф", 5);
        quantity.put("кресло", 5);
        quantity.put("кухня", 2);
        quantity.put("диван", 3);
        quantity.put("кровать", 2);

        Shop shop = new Shop();
        Accounting acc = Accounting.geAccounting(shop);
        DeliveryService ds = new DeliveryService(shop);
        Warehouse wh = new Warehouse(shop);
        
        System.out.print("\033[H\033[2J");
        System.out.println("Добро пожаловать в магазин мебели! В наличии столы, диваны, шкафы, кухни, кресла и многое другое!");
        System.out.println("Если Вы хотите совершить покупку, введите название мебели!");
        System.out.println("Для вывода в консоль текущей выручки введите \"income\",\" \"  и пароль администратора");
        System.out.println("Для просмотра количества товара на складе введите \"товары\"");
        System.out.println("Для завершения работы введите \"break\"");

        Scanner scanner = new Scanner(System.in,"ibm866");
        while (true) {
            string = scanner.nextLine().toLowerCase();
            if (string.equals("break")){
                scanner.close();
                break;
            } 
                else {    
                    if (price.containsKey(string))                   
                        number=price.get(string);                      
                    else
                        number=0;          
                    shop.notifyObservers(string,price,quantity);                 
                }}}}
