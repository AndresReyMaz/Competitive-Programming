import java.util.*;

public class Rails{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		while(x!=0){
			int f=sc.nextInt();
			if(f==0){
				x=sc.nextInt();
				System.out.println();
			}	// if
			else{
				int a[]=new int[x];
				a[0]=f;
				for(int i=1;i<x;i++){
					a[i]=sc.nextInt();
				}	// for
				int next=1;
				boolean works=true;
				int o=0;
				Stack<Integer> station=new Stack<Integer>();
				while(o!=x){
					if(!station.empty()){
						if(station.peek()==a[o]){
							System.out.println("sent car "+station.peek()+" out of stack");
							station.pop();
							o++;
							continue;
						}
					}
					if(next==a[o]){
						System.out.println("sent car "+next+" on through");
						next++;
						o++;
					}
					else if(next!=x+1){
						System.out.println("added car "+next+" to stack");
						station.push(next);
						next++;
					}
					else{
						System.out.println("no more choices.");
						works=false;
						break;
					}
				}
				if(works)
					System.out.println("Yes");
				else
					System.out.println("No");
			}	// else
		}	//while
	}	//main
}	// class Rails
