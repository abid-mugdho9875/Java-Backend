 # MultiThreading

 As server can't handle more than one request at a time. When multiple request are coming at the server, beside one thread all others threads goes queue. Server serves client one after another. To solve this issues, multithreading are introduced. 

 MultiThreaing is a java Feature that allows concurrent execution of two or more parts of program for maximum utilization of CPU. Each part of the such program's called thread. 


![image](https://user-images.githubusercontent.com/75389185/194918739-9c932519-9f92-45fe-8fbb-a54d3b95d4ea.png)

when client1 request server then it accepts the client1 request and open thread1 which serves client 1. 
when client2 request server then it accepts the client2 request and open thread2 which serves client 2.
when client3 request server then it accepts the client1 request and open thread2 which serves client 3.  

In the CPU there is more than one core. But maximum core are covered up due to internal service of os. And for this reason, thread have to share the same core of the CPU by time sharing. 

![image](https://user-images.githubusercontent.com/75389185/194929607-4e679711-fca0-4313-b847-2c5575c5bb9b.png)

Here, client1, client2, client3  shares different cpu time . Which client get first, second service depent on the thread priority. Different types of algorithm which decide this type of servicing sequence. 

When thread creats then Thread schduler call CPU that he has any time slot to share with this newly created thread. More than one thread comes at a time, CPU at a time sevice one threads. And put the other threads to the sleep state. But sleeping time is very small. 

Three is no ordering of given service to that thread. Suppose, one thread comes and server gives service to that server, blocks remain thread. It is so bad, it leads to a finite blocking. To avoid that some time slices are provided to the threads sothat after some time runnig threads has to give up the CPU. Thus the other waiting threads also get time to run their job. 

![image](https://user-images.githubusercontent.com/75389185/194945361-1379a861-229d-4f6a-9dd7-22c15ba37a7e.png)

If we observe this diagram, we can understand that same time is shared for five different threads.

We can easily understand, if we see the below program:

- Runnable interface: Used to create thread
```
static Runnable r2  = new Runnable() {//create object of Runnable  class & implement it
            @Override
            public void run() {
                System.out.println("printer");

            }
        };
```
- Thread Creation: Here, three threads t1, t2 and t3 are created. At first t3 is started , then t2 and then t1 is started. 

```
public static void main(String[] args) {
            Mythread mythread = new Mythread();
            Thread t1 = new Thread(mythread);
            t1.setName("Thread 1");
            Thread t2 = new Thread(mythread);
            t2.setName("Thread 2");
            Thread t3 = new Thread(mythread);
            t3.setName("Thread 3");
            t3.start();
            t1.start();
            t2.start();
        }
```
Now, we try to observe the output. Which very much interesting.
1. Here, we have seen that we have created and started three threads but in the output we see that more that 10 times execution.

![image](https://user-images.githubusercontent.com/75389185/194946739-9a49ef70-b6c7-4461-ad07-779bf3da2632.png)

Now, we break down the output. We should remember that we start t3 first, then t1 and t2 thread.

2.  But if we see the first three execution, we seen that at the same time ![image](https://user-images.githubusercontent.com/75389185/194947515-9c17590a-8da1-4d66-90b2-767d1500e2c3.png) . first t1 thread, then t3 thread and at last t1 thrad execution. Mainly, small part of three threads excute for the same time by sharing time slicing. 

![image](https://user-images.githubusercontent.com/75389185/194947000-104d926f-0e07-4556-9904-8697dcdd17af.png)
 
Interesting fact that, for this time slot first thread3, then thread2, then thread1 execution. Which is differ from the previous time slot. Excutin path changes for every time slot. 
![image](https://user-images.githubusercontent.com/75389185/194947987-3272673b-f304-40a8-bbae-870e8e862d75.

part of every threads execute at the same time by sharing time slot. So, here needs multiple timeslot. Each time, part of threads are excuted. 

--------------------------Thank you------------------------
