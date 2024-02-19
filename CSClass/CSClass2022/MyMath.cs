using System;

namespace CSClass2022
{
    class MyMath
    {
        // 오버플로우에 주의할 것 (일반적으로 예외처리를 추가함)
        public static int Abs(int v)
        {
            return (v < 0) ? -v : v;
        }

        public static double Abs(double v)
        {
            return (v < 0) ? -v : v;
        }

        public static long Abs(long v)
        {
            return (v < 0) ? -v : v;
        }
    }
}