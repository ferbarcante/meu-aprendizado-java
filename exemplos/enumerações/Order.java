package enumerações;

import java.util.Date;

public class Order {
    private Integer id;

    private Date moment;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer id, Date moment, OrderStatus status){
        this.id = id;
        this.status = status;
        this.moment = moment;

    }

    public void setStatus(OrderStatus status){
        this.status = status;
    }

    public String toString(){
        return "Order id: " + id + ", moment: " + moment + ", status: " + status;
    }
}
