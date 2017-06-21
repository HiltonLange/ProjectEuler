using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjectEuler
{
    class Euler003
    {
        public static void Solve()
        {
            long l = 600851475143;
            long p = 2;
            while (p*p <= l)
            {
                if (l%p == 0)
                {
                    l /= p;
                }
                else
                {
                    p++;
                }
            }
            System.Console.WriteLine(l);
        }
    }
}
