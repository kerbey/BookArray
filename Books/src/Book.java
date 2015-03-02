/*uml (unified modeling language) diagram on midterm example:(first row) class vehicle comes with (second row)attributes/objects
private wheels (int),color(string),gas mileage,(third row) getters and setters, mutators; (encapsulation will be discussed later) 
 public setWheel this.wheel has to be used again; toString method for attributes
 authentification quiz w/ overloading methods
 */
public class Book
{
	private String title, author;
	private short numberOfPages;// <-could also be short

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