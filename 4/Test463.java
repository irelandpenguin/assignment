class Test463{
	public static int multi_(int a,int b){
		int x=a;
		int y=b;
		int z=a*b;
		return z;
	}
	
	public static long multi_(long a,long b){
		long x=a;
		long y=b;
		long z=a*b;
		return z; 
	}
	
	public static double multi_(double a,double b){
		double x = a;
		double y = b;
		double z = a*b;
		return z;
	}
	
	public static void main(String[] args){
		int result_= multi_(1,2);
		long result2_= multi_(100000000L,1000000L);
		double result3_= multi_(3.24,3.15);
		System.out.println(result_+","+result2_+","+result3_);
	}
}