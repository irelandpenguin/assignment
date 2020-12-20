class Test462{
	public static int sum_(int start_,int end_, int num_){
		int a = start_;
		int b = end_;
		int c = num_;
		int result_=0;
		for (;a<=b;a++){
			if (a%num_==0){
				result_+=a;
			}
		}
		return result_;
	}
	
	public static void main(String[] args){
		int result_=sum_(1,100,3);
		System.out.println(result_);
	}
}
