class WithSynchronization 
{
    synchronized void printTable(int n) 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(n * i);
            try 
            {
                Thread.sleep(400);
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread 
{
    WithSynchronization wSync;
    MyThread1(WithSynchronization wSync) 
    {
        this.wSync = wSync;
    }

    public void run()
    {
        wSync.printTable(5);
    }
}

class MyThread2 extends Thread 
{
    WithSynchronization wSync;
    MyThread2(WithSynchronization wSync) 
    {
        this.wSync = wSync;
    }

    public void run() 
    {
        wSync.printTable(100);
    }
}

public class WithSynchronizationExample 
{
    public static void main(String args[]) 
    {
        WithSynchronization object = new WithSynchronization(); //only one object

        MyThread1 t1 = new MyThread1(object);
        MyThread2 t2 = new MyThread2(object);
        t1.start();
        t2.start();
    }
}