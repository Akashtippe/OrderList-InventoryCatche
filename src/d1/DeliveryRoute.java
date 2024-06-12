package d1;

import java.util.AbstractSequentialList;
import java.util.LinkedList;
import java.util.ListIterator;

public class DeliveryRoute<E> extends AbstractSequentialList<E> {
    private LinkedList<E> deliveryPoints;

    public DeliveryRoute() {
        deliveryPoints = new LinkedList<>();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return deliveryPoints.listIterator(index);
    }

    @Override
    public int size() {
        return deliveryPoints.size();
    }

    @Override
    public boolean add(E deliveryPoint) {
        return deliveryPoints.add(deliveryPoint);
    }

    @Override
    public E remove(int index) {
        return deliveryPoints.remove(index);
    }

    public static void main(String[] args) {
        DeliveryRoute<String> deliveryRoute = new DeliveryRoute<>();
        deliveryRoute.add("Order 1");
        deliveryRoute.add("Order 2");
        System.out.println("First Delivery Point: " + deliveryRoute.get(0)); 
        deliveryRoute.remove(0);
        System.out.println("First Delivery Point after removal: " + deliveryRoute.get(0)); 
    }
}
