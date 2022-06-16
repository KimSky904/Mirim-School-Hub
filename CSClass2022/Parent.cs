
using System;

namespace CSClass2022
{

    public class Parent
    {
        public int variable = 213;
        public static int number = 0;

        public void Method()
        {
            Console.WriteLine("부모의 메서드");
        }
        public static int counter = 0;

        public void CountParent()
        {
            Parent.counter++;
        }
        public Parent()
        {
            Console.WriteLine("Parent()");            
        }
        public Parent(int param)
        {
            Console.WriteLine("Parent(int param)");
        }
        public Parent(string param)
        {
            Console.WriteLine("Parent(string param)");
        }
    }
}