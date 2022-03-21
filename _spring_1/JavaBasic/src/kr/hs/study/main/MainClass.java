	package kr.hs.study.main;
	
	import kr.hs.study.Hello;
	import kr.hs.study.HelloWorldEn;
	import kr.hs.study.HelloWorldKo;
	
	public class MainClass {
	
		public static void main(String[] args) {
			// HelloWorldEn en = new HelloWorldEn() : 타이트한 결합
			Hello h = new HelloWorldEn(); //느슨한 결합
			say_Method(h);
		}
		public static void say_Method(Hello hello) {
			hello.sayHello();
		}
	
	}
