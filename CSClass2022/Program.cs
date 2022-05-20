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


        }
    }
}
