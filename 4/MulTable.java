class MulTable{
	public static void main(String[] args){
		for(int ver_=1;ver_<=9;ver_++){
			for (int hor_=1;hor_<=ver_;hor_++){
				System.out.print(hor_+"*"+ver_+"="+hor_*ver_+"\t");
			}
			System.out.println();
		}
	}
}