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



            List<Student> students = new List<Student>()
            {
                new Student() { name = "김하늘1", grade = 3 },
                new Student() { name = "김하늘2", grade = 2 },
                new Student() { name = "김하늘3", grade = 3 },
                new Student() { name = "김하늘4", grade = 1 },
                new Student() { name = "김하늘5", grade = 1 },
                new Student() { name = "김하늘6", grade = 1 },
                new Student() { name = "김하늘7", grade = 2 },
                new Student() { name = "김하늘8", grade = 2 },
                new Student() { name = "김하늘9", grade = 3 },
                new Student() { name = "김하늘10", grade = 3 }
            };

            for (int i = students.Count - 1; i >= 0 ; i--)
            {
                if (students[i].grade > 2) students.RemoveAt(i);

            }

            //for (int i = 0; i < students.Count; i++)
            //{
            //    if(students[i].grade > 2) students.Remove(students[i]);
            //    Console.WriteLine(students[i].ToString());
            //}

            //foreach (var item in students)
            //{
            //    if(item.grade > 2) students.Remove(item);
            //    Console.WriteLine(item.ToString());
            //}




            Method method = new Method();
            Console.WriteLine(method.Multi(52.1, 273));
            Console.WriteLine("sum : "+method.Sum(1,100));
            Console.WriteLine("multiply : " + method.Multiply(1, 10));
        }
    }
}
