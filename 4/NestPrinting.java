class NestPrinting{
	public static void main(String[] args){
		for(int ver_ = 1;ver_<=5;ver_++){
			if(ver_==1){
				System.out.println("*");
			}else{
				for(int hor_=1;hor_<ver_;hor_++){
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}
}