package CollectionsTT.Problem;

public class User {
    private int id;
    private String primaryMail;
    private String secondaryMail;
    public Role rol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimaryMail() {
        return primaryMail;
    }

    public void setPrimaryMail(String primaryMail) {
        this.primaryMail = primaryMail;
    }

    public String getSecondaryMail() {
        return secondaryMail;
    }

    public void setSecondaryMail(String secondaryMail) {
        this.secondaryMail = secondaryMail;
    }

    public Role getRol() {
        return rol;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }

    public void sendMoney(User userTo, int dollarAmount){

    }
}
