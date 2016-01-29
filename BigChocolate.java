import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int cut=0;
			int cut2=0;
			for(int i=n;i>1;i--){
				cut++;
			}
			for(int i=m;i>1;i--){
				cut2++;
			}
			int fcut=cut+(n*cut2);
			System.out.println(fcut);
		}
	}
}
