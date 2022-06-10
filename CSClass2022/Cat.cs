using System;

namespace CSClass2022
{
    public class Cat
    {
        public int Age { get; set; }

        public Cat()
        {
            this.Age = 0;
        }

        public void Sleep()
        {
            Console.WriteLine("쿨쿨 잡니다.");
        }

        public void Eat()
        {
            Console.WriteLine("냠냠 먹습니다.");
        }

        public void Meow()
        {
            Console.WriteLine("야옹 웁니다.");
        }
    }
}