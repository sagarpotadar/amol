package pack78;

public class Alpha 
{
	public static void main(String[]args)
	{
		int a[] = {10,11,12,13};
		
		int size =a.length;
		System.out.println("size="+size);
		
		for ( int i=0 ; i<4 ; i++)
			System.out.println(a[i]);
		
		int c;
		
		c=a[0];
		a[0]=a[3];
		a[3]=c;
		
		c=a[1];
		a[1]=a[2];
		a[2]=c;
		
		System.out.println("size="+size);
		
		for ( int i=0 ; i<4 ; i++)
			System.out.println(a[i]);
		
		
		
				
	}

}
