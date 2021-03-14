package CollectionsTT.Problem;

public class SingleResponsibility {
    public static void main(String[] args) {
        MailBoxSettingsService mailbox = new MailBoxSettingsService();
        User user = new User();
        mailbox.changeSecondaryMail(user,"medo.elaal@gmial.com");
        SecurityMailBox securityMailBox = new SecurityMailBox();
        if(securityMailBox.haveAccess(user)){
            user.sendMoney(new User(),32432);
        }

    }
}
