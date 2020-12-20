class DoWhileTest{
	public static void main(String[] args){
		int a = 1;
		int sum_=0;
		do{
			if (a%3==0&&a%2==0){
				sum_+=a;
			}
			a++;
		} while(a<=100);
		System.out.println(sum_);
	}
}