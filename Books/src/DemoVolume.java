import java.util.Scanner;
public class DemoVolume 
{
	public static void main(String[]args)
	{
		short numberOfBooks, numberOfPages;
		String volumeName=null, bookTitle, bookAuthor, bookProperties = null;

		Scanner keyboard=new Scanner(System.in);
		System.out.println("enter in the volume name");
		volumeName=keyboard.nextLine();
		System.out.println("how many books are there?");
		numberOfBooks=keyboard.nextShort();
		Book[] books=new Book [numberOfBooks];
		for (int x=0; x<books.length; x++)
		{//number of books will set up this loop
			keyboard.nextLine();
			System.out.println("enter in your book title.");
			bookTitle=keyboard.nextLine();
			System.out.println("enter in the book author.");
			bookAuthor=keyboard.nextLine();
			System.out.println("how many pages are there?");
			numberOfPages= keyboard.nextShort();
// book information is entered in
			Book book=new Book(bookTitle, bookAuthor, numberOfPages);
			books[x]=book;
			//book information is passed into the array
			//bookProperties=book.ToString();
		}
		Volume volume1= new Volume (volumeName, numberOfBooks, books);
		//volume's to String method is called to print book information
		volume1.ToString();
	}	
}
