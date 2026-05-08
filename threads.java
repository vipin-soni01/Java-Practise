// Threads is a simple small and light weight(or preogram) which uses independently for the execution for the exection of the particular task.


// Multi threading - is the process of running multiple threads conqurentely for the optimal utilization of the CPU resources.

//  Multi tasking - is the independent execuion of the processes itself.

/* Java uses two ways to achieve multi threading

1. Extending Thread Class of java.lang package
2. By using runable runable interface


---------------------
NOTE :-  By dealing with multithreading in java most often we come accross a checked exception (Interrupted Exception).
---------------------
*/



/* Life Cycle of Threads - getState()

1. New - It is the state where thread gets created
2. Runable - It is ready to start but it waiting for CPU resource allocation.
3. Running - Thread is executing.
4. Blocked/Time-Waiting - Waiting for the release of resources or locks
5. Terminated - 


Limitation of 1st way -- 
1. To achieve mukti therading enviroment our class needs to extend . As per the 1st way, but it restricts our class to extend thread class ; 
it goes to2nd way bcz Multiple interfaces can be implemented.
*/


/* 
class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThreadClass());
        t1.start();
        t1.join();   // join() methods make the other 
        Thread t2 = new Thread(new MyThreadClass());
        t2.start();
    } 
}
*/


class Main{
    public static void print(List<? extends Number> list){

    }

    // lowerBound WildBound
    public static void print(List<? super Integer> list){

    }

    public static void main(String[] args){
        List<number> al = List.of(1,2,3,4,5);
        print(al);
    }
}

