using System;
using System.Collections.Generic;
using System.Linq; 
using System.Text;
using System.Threading.Tasks;

namespace CSClass2
{
    class Program
    {
        static void Main(string[] args)
        {
            Wanted<string> wantedString = new Wanted<string>("String");
            Wanted<int> wantedInt = new Wanted<int>(4523);
            Wanted<double> wantedDouble = new Wanted<double>(13.224);

            Console.WriteLine(wantedString.Value);
            Console.WriteLine(wantedInt.Value);
            Console.WriteLine(wantedDouble.Value);

            Products p = new Products();
            Console.Write("오늘의 점심 메뉴는 "+p[2]+" 입니다.");
            p[2] = "단무지";
            Console.Write("오늘의 점심 메뉴는 " + p[2] + " 입니다.");
        }
    }
}
