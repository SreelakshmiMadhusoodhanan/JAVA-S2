public class Armstrong{
	public static void main(String args[]){
		int n=371,originalnumber,rm,result=0;
		originalnumber=n;
		while(originalnumber!=0)
		{
			rm=originalnumber%10;
			result+=Math.pow(rm,3);
			originalnumber/=10;
		}
		if(result==n)
			System.out.println(n+"is Armstrong");
		else
			System.out.println(n+"is not Armstrong");
	}
}
	