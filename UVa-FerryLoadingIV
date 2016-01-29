import java.util.*;

public class FerryLoadingIV{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		for(int w=0;w<c;w++){
			int l=sc.nextInt()*100;
			int m=sc.nextInt();
			Queue<Integer> right=new LinkedList<Integer>();
			Queue<Integer> left=new LinkedList<Integer>();
			for(int i=0;i<m;i++){
				int bl=sc.nextInt();
				if(sc.next().equals("left"))
					left.add(bl);
				else
					right.add(bl);
			}
			boolean boatIsOnRight=false;
			int n=0;
			while(left.peek()!=null||right.peek()!=null){
				int space=l;
				if(boatIsOnRight){
					while(right.peek()!=null){
						if(right.peek()<space)
							space-=right.poll();
						else
							break;
					}
					boatIsOnRight=false;
				}
				else{
					while(left.peek()!=null){
						if(left.peek()<space)
							space-=left.poll();
						else
							break;
					}
					boatIsOnRight=true;
				}
				n++;
			}
			System.out.println(n);

		}
	}	//main
}	// class FerryLoadingIV
