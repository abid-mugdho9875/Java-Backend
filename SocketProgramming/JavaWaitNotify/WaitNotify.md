#  Wait and Notify 

We can assume wait as a traffic light. When traffic  Red light on, road become block until the green light on. We can assume green light as a notify. When thread is in waiting state, it waits for the notify sgnal. As soon as notify signal comes it goes to Runnable state.Waiting state acts as a two types. 
1. wait() ---> wait indifinetly for notify signal
2. wait(long timeoutMills()) ---> wait for definite time for notify signal. 

![image](https://user-images.githubusercontent.com/75389185/194759755-d2ec03a3-5ac5-45d1-8ac2-c42c8701a87d.png)

- wait() method turns runnable method to a waiting state. 
- wait(long timoutMills()) method turns runnable method to timed_waiting method

Inorder to turn thread from  waiting and timed_waiting state to a runnable state notify() and notifyall() method is used. 
 - notify() --> used for turning  random thread from e waiting and timed_waiting state to runnable state. It might be thread1 , thrad2 and so on... It is a stochastic process.
 - notifyall() --> used for turning all the thread into a runnable state.

 Example:-

 1. Message class:
 This message block has three methods one constructor, one  getmethod and one setmethod.
 ```
 public static class Message{
        //local variable
        private  String msg;
        //constructor
        public Message(String msg) {
            this.msg = msg;
        }
        //get message method
        public String getMessage(){
            return msg;
        }
        //set message method
        public void setMessage(String msg){
            this.msg = msg;
        }

    }
 ```
 2. Waiting class- This class implemented runnable interface. This class use to turn runnable thread to a waiting or timed_wait state. 
 ```
 //waiter class that is waiting for notify
    public static class Waiter implements  Runnable{
        private Message msg;
        public Waiter(Message m){
            this.msg=m;
        }
        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            synchronized (msg){
                try{
                    System.out.println(name+" waiting to get notified at time:" + System.currentTimeMillis());
                    msg.wait();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
                //process the message now
                System.out.println(name+" processed: "+msg.getMessage());
            }
        }
    }
 ```

 3. Notify class --> This class use to notify the thread to get back to runnable state from wait or timed_wait state. Here, notify() method use to randomly one class to get back to runnable state from waiting state.Notifyall() method used to notify all the thread to get back runnable state.

 ```
 public static class  Notifier implements  Runnable{
        private Message msg;
        public Notifier(Message msg) {
            this.msg = msg;
        }
        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            System.out.println(name+" started");
            try {
                Thread.sleep(1000);
                synchronized (msg) {
                    msg.setMessage(name+" Notifier work done");
//                    msg.notify();
                     msg.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
 ```

 4. Main class: Here, we have created  Three thread and one notify object. 
 ```
 public static  void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"waiter").start();

        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1").start();
        Waiter waiter2 = new Waiter(msg);
        new Thread(waiter2, "waiter2").start();

        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
    }
 ```
 Output:
 1. If we  use notify() method then randomly one thread woke up.

 ![image](https://user-images.githubusercontent.com/75389185/194761735-7a84fd8e-f5a0-4a3d-bd27-01547ddc5f66.png)

 We have seen that randomly one thread is turned to a runnable state.
 2.  If we use notifyall() method then all the thread turns on.

![image](https://user-images.githubusercontent.com/75389185/194761886-45a3c14c-ff78-4c8e-a5cb-bd52e3153a6a.png)

We have seen that all the threads turn on as notifyall() notify all the threads.


Task:
Remove sleep method or set small value for sleep method. And also notifyall() .
What happens see on the console!!! Try to undersatnt and explain it.
