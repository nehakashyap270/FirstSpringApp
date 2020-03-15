package com.limra.example;

import java.util.concurrent.CountDownLatch;

public class LatchMain {

	public static void main(String[] args) throws Exception {
		CountDownLatch latch = new CountDownLatch(3);

		Waiter      waiter      = new Waiter(latch);
		Decrementer decrementer = new Decrementer(latch);

		new Thread(waiter)     .start();
		new Thread(decrementer).start();

		Thread.sleep(4000);

	}

}
