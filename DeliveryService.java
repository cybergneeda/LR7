import java.util.Map;

public class DeliveryService implements Observer {
    private int deliveryTime = 1;
    Subject shop; 

public DeliveryService(Subject shop)
{
    this.shop=shop;
    shop.registerObserver(this);
}

public void update(String string, int number,Map <String, Integer> price,Map<String, Integer> quantity)
{
    if (price.containsKey(string))
    {
    if (quantity.get(string)>0)
    {
        String form="часов";
        if (deliveryTime%10==1&&deliveryTime%100!=11)
            form="час";
        if ((deliveryTime%10==2&&deliveryTime%100!=12) || (deliveryTime%10==3&&deliveryTime%100!=13) || (deliveryTime%10==4&&deliveryTime%100!=14))
            form="часа";
        System.out.printf("Ваш заказ - " +string+" - будет доставлен через "+deliveryTime+++" %s\n",form);} 
    }}}
