using System;

namespace CSClass2022
{
    class Method
    {
        public double Multi(double vq1, int v2)
        {
            return vq1 * v2;
        }

        /// <summary>
        /// min부터 max까지의 합을 구하는 함수
        /// </summary>
        /// <param name="min">시작값</param>
        /// <param name="max">최대값</param>
        /// <returns>min부터 max까지의 합</returns>
        internal int Sum(int min, int max)
        {
            int output = 0;
            for (int i = min; i <= max; i++)
            {
                output+=i;
            }
            return output;
        }



        /// <summary>
        /// min부터 max까지의 곱을 구하는 함수
        /// </summary>
        /// <param name="min">시작값</param>
        /// <param name="max">최대값</param>
        /// <returns>min부터 max까지의 곱</returns>
        internal int Multiply(int min, int max)
        {
            int output = 1;
            for (int i = min; i <= max; i++)
            {
                output *= i;
            }
            return output;
        }
    }
}