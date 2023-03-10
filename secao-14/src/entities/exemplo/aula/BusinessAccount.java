package entities.exemplo.aula;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();

	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double noanLimit) {
		this.loanLimit = noanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0; // Descontando mais 2.0 do saldo
	}

}
