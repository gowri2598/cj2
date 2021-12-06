public class Ecommerce implements IEcommerce {
 
   @Override
   String addItemToCart(Item item){
    
       CartRepository cartRepo = new CartRepository();
       //Implementation Logic
       ...
       cartRepo.save(Some item params);
       ...
       return "Some Response String";
   };
 
   @Override
   public String DeleteItemFromCart(Item item){
 
       CartRepository cartRepo = new CartRepository();
       //Implementation Logic
       ...
       cartRepo.delete(Some item params);
       ...
       return "Some Response String";
   };
 
   @Override
   public String UpdateItemInCart(Item item){
 
       CartRepository cartRepo = new CartRepository();
       //Implementation Logic
       ...
       cartRepo.updateIteminCart(Some item params);
       ...
       return "Some Response String";
   };
 
   @Override
   public String createOrder(String username, List<Item> items, Address ShippingAddress ){
 
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
 
   @Override
   public String createUserAcount(String name, String address, String age, String phonenum){
       // Creating a database connection
       var db = new DbConn();
       // Create a new user using raw SQL.
       db.sqlexec("INSERT INTO bla bla bla")
       // Sending an email to client for verification details
       var smtp = new SMTP();
       // Setting smtp.Host, UserName, Password and other parameters
       smtp.Send();
       //Implementation Logic
 
       return "Some Response String";
   };
}
