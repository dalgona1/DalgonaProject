public class Example04 
{
	public static void main(String[] args) 
	{
		Library lib = new Library();
		Book b;
		b = lib.GetNewBook(10,"프로그래밍 도서","박길동",10);
		b.PrintInfo();
	}
}
