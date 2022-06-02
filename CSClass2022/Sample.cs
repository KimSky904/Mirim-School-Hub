using System;

namespace CSClass2022
{
    class Sample
    {
        public static int value = 1;

        static Sample()
        {
            value = 2;
            Console.WriteLine("Sample() 정적 생성자 호출됨!-!");
        }
    }
}