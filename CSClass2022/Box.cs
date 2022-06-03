namespace CSClass2022
{
    internal class Box
    {
        public int width;
        public int height;

        public Box(int width, int height)
        {
            this.width = width;
            this.height = height;
        }

        public int Area()
        {
            return width * height;
        }
    }
}