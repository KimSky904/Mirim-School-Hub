using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

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
            Console.WriteLine(random.Next(10, 100)); //정수 반환




        }
    }
}
