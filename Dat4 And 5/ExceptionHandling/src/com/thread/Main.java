package com.thread;



class MyThread extends Thread {
	public void run() {
		System.out.println("Thread Started");
		for (int i = 0; i <= 10; i++) {
			System.out.println(getName()+ getId() + "--"+i);
			try {
			Thread.sleep(500);
			}
		 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setName("child");
		t.start();
		

//		for (int i = 0; i <= 10; i++) {
//			System.out.println("Main Thread: " + i);
//		}
	}
}
