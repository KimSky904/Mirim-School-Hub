	package kr.hs.study.main;
	
	import kr.hs.study.Hello;
	import kr.hs.study.HelloWorldEn;
	import kr.hs.study.HelloWorldKo;
	
	public class MainClass {
	
		public static void main(String[] args) {
			// HelloWorldEn en = new HelloWorldEn() : Ÿ��Ʈ�� ����
			Hello h = new HelloWorldEn(); //������ ����
			say_Method(h);
		}
		public static void say_Method(Hello hello) {
			hello.sayHello();
		}
	
	}
