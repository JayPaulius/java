/*
 * 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в очередь/освобождение из очереди, принятие/отдача заказа
 * 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление состояния магазина
 * 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит список людей в очереди в различных статусах
 */

public class Homework1_8 {
    public static void main(String[] args) {
        Human buyer1 = new Human("name1");
        Human buyer2 = new Human("name2");
        Market market1 = new Market();
        market1.update(buyer1);
        market1.update(buyer2);
        market1.update(buyer1);
        market1.update(buyer2);
    }
}
