package com.demo.thread;

public class MyThread extends Thread{
	SynchronisationTest t;  
     MyThread(SynchronisationTest t)
     {
           this.t=t;  
     }  
     public void run()
     {
           t.printNumber(9);  
     }  

}
