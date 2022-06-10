using System;

namespace CSClass2022
{
    public class Animal
    {
        public int Age { get; set; }
        public Animal()
        {
            this.Age = 0;
        }

        public void Eat()
        {
            Console.WriteLine("냠냠 먹습니다.");
        }

        public void Sleep()
        {
            Console.WriteLine("쿨쿨 잡니다.");
        }
    }
}