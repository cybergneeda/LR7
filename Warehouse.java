import java.util.Map;

public class Warehouse implements Observer {
    
    Subject shop;

    public Warehouse(Subject shop){
        this.shop=shop;
        shop.registerObserver(this);   
    }

    public void update(String string, int number,Map <String, Integer> price,Map<String, Integer> quantity){          
    if (price.containsKey(string))    
    {             //обрабаьывает запрос на покупку
        int prevValue = quantity.get(string);
        if (prevValue == 0)
            System.out.println("Товара \"" + string + "\" нет на складе.");      
        else {
            System.out.println("Спасибо за покупку!");
            quantity.put(string, --prevValue);
        }}
    else 
        if (string.equals("товары"))
            printWarehouse(quantity);
        }

    public void printWarehouse(Map<String, Integer> quantity)
    {                      
        for (var pr: quantity.entrySet()) 
            System.out.println(pr + " шт.");   
    }}
