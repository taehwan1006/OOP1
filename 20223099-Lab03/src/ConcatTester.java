
public class ConcatTester {
	public static void main(String[] args)
	{
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		
		String str_ = article.concat(" " + animal1).concat(" " + action).concat(" " + animal2);
		System.out.println(str_);
		System.out.println(str_.length());
	}
}