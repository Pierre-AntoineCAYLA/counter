package compteur;

public class Main {

	public static void main(String[] args) {
int j=30;

		Counter counter = new Counter();
		System.out.println(counter.getValue());
		for(int i=0;i< j; i++)
		{
		counter.inc();
		System.out.println(counter.getValue());
		}		
		System.out.println(counter);
		
		
int k=30;		
		
		Counter counter2 = new Counter();
		System.out.println(counter2.getValue());
		for(int i=0;i< k; i++)
		{
		counter2.inc();
		System.out.println(counter2.getValue());
		}		
		System.out.println(counter2);
		
int l=30;		
		
		Counter counter3 = new Counter();
		System.out.println(counter3.getValue());
		for(int i=0;i< l; i++)
		{
		counter3.inc();
		System.out.println(counter3.getValue());
		}		
		System.out.println(counter3);
		
		System.out.println(counter.equales(counter2, counter3));

	}

}
