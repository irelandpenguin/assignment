class DoWhileTest3{
	public static void main(String[] args){
		int a = 100;
		int res_;
		int ge ;
		int shi;
		int bai;
		do {
			ge = a%10;
			shi = a/10%10;
			bai = a/100;
			res_=ge*ge*ge+shi*shi*shi+bai*bai*bai;
			if (res_==a){
				System.out.println(res_);
			}
			a++;
		} while (a<=600);
	}
}