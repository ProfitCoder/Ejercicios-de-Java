//ProfitCoder    13:37    20/03/2026

public class Excercise7{
	public static void main(String [] args){
		Publication[] publications = new Publication[3];
		
		publications[0] = new Book("123456", "The Nightmares", 2007);
		publications[1] = new Newspaper("444555", "Understandable Languaje", 2019, 344);
		publications[2] = new Publication("456789", "Hello world", 1995);
		
		for(int i = 0 ; i < 3 ; i++)
			System.out.println("\n" + publications[i]);
		System.out.println();

		//First Borrow
		((Book)publications[0]).lend();
			if (((Book)publications[0]).isBorrowed()) {
				System.out.println("The book " + publications[0].title + " is borrowed\n");
		}
		
		/*
		//Second Borrow
		publications [1].lend();
			if (((Libro)publications [1]).isBorrowed()) {
				System.out.println("The book is borrowed\n");
		}
		
		//Third Borrow
		publications [2].lend();
			if (((Libro)publications [2]).isBorrowed()) {
				System.out.println("The book is borrowed\n");
		}
		*/
		
		/*
		We comment this whole code because is not working, we have a error with the herence
		*/
		
	}
}