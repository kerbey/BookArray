//import java.awt.print.Book;

public class Volume//cycle class needs getter and setters y7
{
	private  String volumeName;
	private short numberOfBooks;
	private Book [] books;//=new Book [1];


	public Volume(String volumeName, short numberOfBooks, Book[] bookArray)
	{
		setVolumeName(volumeName);//this.volumeName=volumeName/*.toString()*/;
		setNumberOfBooks(numberOfBooks);
		setBookArray(bookArray);//this.numberOfBooks=numberOfBooks;
		//System.out.println("number of Books"+this.getNumberOfBooks());
		//System.out.println("volumename ="+this.getVolumeName());
	}


	public void setBookArray(Book[] bookArray)
	{
		this.books=bookArray;		
	}

	public Book[] getBookArray()
	{

		return books;
	}

	public String getVolumeName()
	{
		return volumeName;
	}


	public void setVolumeName(String volumeName)
	{
		this.volumeName = volumeName;
	}


	public short getNumberOfBooks()
	{
		return numberOfBooks;
	}


	public void setNumberOfBooks(short numberOfBooks)
	{
		this.numberOfBooks = numberOfBooks;
	}


	public void ToString()
	{
		getBookArray();
		String output="volumeName: "+getVolumeName()+"; number of books in volume : "+getNumberOfBooks();
		System.out.println("\n"+output+"\n");
		for(int x=0;x<books.length;x++)//for (Book b:books)
		{
			System.out.println("book Number: "+(x+1)+"; author: "+books[x].getAuthor()+"; book title: "+books[x].getTitle()
			+"; number of pages "+books[x].getNumberOfPages());
		}
	}
}