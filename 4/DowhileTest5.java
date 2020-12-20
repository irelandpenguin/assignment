class DoWhileTest5{
	public static void main(String[] args){
		int r = 1;
		double pi = 3.14;
		double zhouChang ;
		do {
			zhouChang = 2*pi*r;
			if(zhouChang>20){
				System.out.println("对应的临界半径"+r+ss",临界周长"+zhouChang);
				break;
			}
			r++;
		} while(r<=15);
	}
}