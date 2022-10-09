## Object Level Lock
Object level locking is mechanism when you want to synchronize a non-static method or non-static code block such that only one thread will be able to execute the code block on given instance of the class.
This can be done as below:
```
public class DemoClass 
{ 
  public void demoMethod(){ 
  synchronized (this) 
  { 
   //other thread safe code 
  } 
 } 
} 
```
Understandable example:
1. Create Foo class which implements Runnable interface . And also used object level locking. 

````
public class Foo implements Runnable {

    @Override
    public void run() {
        Lock();
    }
 // object level lock method 
    public void Lock() {
        System.out.println(Thread.currentThread().getName());
        synchronized (this) {
            System.out.println("in block " + Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName() + " end");
        }
    }

//main method 
    public static void main(String[] args) {
        Foo b1 = new Foo();
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);
        Foo b2 = new Foo();
        Thread t3 = new Thread(b2);
        Thread t4 = new Thread(b2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
````

In this example, t1 and t2 thread is created by taking the instance b1 of Foo class . And t3 and t4 thread is created by taking the instance b2 of Foo class. 
As we use object level locking, at the same time t1 and t2 are not blocked. And also t3 and t4 are not blocked. Because, at the same time one instance of each object can implement this method. So, two instacne of two object can be implemented this lock method. That means, t1 and t3, t1 and t4, t2 and t3 , t2 and t4 can be implemented this method.
2. Output:

![image](https://user-images.githubusercontent.com/75389185/194741606-36ef4251-671b-45d3-bd09-c6c3b187f04b.png)


If we observe the example we can understand it. At the same time t1 and t2 , t3 and t4  not blocked.

## Class level block
Class level locking prevents multiple threads to enter in synchronized block in any of all available instances on runtime. This means if in runtime there are 100 instances of DemoClass, then only one thread will be able to execute demoMethod() in any one of instance at a time, and all other instances will be locked for other threads. This should always be done to make static data thread safe.

```
public class DemoClass 
{ 
  public void demoMethod(){ 
  synchronized (DemoClass.class) 
  { 
   //other thread safe code 
  } 
 } 
} 
```
understanable code:
```
public class Foo implements Runnable {

    @Override
    public void run() {
        Lock();
    }
 // class level lock method 
    public void Lock() {
        System.out.println(Thread.currentThread().getName());
        synchronized (Foo.class) {
            System.out.println("in block " + Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName() + " end");
        }
    }

//main method 
    public static void main(String[] args) {
        Foo b1 = new Foo();
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);
        Foo b2 = new Foo();
        Thread t3 = new Thread(b2);
        Thread t4 = new Thread(b2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
```
In this example, we have used same example for class level blocking. In that case , all the instance of the object which is created from same class. n this example, t1 and t2 thread is created by taking the instance b1 of Foo class . And t3 and t4 thread is created by taking the instance b2 of Foo class. At the blocking level, they can block one after another not object dependence. They are consider here to be a part of same class.


Output:


![image](https://user-images.githubusercontent.com/75389185/194742107-35d0c194-fc1b-472b-b9aa-1c6a3a8d8657.png)

If we observe the example we can understand it. At the same time t1 and t2 , t3 and t4  are blocked one after another.