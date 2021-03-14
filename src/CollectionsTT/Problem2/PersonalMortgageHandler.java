package CollectionsTT.Problem2;

public class PersonalMortgageHandler implements LoanHandler {
    private Validator validator;
    public PersonalMortgageHandler(Validator validator){
        this.validator = validator;
    }
    @Override
    public void approveLoan(User user) {

    }
}
