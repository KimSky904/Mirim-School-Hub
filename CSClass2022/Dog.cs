using System;
using System;
namespace CSClass2022
{
    internal class Dog
    {
        public int Age { get; set; }
        public string Color { get; set; }

        public void Eat()
        {
            Console.WriteLine("냠냠 먹습니다.");
        }

        public Dog()
        {
            this.Age = 0;
        }

        public void Sleep()
        {
            Console.WriteLine("쿨쿨 잡니다.");
        }

        public void Bark()
        {
            Console.WriteLine("왈왈 짖습니다.");
        }
    }
}