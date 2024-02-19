
using System;

namespace CSClass2022
{

    // public sealed class Parent
    // public abstract class Parent
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
        public virtual void Method2()
        {
            Console.WriteLine("부모의 메서드");
        }
    }
}