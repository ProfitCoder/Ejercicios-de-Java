//ProfitCoder    13:37    20/03/2026

public class Newspaper extends Publication{
	//Atributtes
	private int numberNews;
	
	public Newspaper(String isbn, String title, int year,int numberNews){
		super(isbn, title, year);
		this.numberNews = numberNews;
	}
}