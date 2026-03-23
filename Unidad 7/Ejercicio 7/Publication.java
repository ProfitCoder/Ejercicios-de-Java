//ProfitCoder    13:37    20/03/2026

public class Publication{
	//Atributtes
	protected String isbn;
	protected String title;
	protected int year;
	
	//Constructors
	public Publication(String isbn, String title, int year){
		this.isbn = isbn;
		this.title = title;
		this.year = year;
	}
	
	//Methods
	@Override
	public String toString(){
		return String.format("ISBN: %s\nTitle: %s\nYear: %d",isbn,title,year);
	}
	
}