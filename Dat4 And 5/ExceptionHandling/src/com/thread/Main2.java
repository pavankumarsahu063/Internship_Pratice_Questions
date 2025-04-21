package com.thread;

class MyThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
	}
	
}

public class Main2 {
	
	public static void main(String[] args) {
		MyThread1 r=new MyThread1();
		Thread t=new Thread(r);
		t.start();
		
		
	
		
	}

}
