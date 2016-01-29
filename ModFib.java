import java.util.Scanner;
class ModFib{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int mat[][]=new int[2][2];
			mat[0][0]=1;
			mat[1][0]=1;
			mat[0][1]=1;
			mat[1][1]=0;
			int basfinal[][]=exponenciacion(mat,n,m);
			System.out.println(basfinal[0][0]);
		}
	}
	int[][] multmatriz(int matriz[][],int omatriz[][],int mod){
		int newmatriz[][]=new int[2][2];
		newmatriz[0][0]=(matriz[0][0]*omatriz[0][0]+matriz[1][0]*omatriz[0][1])%mod;
		newmatriz[0][1]=(matriz[0][0]*omatriz[0][1]+matriz[0][1]*omatriz[1][1])%mod;
		newmatriz[1][0]=(matriz[1][0]*omatriz[0][0]+matriz[1][1]*omatriz[1][0])%mod;
		newmatriz[1][1]=(matriz[1][0]*omatriz[0][1]+matriz[1][1]*omatriz[1][1])%mod;
		return newmatriz;
	}
	int[][] exponenciacion(int base[][],int exponente, int mod){
		if(exponente==1)
			return base;
		int sigbase[][]=exponenciacion(base,exponente/2,mod);
		if(exponente%2==0)
			return (multmatriz(sigbase,sigbase,mod));
		else
			return multmatriz((multmatriz(sigbase,sigbase,mod)),base,mod);
	}
}
