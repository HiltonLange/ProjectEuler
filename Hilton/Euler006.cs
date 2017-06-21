using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjectEuler
{
    class Euler006
    {
        public static void Solve()
        {
            int i1 = 0;
            int i2 = 0;
            for (int i = 1; i <= 100; i++)
            {
                i1 += i*i;
                i2 += i;
            }
            i2 *= i2;
            Console.WriteLine(i2-i1);
        }
    }
}
