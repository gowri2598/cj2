public interface IOrderService{
   String createOrder(Order order);
   String trackOrderStatus(String orderId);
   String makePayment(String orderId);
}
