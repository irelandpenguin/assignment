class DoWhileTest4{
	public static void main(String[] args){
		int a = 50;
		do{
			if(a%3!=0){
				a++;
				continue;
			}
			System.out.println(a);
			a++;
		} while(a<=100);	
	}
}