using System;

namespace CSClass2022
{
    class Product
    {
        public static int counter = 0;
        public int id;
        public Product(string name, int price)
        {
            Product.counter++;
            this.id = Product.counter;
            this.name = name;   
            this.price = price;
            Console.WriteLine(this.ToString());
        }

        public static string MADEIN = "Korea";

        /// <summary>
        ///  상품 가격
        /// </summary>
        public int price = 1000;

        /// <summary>
        /// 상품 이름
        /// </summary>
        public string name = "무명";

        public override string ToString()
        {
            return this.id+" : "+this.name +" ("+this.price+"원)";
        }
    }
}