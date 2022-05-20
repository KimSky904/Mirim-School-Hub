using System;
using System.Collections.Generic;

namespace CSClass2022
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Car car = new Car();
            car.SetInTime();
            car.SetOutTime();
            car.some(10);



            Random random = new Random();
            Console.WriteLine(random.Next(10, 100)); //정수 반환(10 ~ 99)


            /*List<int> list = new List<int>();
            list.Add(1);
            list.Add(2);
            list.Add(3);
            list.Add(4);*/

            // 선언과 동시에 값 삽입하기
            List<int> list = new List<int>() { 1,2,3,4,5,6 };

            //remove 활용
            list.Remove(50);

            foreach (var i in list)
            {
                Console.WriteLine("Count : "+list.Count + "item : "+i);
            }


            //Math 클래스
            Console.WriteLine(Math.Abs(-523412));
            Console.WriteLine(Math.Ceiling(52.273));
            Console.WriteLine(Math.Floor(52.283));
            Console.WriteLine(Math.Max(52,233));
            Console.WriteLine(Math.Min(52, 233));
            Console.WriteLine(Math.Round(1.2345));
            Console.WriteLine(Math.Round(1.2345, 3));
            Console.WriteLine(Math.PI);


            Hamburger ham = new Hamburger();

            Product productA = new Product();
            productA.name = "포켓몬빵";
            productA.price = 1500;
            //인스턴스 변수 생성과 동시에 초기화 (C# 고유 문법)
            Product productB = new Product() { name="소금빵", price=2000};
            Product productC = new Product() { price=5500, name="당근케이크"};
            // Product productD = new Product() { "이름", 1000 }; -> 에러 발생
            Product productE = new Product() { name = "보름달" };






        }
    }
}
