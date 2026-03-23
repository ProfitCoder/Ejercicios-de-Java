//ProfitCoder    13:37    20/03/2026

public class Book extends Publication implements lendable{
	//Atributtes
	private boolean borrow;
	
	//Constructors
	public Book(String isbn, String title, int year){
		super(isbn, title, year);
		this.borrow = false;
	}
	
	//Methods
	@Override
	public void lend(){
		this.borrow = true;
	}
	
	@Override
	public void returned(){
		this.borrow = false;
	}
	
	@Override
	public boolean isBorrowed(){
		return borrow;
	}
	
	@Override
	public String toString(){
		return super.toString() + String.format("Lend: %s\n",borrow?"Yes":"No");
	}
}