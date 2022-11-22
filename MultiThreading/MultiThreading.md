### Multithreaing:

1. What is the benefit of multithreading?
    1. resources can be used efficiently.
    2. Thread creation is easy instead of creating a new process.
    3. Above all
    4. None of the above
 2. Suppose, you write code in VS code, listen to a song in the google chrome browser and take notes on the stackEdit? Can you imagine how a machine can handle three types of operations at the same time?
 3. What does the program mean?
    1. A set of apples.
    2. A set of code
    3. A set of instructions
    4. Operating Systems Kernel
 4. We know a process is a set of programs in execution. Which is the resources of the process?
    1. CPU
    2. MEMORY
    3. Network Space
    4. All of the above
  5. Multiple threads can be a part of one process?
      1. True
      2. False
   6. How thread access the global state of the process?
         1. Same constructs are offered by all programming languages.
         2. Several Constructs are offered by different programming Languages.
         3. All of the above

   7. What does *multiprocessing* concept means?
        1. multiple processes get scheduled on one CPU.
        2. multiple processes get scheduled on more than one  CPU.
        3. multiple processes get scheduled on one CPU core
        4. No concept exists.

   8. What is Serial Execution?
         1. Execute more than one task at a time.
         2. Execute more than one task simultaneously.
         3. Execute more than one task but inconsistent order.
         4. Execute more than one task but at a time one task is executed.
   
   9. what is Java Concurrency means?
         1. Execute more than one task but at a time one task is executed.
         2. Execute more than one task simultaneously in overlapping time intervals. 
         3. Execute more than one task but has a consistent order.
         4. None of the above.
   
   10. What is meant by Parallelism in JAVA?
          1. Execute more than one task simultaneously in overlapping time intervals. 
          2. Execute more than one task simultaneously by using two different processes.
          3. Execute more than one task but has a consistent order.
          4. All of the Above.      
   
   11. What is the goal of the concurrent System?
         1. maximize throughput.
         2. minimize throughput.
         3. maximize latency.
         4. maximize throughput and also minimize latency.
   
   12. What is the goal of the Parallel System?
         1. Increasing the throughput and minimizing the hardware resources.
         2. Decreasing the throughput and maximizing the hardware resources. 
         3. Increasing the throughput and also maximize the hardware resources.
         4. Decreasing the throughput and also minimize the hardware resources.
#####  Suppose, You have a single-core operating System and you know that an operating system can process one task at a time.  You try to run two apps at the same time.  And you see that both apps running at the same time simultaneously. Could you be amazed? And then you decide that you want to increase the system's capability. As a result, you shift your machine from single core to multicore. And again you run these two apps. At that time two apps running on two different cores. (We just imagine the scenario there might be an abstract scenario in the practical case) 

13. What is the system of scenario one?
    1. Serial Connection System.
    2. Parallel System
    3. Concurrent System
    4. All of the Above.
14. What is the system of scenario two?
      1. Parallel System
      2. Serial Connection System
      3. Concurrent System
      4. None of the above
15. Which is not the correct quote in terms of java multithreading?
      1.  Parallel systems need not be Concurrent
      2. concurrent systems need not be parallel.
      3. Concurrency is about _dealing_ with lots of things at once
      4. Parallelism is about _doing_ lots of things at once
     
16. You have tried to execute multiple tasks using the multicore machine. From that point of view, systems are both concurrent and parallel. Is it True or False?
      1. True
      2. False
17. Which type of multitasking models are used by the System to achieve concurrency?
      1. preemptive multitasking.
      2. cooperative multitasking.
      3. All of the Above
      4. None of them

18. In preemptive multitasking programs can decide how long for or when they can use CPU ?
      1. True 
      2. False

19. In preemptive multitasking who decides how long for or when any program can use the CPU?
      1. Program itself.
      2. Thread itself
      3. Operating System Schedulers.
      4. Thread scheduler as well as the program itself. 

20. Suppose a malicious program is initiated in preemptive multitasking and it falls into an infinite loop. What happens at that time??
      1. It affects all the programs
      2. It hurts only itself and does not affect the other parts.
      3. Both 1 & 2.
      4. It will destroy the system. 

21. In preemptive multitasking, programmers have the burden to decide when to give back to the CPU code.
      1. True 
      2. False

22. Suppose, you are a programmer and you have tried to build a system that can be used by just one user (just imagine not being serious!!!)  Which type of multitasking would you use preemptive multitasking or cooperative multitasking? Gives your personal information. 

23. What will be happened in cooperative multitasking if malicious programs initiate?
      1. It doesn't affect the entire system.
      2. It will run on an infinite loop and doesn't give the control back to other programs or systems.
      3. It hurts only itself and does not affect the other parts.
      4. None of the above.

24. In cooperative multitasking who implements the cooperative multitasking?
      1. Process Scheduler 
      2. Cpu Scheduler
      3. Thread Scheduler
      4. None of the Above.
             
25. Which operating System was used for cooperative multitasking?
      1. Windows 10.
      2. Recent MacOS.
      3. Early Version of Windows and macOS.
      4. None of the operating systems.

 Ans> 1. (3) 3. (3) 4. (4) 5. (1)  6. (2) 7. (2) 8. (4) 9. (2) 10. (2) 11.(4) 12.(3) 13. (3) 14. (1) 15. (2) 16. (1)  17.(3) 18. (2) 19. (3) 20. (2) 21. (2) 22. 23. (2) 24. (1) 25. (3)     