class Test2{
	public static void main(String[] args){
		int r_=1;
		double pi = 3.14;
		int zhouChang;
		for (;r_<=15;r_++){
		zhouChang = 2*pi*r_;
			if (zhouChang>20){
				System.out.println("对应的临界半径"+r_+"，临界周长的大小"+zhouChang)
				break;
			}
		}
	}
}