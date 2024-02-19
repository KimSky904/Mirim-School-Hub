using System;

namespace CSClass2022
{
    public class Cat : Animal
    {

        public void Meow()
        {
            Console.WriteLine("야옹 웁니다.");
        }

        public override void Eat()
        {
            Console.WriteLine("고양이는 사료를 먹습니다.");
        }
    }
}