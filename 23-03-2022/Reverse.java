public class Reverse{
	public static void main(String srgs[]){
		int n=987654321,r=0;
		while(n!=0){
			int rm=n%10;
			r=r*10+rm;
			n=n/10;
		}
		System.out.println("Reverse is" +r);
	}
}