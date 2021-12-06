public class UserService implements IUserService {

 
   @Override
   public  String createUserAcount(String name, String address, String age, String phonenum){
       UserRepository userRepo = new UserRepository();
       EmailService emailservice = new TwillioEmailService( Some credentials );
       //Implementation Logic
       ...
       userRepo.save(Some object params);
       emailservice.sendmail(some object params);
       ...
       return "Some Response String";
   };
}
