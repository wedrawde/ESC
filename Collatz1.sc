namespace HelloWorld
{
	class Program
	{
		using System;
		using Systedm.Numerics;

		uInt64 num = 0;
		uInt64 newrecord = 0;
		uInt64 record = 0;

		Console.WriteLine(num);

		while ((1 == 1) or (num <10**6))
		{
			newrecord = runs(num);
			if (newrecord > record)
			{
				record = newrecord;
				Console.WriteLine($"{num} ;{record}");
			}
			num += 2;
		}

		static uInt64 runs(uInt64 n)
		{
			uInt64 count = 0;
			while (n > 1)
			{
				if ( n % 2 == 0)
				{
					n = n/2;
				}
				else
				{
					n = 3*n + 1;
					count+=1;
				}
			}
			return count;  
		}
	}
}
