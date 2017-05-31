/*
 * Done by: Talib Bacchus
 * This program demonstrates sorting using "Book.java"
 * A book has an title, author, publisher, and a copyright date
 * The books are then added to an array list and their titles are 
 * then converted into a numerical value
 * The array list is then sorted by bubble sort, selection sort and insertion sort
 * respectively using the numeric value of the titles of the books.
 * 
 */

import java.util.ArrayList;
public class SortingLimitedLibrary {

	public static void main(String[] args) {
		Book b1 = new Book("B", "John", "Randy", 1900);
		Book b2 = new Book("D", "Smith", "Brian", 1800);
		Book b3 = new Book("S", "Alex", "Mark", 1700);
		Book b4 = new Book("C", "Tariq", "Matt", 1600);
		Book b5 = new Book("A", "Ahmad", "Luke", 1500);
		Book b6 = new Book("F", "Vic", "Cruz", 1400);
		Book b7 = new Book("Q", "Lebron", "James", 1300);
		Book b8 = new Book("I", "Fechter","Ronald", 1200);
		Book b9 = new Book("L", "Kelly","Oher", 1100);
		Book b10 = new Book("V", "Micael","Jones", 1000);

		ArrayList <Book> b = new ArrayList <Book>();
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
		b.add(b5);
		b.add(b6);
		b.add(b7);
		b.add(b8);
		b.add(b9);
		b.add(b10);


		System.out.println("Unsorted Library:");
		for (int i = 0; i<b.size(); i++)
		{
			System.out.println("ASCII equivalent " + StringtoASCII(b.get(i).getTitle()));
			System.out.print("Title: " +  b.get(i).getTitle() + " ");
			System.out.print("Author: " + b.get(i).getAuthor() + " ");
			System.out.print("Publisher: " + b.get(i).getPublisher() + " ");
			System.out.print("Copyright Date: " + b.get(i).getCrdate() + " ");
			System.out.println();

		}


		bubbleSort(b);
		System.out.println("Bubble Sort Library:");
		for(int i =0; i<b.size(); i++)
		{
			System.out.println("*******************");
			System.out.println(StringtoASCII(b.get(i).getTitle()));
			System.out.println("Publisher: " + b.get(i).getPublisher());
			System.out.println("Title: " + b.get(i).getTitle());
			System.out.println("Author: "+ b.get(i).getAuthor());
			System.out.println("Copyright Date: " + b.get(i).getCrdate());
			System.out.println("*******************");
		}
		
		selectionSort(b);
		System.out.println("Slection Sort Library:");
		for(int i =0; i<b.size(); i++)
		{
			System.out.println("*******************");
			System.out.println(StringtoASCII(b.get(i).getTitle()));
			System.out.println("Publisher: " + b.get(i).getPublisher());
			System.out.println("Title: " + b.get(i).getTitle());
			System.out.println("Author: "+ b.get(i).getAuthor());
			System.out.println("Copyright Date: " + b.get(i).getCrdate());
			System.out.println("*******************");
		}
		insertionSort(b);
		System.out.println("Insertion Sort Library:");
		for(int i =0; i<b.size(); i++){
			System.out.println("*******************");
			System.out.println(StringtoASCII(b.get(i).getTitle()));
			System.out.println("Publisher: " + b.get(i).getPublisher());
			System.out.println("Title: " + b.get(i).getTitle());
			System.out.println("Author: "+ b.get(i).getAuthor());
			System.out.println("Copyright Date: " + b.get(i).getCrdate());
			System.out.println("*******************");
		}


	}
	public static long StringtoASCII (String title)
	{
		StringBuilder sb = new StringBuilder();
		String ascString = null;
		long asciiInt;
		for (int i = 0; i < title.length(); i++){
			sb.append((int)title.charAt(i));

		}
		ascString = sb.toString();
		asciiInt = Long.parseLong(ascString);
		return asciiInt;
	}
	public static void bubbleSort(ArrayList<Book> array)
	{

		for (int i = (array.size() - 1); i >= 0; i--)
		{
			for (int j = 1; j <= i; j++)
			{


				if (StringtoASCII(array.get(j-1).getTitle()) > StringtoASCII(array.get(j).getTitle()))
				{
					
					System.out.println();
					/*Swapping using Bubble Sort*/

					//Book b1=new Book(null, null, null, j);
					Book temp = array.get(j-1);
					String tmpTitle= temp.getTitle();
					String tmpPublisher = temp.getPublisher();
					String tmpAuthor=temp.getAuthor();
					int tmpCrdate=temp.getCrdate();


					//Reset j-1'th element to j's contents
					array.get(j-1).setTitle(array.get(j).getTitle());

					array.get(j-1).setPublisher(array.get(j).getPublisher());
					array.get(j-1).setCrdate(array.get(j).getCrdate());
					array.get(j-1).setAuthor(array.get(j).getAuthor());

					//Set j to hold j -1 contents
					array.get(j).setTitle(tmpTitle);
					array.get(j).setPublisher(tmpPublisher);
					array.get(j).setCrdate(tmpCrdate);
					array.get(j).setAuthor(tmpAuthor);


				}

			}

		}

	}

	public static void selectionSort (ArrayList<Book> array)
	{
		for(int i = 0; i < array.size() - 1; i++)
		{

			int index = i;
			for(int j =i +1 ;j< array.size(); j++)
			{
				
				if (StringtoASCII(array.get(j).getTitle()) < StringtoASCII(array.get(index).getTitle()))
				{

					System.out.println("j is:" +j);

					index = j;
					System.out.println("index is:" +index);





				}
				Book temp = array.get(index);
				String tmpTitle= temp.getTitle();
				String tmpPublisher = temp.getPublisher();
				String tmpAuthor=temp.getAuthor();
				int tmpCrdate=temp.getCrdate();

				//Reset j-1'th element to j's contents
				array.get(index).setTitle(array.get(i).getTitle());;
				array.get(index).setPublisher(array.get(i).getPublisher());
				array.get(index).setCrdate(array.get(i).getCrdate());
				array.get(index).setAuthor(array.get(i).getAuthor());

				array.get(i).setTitle(tmpTitle);
				array.get(i).setPublisher(tmpPublisher);
				array.get(i).setAuthor(tmpAuthor);
				array.get(i).setCrdate(tmpCrdate);

			}
		}
	}
	public static void insertionSort(ArrayList<Book> array)
	{


		for(int i =1; i <array.size(); i++) 
		{

			String title=array.get(i).getTitle();
			String publisher=array.get(i).getPublisher();
			int crd=array.get(i).getCrdate();
			String Auth=array.get(i).getAuthor();

			int j = i;


			while(j >0 && StringtoASCII(array.get(j-1).getTitle()) > StringtoASCII(title))
			{

				array.get(j).setTitle(array.get(j-1).getTitle());;
				array.get(j).setPublisher(array.get(j-1).getPublisher());
				array.get(j).setCrdate(array.get(j-1).getCrdate());
				array.get(j).setAuthor(array.get(j-1).getAuthor());
				j--;
			}

			array.get(j).setTitle(title);;
			array.get(j).setPublisher(publisher);
			array.get(j).setCrdate(crd);
			array.get(j).setAuthor(Auth);
		}
	}
}


