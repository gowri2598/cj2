public class OrderService implements IOrderService {

  
 private final OrderRepository orderRepo;
   private final PaymentProvider payprovider;
 
   public OrderService(OrderRepository orderRepo, PaymentProvider payprovider){
       this.orderRepo = orderRepo;
       this.payprovider = payprovider;
   }
 
   @Override
   public String createOrder(String username, List<Item> items, Address ShippingAddress ){
        //Implementation Logic
       ...
       this.orderRepo.save(Some object params);
       ...
       return "Some Response String";
   };
 
   @Override
   public String trackOrderStatus(String orderId){
        //Implementation Logic
       ...
       this.orderRepo.findOrderById( Some object params );
       ...
       return "Some Response String";
   };
 
   @Override
   public String makePayment(String orderId){
        //Implementation Logic
       ...
       this.payprovider.makePayment( Some object params );
       this.orderRepo.update(Some object params);
       ...
       return "Some Response String";
   };

}
