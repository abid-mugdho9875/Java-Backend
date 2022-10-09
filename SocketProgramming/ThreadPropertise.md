# Main thread Propertise 
1. Thread has custom name and unique id.
2. Thread can be marked as a demon or user(default) thread.
3. Thread could be assigned a priority.

- Priority determines the number of cpu time slots the threar scheduler allocates to this thread , but it can not gurantee the order of execution.
- Jvm exits when all user threads terminates. JVM don't care if daemon thread running or not. 
- Daemon is a low pritity thread that runs in the background. It's still running when all user thread finished. Even though running when JVM exits.
- Higher priority means it gets higher time in CPU, but when cpu are doing other tasks. Then it does n't gives priority on it. 