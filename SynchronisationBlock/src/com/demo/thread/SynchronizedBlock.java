package com.demo.thread;

public class SynchronizedBlock {
	
	 public static void main(String args[])
     {  
		 SynchronisationTest obj = new SynchronisationTest();  
           MyThread t1=new MyThread(obj);
           t1.start();     
     }  

}
