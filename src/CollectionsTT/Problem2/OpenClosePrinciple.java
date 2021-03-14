package CollectionsTT.Problem2;

public class OpenClosePrinciple {
    public static void main(String[] args) {
        LoanHandler loanHandler = new PersonalMortgageHandler(new PersonalMortgageValidator());
        User user = new User();
        loanHandler.approveLoan(user);

        LoanHandler loanHandler2 = new PersonalLaoanHandler(new PersonalLoanValidator());
        loanHandler2.approveLoan(user);
    }
}
