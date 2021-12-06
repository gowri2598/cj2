public class OrderService implements IOrderService {

  
   @Override
   public  String createOrder(String username, List<Item> items, Address ShippingAddress ){
 
       OrderRepository orderRepo = new OrderRepository();
       //Implementation Logic
       ...
       orderRepo.save(Some object params);
       ...
       return "Some Response String";
   };
 
   @Override
   public String trackOrderStatus(String orderId){
 
       OrderRepository orderRepo = new OrderRepository();
       //Implementation Logic
       ...
       orderRepo.findOrderById( Some object params );
       ...
       return "Some Response String";
   };
  
   @Override
   public String makePayment(String orderId){
 
          OrderRepository orderRepo = new OrderRepository();
          PaymentProvider payprovider = new PaymentProvider();
       //Implementation Logic
       ...
       payprovider.makePayment( Some object params );
       orderRepo.update(Some object params);
       ...
       return "Some Response String";
   };

}
