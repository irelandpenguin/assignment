class DoWhileTest5{
	public static void main(String[] args){
		int r = 1;
		double pi = 3.14;
		double zhouChang ;
		do {
			zhouChang = 2*pi*r;
			if(zhouChang>20){
				System.out.println("��Ӧ���ٽ�뾶"+r+ss",�ٽ��ܳ�"+zhouChang);
				break;
			}
			r++;
		} while(r<=15);
	}
}