package hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Actor> queue;
    Random random = new Random();

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> repeatInQueue = new ArrayList<>();
        List<Actor> releasedActors = new ArrayList<>();
        boolean repeatOrder;
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                repeatOrder = random.nextBoolean();
                if (repeatOrder) {
                    releasedActors.add(actor);
                    System.out.println(actor.getName() + " вышел из очереди");
                } else {
                    actor.setMakeOrder(false);
                    actor.setTakeOrder(false);
                    repeatInQueue.add(actor);
                    System.out.println(actor.getName() + " вышел из очереди, но не вышел из магазина");
                }
            }
        }
        releaseFromMarket(releasedActors);
        for (Actor actor : repeatInQueue) {
            takeInQueue(actor);
            queue.remove(actor);
        }
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    public boolean checkActorInMarket() {
        return queue.isEmpty();
    }
}