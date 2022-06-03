using System;

namespace CSClass2022
{
    internal class Box2
    {
        private int width;
        private int height;

        public void setWidth(int width)
        {
            if(width > 0)
            {
                this.width = width;
            } 
            else
            {
                Console.WriteLine("양수를 입력해주세요");
            }
            return;
        }

        public void setHeight(int height)
        {
            if (height > 0)
            {
                this.height = height;
            }
            else
            {
                Console.WriteLine("양수를 입력해주세요");
            }
            return;
        }

        public int getWidth()
        {
            return width;
        }
        public int getHeight()
        {
            return height;
        }


        public Box2(int width, int height)
        {
            setHeight(height);
            setWidth(width);
        }

        public int Area()
        {
            return width * height;
        }
    }
}