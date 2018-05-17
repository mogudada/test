package doc;

public class A1 {
	static int a=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(computAeg(8));	
	}
		
	public static int computAeg(int n){
		if(n==1) return 10;
		a = computAeg(n-1)+2;
		return a;
	}
	
//	public static void toBinary(int n,StringBuffer result){
//		if(n/2!=0)
//			toBinary(n/2,result);
//		result.append(n%2);
//	}
}
