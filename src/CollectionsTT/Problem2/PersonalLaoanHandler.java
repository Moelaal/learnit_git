package CollectionsTT.Problem2;

public class PersonalLaoanHandler implements LoanHandler{
    private Validator validator;

    public PersonalLaoanHandler(Validator validator){
        this.validator = validator;
    }
    @Override
    public void approveLoan(User user) {
        if (validator.isValid(user)){

        }
    }
}
