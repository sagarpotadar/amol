package pack78;

public class Beta
{
	public static void main(String[]args)
	{
		int a[] = {10,11,12,13,14,15};
		
		int size =a.length;
		System.out.println("size="+size);
		
		for ( int i=0 ; i<6 ; i++)
			System.out.println(a[i]);
		
//		a[0]=a[0]^a[5];
//		a[5]=a[0]^a[5];
//		a[0]=a[0]^a[5];
//		
//		a[1]=a[1]^a[4];
//		a[4]=a[1]^a[4];
//		a[1]=a[1]^a[4];
//		
//		a[2]=a[2]^a[3];
//		a[3]=a[2]^a[3];
//		a[2]=a[2]^a[3];
		
		
		
		int c;
		
		c=a[0];
		a[0]=a[5];
		a[5]=c;
		
		c=a[1];
		a[1]=a[4];
		a[4]=c;
		
		c=a[2];
		a[2]=a[3];
		a[3]=c;
		
		System.out.println("size="+size);
		
		for ( int i=0 ; i<6 ; i++)
			System.out.println(a[i]);
		
		
		
				
	}

}
