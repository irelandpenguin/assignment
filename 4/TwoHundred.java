class TwoHundred{
	public static void main(String[] args){
		int counter_ = 1;
		for (int a=1;a<=200;a++){
			if (a/10%10==3){
				System.out.print(a+"\t");
				if (counter_%5 == 0){
					System.out.println();
				}
				counter_++;
			}
		}
	}
}