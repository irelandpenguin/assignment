class SixHundred{
	public static void main(String[] args){
		for (int a=100;a<=600;a++){
			int ge = a%10;
			int shi = a/10%10;
			int bai = a/100;
			int res_ = ge*ge*ge+shi*shi*shi+bai*bai*bai;
			if(res_==a){
				System.out.println(res_);
				
			}
		}
	}
}