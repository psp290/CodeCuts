import java.util.Scanner;
class CodeCut1{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a[]=new int [200];
		int b[]=new int [200];
		int max=0;

		for(int i=0;i<c;i++)
		{
			a[i]=0;
		}
		for(int i=0;i<c;i++)
		{
			int x=sc.nextInt();
			b[i]=x;
			a[x]=1;

			if(x>max)
			{max=x;}
		}
		for(int i=0;i<max;i++)
		{
			if(a[i]==0)
			{System.out.print(i +" ");}
		}

	}
}
