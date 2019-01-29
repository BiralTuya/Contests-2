import java.util.Scanner;
class main{
	public static void main(String[] args){
	int n=0,i,ans=0;
	Scanner avy=new Scanner(System.in);
	for(i=0;;i++){
		n=avy.nextInt();
		if(n==0) break;
		ans=(n*(n+1)*((2*n)+1))/6;
		System.out.println(ans);
	}
	}
}