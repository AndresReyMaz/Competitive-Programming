import java.util.Scanner;
class Tower{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String y = "AHIMOTUVWXY";
		boolean charPal=true;
		boolean allPal=true;
		for(int i=0;i<n;i++){
			String s=sc.next();
			for(int j=0;j<s.length();j++){
				if(y.indexOf(s.charAt(j))>=0)
					charPal=true;
				else{
					charPal=false;
					break;
				}
			}
			for(int k=0;k<s.length()/2;k++){
				if(s.charAt(k)==s.charAt(s.length()-(k+1)))
					allPal=true;
				else{
					allPal=false;
					break;
				}
			}
			if(charPal&&allPal)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
