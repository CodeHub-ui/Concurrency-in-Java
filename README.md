# Concurrency in Java

This project demonstrates **Concurrency** in Java by implementing a multi-threaded program. The example program spawns multiple threads that perform independent tasks concurrently, showcasing how to use the `Thread` class and the `Runnable` interface.

---

## Features
- Implementation of concurrency using `Runnable` and `Thread`.
- Simulates parallel task execution.
- Synchronization using `join()` to ensure main thread waits for worker threads.
- Demonstrates basic thread lifecycle: start, run, and complete.

---

## How It Works
1. **CounterTask Class**:
   - Implements the `Runnable` interface.
   - Defines a task that counts from 1 to 5, simulating work with a delay (`Thread.sleep`).

2. **ConcurrencyDemo Class**:
   - The main class creates and starts multiple threads.
   - Uses `join()` to synchronize and ensure all tasks complete before the main thread exits.

3. **Thread Behavior**:
   - Each thread runs independently, printing its progress concurrently with others.

---

## Prerequisites
- Java Development Kit (JDK) 8 or later.
- A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).

---

## Running the Program
1. Clone or download the repository.
2. Open the project in your preferred IDE.
3. Compile and run `ConcurrencyDemo.java`.

---

## Example Output
```
Main thread starting...
Task 1 - Count: 1
Task 2 - Count: 1
Task 3 - Count: 1
Task 1 - Count: 2
Task 2 - Count: 2
Task 3 - Count: 2
...
Task 3 completed.
All tasks completed. Main thread exiting.
```
---

## Key Concepts
- **Thread Creation**:
  - A thread can be created by implementing the `Runnable` interface or extending the `Thread` class.

- **Concurrency**:
  - Allows multiple tasks to run in parallel, improving performance for independent tasks.

- **Thread Synchronization**:
  - The `join()` method ensures the main thread waits for all worker threads to complete execution.

---

## Enhancements
- Add more tasks to demonstrate higher concurrency.
- Use thread pools (`ExecutorService`) for more advanced concurrency management.
- Introduce synchronization blocks for shared resource access.

---

## License
This project is licensed under the MIT License. Feel free to use and modify it.

---
**Author:** 
- Name : Harshit Gupta
- Email : mrharshitgupta81@gmail.com

---


