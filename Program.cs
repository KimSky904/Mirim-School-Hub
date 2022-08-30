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


            Console.WriteLine("숫자 입력 : ");
            //int output;
            bool result = int.TryParse(Console.ReadLine(), out int output);
            if (result)
            {
                Console.WriteLine("입력한 숫자" + output);
            }
            else
            {
                Console.WriteLine("숫자를 입력해주세요!");
            }



            int x = 0, y = 0, vx = 1, vy = 1;
            Console.WriteLine("현재 좌표: (" + x + "," + y + ")");
            NextPos(x, y, vx, vy, out x, out y);
            Console.WriteLine("다음 좌표: (" + x + "," + y + ")");
        }

        static void NextPos(int x, int y, int vx, int vy, out int rx, out int ry)
        {
            rx = x + vx;
            ry = y + vy;
        }
    }
}
