import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Buyer> buyers = new ArrayList<>();
    Deque<Buyer> buyersQueue = new ArrayDeque<>();
    
    @Override
    public void update(Buyer actor) {
        if (actor.getMarketState().equals(Buyer.MarketState.LeftMarket)){
            actor.setMarketState(Buyer.MarketState.ComeMarket);
            acceptToMarket(actor);
            takeInQueue(actor);
            takeOrders();
        }
        else{
            if (!buyersQueue.peekFirst().equals(actor)){
                System.out.printf("Перед покупателем %s есть покупатели в очереди\n", actor.getName());
            }
            else{
                actor.setMarketState(Buyer.MarketState.LeftMarket);
                giveOrders();
                releaseFromQueue();
                releaseFromMarket(actor);
            }
        }
    }
    
    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.printf("Покупатель %s пришел в магазин\n", actor.getName());
        buyers.add(actor);
    }
    
    @Override
    public void releaseFromMarket(Buyer actor) {
        System.out.printf("Покупатель %s ушел из магазина\n", actor.getName());
        buyers.remove(actor);
    }
    
    @Override
    public void takeInQueue(Buyer actor) {
        System.out.printf("Покупатель %s встал в очередь \n", actor.getName());
        buyersQueue.add(actor);
    }

    @Override
    public void takeOrders() {
         System.out.println("Покупатель " + buyersQueue.peekLast().getName() + " сделал заказ");
         buyersQueue.peekLast().setMakeOrder();
    }

    @Override
    public void giveOrders() {
        System.out.println("Покупатель " + buyersQueue.peekFirst().getName() + " забрал заказ");
        buyersQueue.peekFirst().setTakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        System.out.println("Покупатель " + buyersQueue.pollFirst().getName() + " вышел из очереди ");
    }
}
