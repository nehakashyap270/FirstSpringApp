package com.limra.example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyCyclicBarrier implements Runnable {
	CyclicBarrier barrier1=null;
	CyclicBarrier barrier2=null;
	
	public MyCyclicBarrier(CyclicBarrier barrier1, CyclicBarrier barrier2) {
		this.barrier1=barrier1;
		this.barrier2=barrier2;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+"waiting at barrier 1");
			this.barrier1.await();
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+"waiting at barrier 2");
			this.barrier2.await();
			System.out.println(Thread.currentThread().getName() +"done!!");
			
		}catch(InterruptedException | BrokenBarrierException ib) {
			ib.printStackTrace();
			
		}
	}

}
