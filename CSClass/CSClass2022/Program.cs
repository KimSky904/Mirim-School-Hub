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
            car.some(10);



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


            //Math 클래스
            Console.WriteLine(Math.Abs(-523412));
            Console.WriteLine(Math.Ceiling(52.273));
            Console.WriteLine(Math.Floor(52.283));
            Console.WriteLine(Math.Max(52,233));
            Console.WriteLine(Math.Min(52, 233));
            Console.WriteLine(Math.Round(1.2345));
            Console.WriteLine(Math.Round(1.2345, 3));
            Console.WriteLine(Math.PI);


            Hamburger ham = new Hamburger();

            //Product productA = new Product();
            //productA.name = "포켓몬빵";
            //productA.price = 1500;
            ////인스턴스 변수 생성과 동시에 초기화 (C# 고유 문법)
            //Product productB = new Product() { name="소금빵", price=2000};
            //Product productC = new Product() { price=5500, name="당근케이크"};
            //// Product productD = new Product() { "이름", 1000 }; -> 에러 발생
            //Product productE = new Product() { name = "보름달" };



            List<Student> students = new List<Student>()
            {
                new Student() { name = "김하늘1", grade = 3 },
                new Student() { name = "김하늘2", grade = 2 },
                new Student() { name = "김하늘3", grade = 3 },
                new Student() { name = "김하늘4", grade = 1 },
                new Student() { name = "김하늘5", grade = 1 },
                new Student() { name = "김하늘6", grade = 1 },
                new Student() { name = "김하늘7", grade = 2 },
                new Student() { name = "김하늘8", grade = 2 },
                new Student() { name = "김하늘9", grade = 3 },
                new Student() { name = "김하늘10", grade = 3 }
            };

            for (int i = students.Count - 1; i >= 0 ; i--)
            {
                if (students[i].grade > 2) students.RemoveAt(i);

            }

            //for (int i = 0; i < students.Count; i++)
            //{
            //    if(students[i].grade > 2) students.Remove(students[i]);
            //    Console.WriteLine(students[i].ToString());
            //}

            //foreach (var item in students)
            //{
            //    if(item.grade > 2) students.Remove(item);
            //    Console.WriteLine(item.ToString());
            //}




            Method method = new Method();
            Console.WriteLine(method.Multi(52.1, 273));
            Console.WriteLine("sum : "+method.Sum(1,100));
            Console.WriteLine("multiply : " + method.Multiply(1, 10));

            Console.WriteLine("abs : " + Method.Abs(100));
            Console.WriteLine("abs : " + Method.Abs(-100));
            //Console.WriteLine("abs : " + method.Abs(100)); //JAVA는 가능하지만 C#은 불가능


            // int
            Console.WriteLine(MyMath.Abs(521));
            Console.WriteLine(MyMath.Abs(-51));

            // double
            Console.WriteLine(MyMath.Abs(5.21));
            Console.WriteLine(MyMath.Abs(4.13));

            // long
            Console.WriteLine(MyMath.Abs(1224242L));
            Console.WriteLine(MyMath.Abs(5554521L));



            Product product1 = new Product("포켓몬빵", 1500);
            Product product2 = new Product("케이크", 4500);
            Product product3 = new Product("초코빵", 500);


            //Console.WriteLine("첫번째 위치");
            //Console.WriteLine(Sample.value);
            //Console.WriteLine("두번째 위치");
            //Sample sample = new Sample();
            //Console.WriteLine("세번째 위치");


            Console.WriteLine("첫번째 위치");
            Sample sample = new Sample();
            Console.WriteLine("두번째 위치");
            Console.WriteLine(Sample.value);
            Console.WriteLine("세번째 위치");



            Box box1 = new Box(10, 10);
            box1.width = -10;
            Console.WriteLine("box1의 면적 : "+box1.Area());


            Box2 box2 = new Box2(10, 10);
            box2.setWidth(-10);
            Console.WriteLine("box2의 면적 : " + box2.Area());


            Box1 box = new Box1(10, 10);  
            box.Width = -10;
            Console.WriteLine("box의 면적 : " + box.Area);


            Console.WriteLine(Fibonacci.Get(1));
            Console.WriteLine(Fibonacci.Get(10));





            //List<Dog> Dogs = new List<Dog>() { new Dog(), new Dog(), new Dog() };
            //List<Cat> Cats = new List<Cat>() { new Cat(), new Cat(), new Cat() };
            List<Animal> animals = new List<Animal>() { new Dog(), new Dog(), new Dog(), new Cat(), new Cat(), new Cat() };
            //foreach(var item in animals)
            //{
            //    item.Eat();
            //    item.Sleep();
            //    ((Dog)item).Bark();
            //}


            /*
            foreach (var item in animals)
            {
                item.Eat();
                item.Sleep();
                if(item is Dog)
                {
                    //item.Bark();
                    ((Dog)item).Bark();
                } else if (item is Cat)
                {
                    Cat cat = (Cat)item;
                    cat.Meow();
                }
            }

            foreach (var item in animals)
            {
                item.Eat();
                item.Sleep();
                var dog = item as Dog;
                if(dog!=null) dog.Bark();

                var cat = item as Cat;
                if(cat!=null) cat.Meow();
            }
            */



            //0616
            Child child1 = new Child();
            Child child2 = new Child("string");


            Parent parent = new Parent();
            Child child = new Child();
            Console.WriteLine("p.counter : " + Parent.counter + ", c.counter : " + Child.counter);
            parent.CountParent();
            Console.WriteLine("p.counter : " + Parent.counter + ", c.counter : " + Child.counter);
            child.CountParent();
            Console.WriteLine("p.counter : " + Parent.counter + ", c.counter : " + Child.counter);




            // 섀도잉
            int number = 20;
            Console.WriteLine(number);

            // 하이딩
            Child c = new Child();
            Console.WriteLine(c.variable);
            Console.WriteLine(((Parent)c).variable);
            c.Method();
            ((Parent)c).Method();

            // override
            c.Method2();
            ((Parent)c).Method2();

            foreach(var item in animals)
            {
                item.Eat();
            }

        }
    }
}
