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





        }
    }
}
