package CollectionsTT.Problem;

public class MailBoxSettingsService {

    private SecurityMailBox securityMailBox;
    {
        securityMailBox = new SecurityMailBox();
    }

    public void changeSecondaryMail(User user,String newSecondaryMail){
        if(securityMailBox.haveAccess(user)){
            user.setSecondaryMail(newSecondaryMail);
        }
    }
}
