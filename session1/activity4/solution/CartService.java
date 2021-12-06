public class CartService implements ICartService {
  @Override
  public String addItemToCart(Item item){
    
       CartRepository cartRepo = new CartRepository();
       //Implementation Logic
       ...
       cartRepo.save(Some object params);
       ...
       return "Some Response String";
   };
 
   @Override
   public String DeleteItemFromCart(Item item){
 
       CartRepository cartRepo = new CartRepository();
       //Implementation Logic
       ...
       cartRepo.delete(Some object params);
       ...
       return "Some Response String";
   };
 
   @Override
   public  String UpdateItemInCart(Item item){
 
       CartRepository cartRepo = new CartRepository();
       //Implementation Logic
       ...
       cartRepo.updateIteminCart(Some object params);
       ...
       return "Some Response String";
   };
 
}
