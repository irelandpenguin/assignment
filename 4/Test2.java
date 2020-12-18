class Test2{
	public static void main(String[] args){
		int r_;
		double pi = 3.14;
		double zhouChang;
		for (r_=1;r_<=15;r_++){
		zhouChang = 2*pi*r_;
			if (zhouChang>20){
				System.out.println("对应的临界半径"+r_+"，临界周长的大小"+zhouChang);
				break;
			}
		}
	}
}