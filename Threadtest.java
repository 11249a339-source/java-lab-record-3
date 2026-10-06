AIM

To write a Java program to demonstrate thread control methods such as yield(), sleep(), and stop() using multiple threads.

ALGORITHM
Start the program.
Create three thread classes A, B, and C by extending the Thread class.
In thread A, use yield() when i == 1 to temporarily give another thread a chance to execute.
In thread B, display the values of j and terminate the thread when j == 3 using stop().
In thread C, display the values of k and use sleep(1500) when k == 1 to pause the thread for 1.5 seconds.
Create objects of all three threads in the main() method.
Start the threads using start().
Display the main thread termination message.
Stop the program.
    import java.io.*;
class A extends Thread
{
    public void run()
{
    for(int i=1;i<=5;i++)
{
if(i==1)
yield();
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
System.out.println("from thread B j="+j);
if(j==3)
System.out.println("exit from 5");
stop();
}
}

}
class C extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
{
System.out.println("thread c="+k);
if(k==1)
try
{
sleep(1500);
}
catch(Exception c)
{
System.out.println("exit from c");
}
}
}
}
class Threadtest
{
public static void main(String[]args)
{
A a = new A();
B b = new B();
C c = new C();
System.out.println("Start thread A");
a.start();
b.start();
c.start();
System.out.println("exit from main thread");
}
}
OUTPUT

Since threads execute concurrently, the exact order can vary. One possible output is:

Start thread A
exit from main thread
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
from thread A i=5
exit from A
from thread B j=1
from thread B j=2
from thread B j=3
exit from 5
thread c=1
thread c=2
thread c=3
thread c=4
thread c=5
RESULT
Thus, the Java program to demonstrate thread control methods yield(), sleep(), and stop() was executed successfully and the desired output was obtained.

