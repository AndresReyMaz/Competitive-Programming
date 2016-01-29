import java.util.Scanner;
class Four{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[4];
		for(int k=0;k<n;k++){
			a[0]=sc.nextInt();
			a[1]=sc.nextInt();
			a[2]=sc.nextInt();
			a[3]=sc.nextInt();
			int max=0;
			int skip=-1;
			for(int i=0;i<4;i++){
				if(max<a[i]){
					max=a[i];
					skip=i;
				}
			}
			int sum=0;
			for(int i=0;i<4;i++){
				if(i!=skip)
					sum+=a[i];
			}
			if(a[skip]>=sum)
				System.out.println("Impossible");
			else
				System.out.println("Possible");

		}
	}
}
