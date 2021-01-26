class Outer {
	public int num = 10;
	class Inner {
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(new Outer().num);
		}
	}
	
	public void hello() {
		int num = 40;
		class Inner2 {
			public void show() {
				System.out.println(num+new Inner().show().num);
			}
		}
	}
}

class InnerClassTest {
	public static void main(String[] args) {
			
	}	
}