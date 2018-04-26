import java.sql.Date;

public class Statement {

	int date;
	String content;
	
	Statement(int date, String content)
	{
		this.date=date;
		this.content=content;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
