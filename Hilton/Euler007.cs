using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjectEuler
{
    class Euler007
    {
        public static void Solve()
        {
            int MAX = 1000000;
            int primecount = 0;
            bool[] comp = new bool[MAX];
            for (int i = 2; i < MAX; i++)
            {
                if (!comp[i])
                {
                    primecount++;
                    if (primecount == 10001)
                    {
                        Console.WriteLine(i);
                        return;
                    }
                    for (int j = 2*i; j < MAX; j+=i)
                    {
                        comp[j] = true;
                    }
                }
            }
        }
    }
}
