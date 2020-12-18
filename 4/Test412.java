import java.util.Scanner;
class Test412{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		if (p%2==0){
			System.out.println("这是偶数");
		}else{
			System.out.println("这是奇数");
		}
	}
}