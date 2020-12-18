class AHundred{
	public static void main(String[] args){
		int sum_=0;
		for(int a=1;a<=100;a++){
			if(a%3==0&a%2==0){
				sum_+=a;
			}
		}
		System.out.println(sum_);
	}
}