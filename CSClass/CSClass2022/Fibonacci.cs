using System;
using System.Collections.Generic;

namespace CSClass2022
{
    class Fibonacci
    {

        private static Dictionary<int, long> memo = new Dictionary<int, long>();
        public static long Get(int i)
        {
            Console.Write("Get("+i+") 호출  ");
            if(i<0) return 0;
            else if(i==1) return 1;

            if(memo.ContainsKey(i)) return memo[i];
            else
            {
                memo[i] = Get(i - 2) + Get(i - 1);
                return memo[i];
            }
        }
    }
}