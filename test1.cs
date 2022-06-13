using System;

MyClass.TestMethod();

public class MyClass
{
    public static void TestMethod()
    {
        Console.WriteLine("Number of ones {0}",Ones(6));
    }

    public static UInt64 Ones(UInt64 n)
    {
        Console.WriteLine("Number of ones {0}",5);
        return (n+2);
    }
}
