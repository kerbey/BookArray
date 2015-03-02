
public class Volume
{
	private  String volumeName;
	private short numberOfBooks;
	private Book [] books;//=new Book [1];


	public Volume(String volumeName, short numberOfBooks, Book[] bookArray)
	{
		setVolumeName(volumeName);
		setNumberOfBooks(numberOfBooks);
		setBookArray(bookArray);
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
		for(int x=0;x<books.length;x++)
		{
                 System.out.println("book Number: "+(x+1)+"; author: "+books[x].getAuthor()+"; book title: "
                 +books[x].getTitle()+"; number of pages "+books[x].getNumberOfPages());
		}
	}
}
