package SpringBankingApp.Model;

public class Statement {

	String date;
	Account act;
	
    Statement()
    {
    	
    }
	public Account getAct() {
		return act;
	}
	public void setAct(Account act) {
		this.act = act;
	}
	Statement(String date, Account act)
	{
		this.date=date;
		this.act=act;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	
}
