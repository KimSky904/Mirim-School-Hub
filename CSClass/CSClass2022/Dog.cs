using System;
using System;
namespace CSClass2022
{
    public class Dog : Animal
    {
        public string Color { get; set; }

        public void Bark()
        {
            Console.WriteLine("왈왈 짖습니다.");
        }

        public override void Eat()
        {
            Console.WriteLine("개는 사료를 먹습니다.");
        }
    }
}