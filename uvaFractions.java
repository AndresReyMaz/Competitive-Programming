import java.util.Scanner;
class uvaFractions{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int k=sc.nextInt();
			String resp="";
			int cnt=0;
			System.out.println(k);
			for(int x=k*(k+1);x>=k*2;x--){
				for(int y=k+1;y<=k;y++){
					if(1/x+1/y==1/k){
						resp+=("1/"+k+" = 1/"+x+" + 1/"+y"\n");
						cnt++;
						break;
					}
				}
			}
			System.out.println(cnt);
			System.out.print(resp);
		}
	}
}
