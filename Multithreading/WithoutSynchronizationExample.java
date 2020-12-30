class WithoutSynchronization
{
    void printWithoutSynchronization(int n) 
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
    WithoutSynchronization wsync;

    MyThread1(WithoutSynchronization wsync) 
    {
        this.wsync = wsync;
    }

    public void run()
    {
        wsync.printWithoutSynchronization(5);
    }
}

class MyThread2 extends Thread 
{
    WithoutSynchronization wsync;

    MyThread2(WithoutSynchronization wsync) 
    {
        this.wsync = wsync;
    }

    public void run() 
    {
        wsync.printWithoutSynchronization(100);
    }
}

class WithoutSynchronizationExample
{
    public static void main(String args[]) 
    {
        WithoutSynchronization obj = new WithoutSynchronization(); //only one object

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}