import java.util.Scanner;
class Bsort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[]=new int[1000];
		int tmp=0;
		int cnt=0;
		int n=0;
		while(sc.hasNext()){
			a[n]=sc.nextInt();
			n++;
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i]>a[j]) {
					tmp = a[i];
					a[i]=a[j];
					a[j]=tmp;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		for(int i=0;i<n;i++){
			if(i==n-1)
				System.out.println(a[i]);
			else
				System.out.print(a[i]+" ");
		}
	}
}
