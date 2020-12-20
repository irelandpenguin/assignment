class Test46{
	public static int sum(int x,int y){
		int a = x;
		int b = y;
		int c = x+y;
		return c;
	}
	
	public static int ride(int x,int y){
		int a = x;
		int b = y;
		int c = x*y;
		return c;
	}
	
	public static void main(String[] args){
		int result_ = sum(1,2);
		int result2_ = ride(1,2);
		System.out.println(result_+","+result2_);
	}
}