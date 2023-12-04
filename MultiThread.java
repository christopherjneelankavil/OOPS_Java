class ThreadA extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread A i = "+(-1*i));
        }
        System.out.println("Thread A exiting");
    }
}
class ThreadB extends Thread{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("Thread B j = "+(j*2));
        }
        System.out.println("Thread B exiting");
    }
}
class ThreadC extends Thread{
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("Thread C k ="+(2*k-1));
        }
        System.out.println("Thread C exiting");
    }
}

public class MultiThread{
    public static void main(String[] args) {
        ThreadA t1=new ThreadA();
        ThreadB t2=new ThreadB();
        ThreadC t3=new ThreadC();
        t1.start();
        t2.start();
        t3.start();
    }
}

// Output

// Thread C k =1
// Thread A i = -1
// Thread A i = -2
// Thread A i = -3
// Thread A i = -4
// Thread B j = 2
// Thread B j = 4
// Thread B j = 6
// Thread B j = 8
// Thread B j = 10
// Thread B exiting
// Thread C k =3
// Thread C k =5
// Thread C k =7
// Thread C k =9
// Thread C exiting
// Thread A i = -5
// Thread A exiting



// Algorithm for MultiThread

// Step 1: Start

// Step 2: Define ThreadA class
//     2.1: Create a class ThreadA that extends Thread.
//     2.2: Override the run() method in ThreadA.
//     2.3: Inside run(), use a for loop to print "Thread A i = -1*i" for i from 1 to 5.
//     2.4: Print "Thread A exiting" after the loop.

// Step 3: Define ThreadB class
//     3.1: Create a class ThreadB that extends Thread.
//     3.2: Override the run() method in ThreadB.
//     3.3: Inside run(), use a for loop to print "Thread B j = j*2" for j from 1 to 5.
//     3.4: Print "Thread B exiting" after the loop.

// Step 4: Define ThreadC class
//     4.1: Create a class ThreadC that extends Thread.
//     4.2: Override the run() method in ThreadC.
//     4.3: Inside run(), use a for loop to print "Thread C k = 2*k-1" for k from 1 to 5.
//     4.4: Print "Thread C exiting" after the loop.

// Step 5: Define MultiThread class
//     5.1: Create a public class MultiThread.
//     5.2: Inside the main() method:
//         5.2.1: Create instances of ThreadA (t1), ThreadB (t2), and ThreadC (t3).
//         5.2.2: Start each thread using the start() method.

// Step 6: End
