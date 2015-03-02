
public class Book
{
	private String title, author;
	private short numberOfPages;

	public Book(String title, String Author, short numberOfPages)
	{
		setTitle(title);
		setAuthor(Author);
		setNumberOfPages(numberOfPages);
	}
	public String ToString()
	{
		return " Title is: "+getTitle()+"; Author is: "+getAuthor()+"; numberOfPages is: "+getNumberOfPages();
	}
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public short getNumberOfPages()
	{
		return numberOfPages;
	}

	public void setNumberOfPages(short numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
}
