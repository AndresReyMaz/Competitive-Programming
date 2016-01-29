//Juan Andres Reynoso Mazoy A01328249
import java.util.Scanner;
class Palindrome{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int amp=s.length()-1;
		if(amp==1){
			if(s.charAt(0)==s.charAt(1))
				System.out.println(s);
		}
		else{
			int nrep=1;
			boolean flag=true;
			while(amp>1&&flag){
				int st=0;
				for(int j=0;j<nrep;j++){
					if(isPal(s.substring(st,st+amp+1))){
						System.out.print(s.substring(st,st+amp+1));
						flag=false;
						break;
					}
					st++;
				}
				nrep++;
				amp--;
			}
		}
	}
	static boolean isPal(String s){
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-(i+1)))
				return false;
		}
		return true;
	}
}
