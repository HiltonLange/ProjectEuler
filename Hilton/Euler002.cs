using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjectEuler
{
    class Euler002
    {
        public static void Solve()
        {
            int f1 = 1;
            int f2 = 2;
            long ret = 2;
            do
            {
                int temp = f2;
                f2 += f1;
                f1 = temp;
                if (f2%2 == 0) ret += f2;
            } while (f2<=4000000);
            Console.WriteLine(ret);
        }
    }
}
