package model;

public class Statement {

	int date;

	int statementId;
	public int getStatementId() {
		return statementId;
	}

	public void setStatementId(int statementId) {
		this.statementId = statementId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	Account account;
	public Statement(int date, Account acc, int statementId)
	{
		this.date=date;
		this.statementId=statementId;
		this.account=acc;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}


}
