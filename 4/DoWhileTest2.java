class DoWhileTest2{
	public static void main(String[] args){
		int a =100;
		do {
			System.out.print(a+"\t");
			if (a%5==0){
				System.out.println();
			}
			a++;
		} while (a<=200);
	}
}