using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjectEuler
{
    class Euler004
    {
        public static void Solve()
        {
            int ret = 0;
            for (int l1 = 100; l1 <=999; l1++)
            {
                for (int l2 = l1; l2 <=999; l2++)
                {
                    string s = (l1*l2).ToString();
                    bool pal = true;
                    for (int i = 0; i*2+1 < s.Length && pal; i++)
                    {
                        if (s[i] != s[s.Length - i - 1])
                        {
                            pal = false;
                        }
                    }
                    if (pal)
                    {
                        ret = Math.Max(ret, l1*l2);
                    }
                }
            }
            System.Console.WriteLine(ret);
        }
    }
}
