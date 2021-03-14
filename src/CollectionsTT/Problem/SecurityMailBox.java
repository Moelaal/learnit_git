package CollectionsTT.Problem;

public class SecurityMailBox {
    public boolean haveAccess(User user){
        if (user.getRol() == Role.ADMIN){
            return true;
        }else{
            return false;
        }
    }
}
