package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class books
{
	private int bid;
	private String bname;
	
	books(int bid, String bname)
	{
		this.bid=bid;
		this.bname=bname;
	}
	public void showBook()
	{
		System.out.println("bid: " + bid + "bname: " +bname);
	}
	@Override
	public String toString() {
		return "books [bid=" + bid + ", bname=" + bname + "]";
	}
	
}
public class BookSetExample {

	public static void main(String[] args) {
			
		books java = new books(101,"Let us java");
		books testing = new books(102,"Testing");
		books c = new books(103,"Let us C");
		
		Set<books> bookSet = new HashSet<books>();
		
		bookSet.add(java);
		bookSet.add(testing);
		bookSet.add(c);
		
		//System.out.println(bookSet);
		
		Iterator itr = bookSet.iterator();
		
		while(itr.hasNext()) {
			books book = (books) itr.next();
			System.out.println(book);
		}
	}
}
