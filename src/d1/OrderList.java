package d1;

import java.util.AbstractList;
import java.util.ArrayList;

public class OrderList<E> extends AbstractList<E> {
    private ArrayList<E> orders;

    public OrderList() {
        orders = new ArrayList<>();
    }

    @Override
    public E get(int index) {
        return orders.get(index);
    }

    @Override
    public boolean add(E order) {
        return orders.add(order);
    }

    @Override
    public E remove(int index) {
        return orders.remove(index);
    }

    @Override
    public int size() {
        return orders.size();
    }

    public static void main(String[] args) {
        OrderList<String> orderList = new OrderList<>();
        orderList.add("Order 1");
        orderList.add("Order 2");
        System.out.println("First Order: " + orderList.get(0)); // Output: Order 1
        orderList.remove(0);
        System.out.println("First Order after removal: " + orderList.get(0)); // Output: Order 2
    }
}