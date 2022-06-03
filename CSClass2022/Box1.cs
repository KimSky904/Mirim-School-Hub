using System;

namespace CSClass2022
{
    internal class Box1
    {
        

        public Box1(int width, int height)
        {
            this.Width = width;
            this.Height = height;
        }

        private int width;
        public int Width
        {
            get { return width; }
            set {
                if (value > 0) width = value;
                else Console.WriteLine("양수를 입력하세요.");
            }
        }

        private int height;
        public int Height
        {
            get { return height; }
            set
            {
                if (value > 0) height = value;
                else Console.WriteLine("양수를 입력하세요.");
            }
        }
        

        public int Area
        {
            get { return width * height; }
        }
    }
}