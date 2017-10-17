package com.api.thread.ch3;

public class RunnableExample implements Runnable {
    /* Interface의 run method 구현하기. */
    @Override
    public void run() {
        /* 작업내용 */
    }

    public static void main(String args[]) {
		/* Interface Instance */
        RunnableExample runnableExample = new RunnableExample();
		/* Oracle 문서 : Runnable Interface는 Thread에 의해 실행될 class에 Implements 되어야 합니다. 이 클래스에는 인자가 없는 run() method를 재정의해아합니다.*/
        Thread thread = new Thread(runnableExample);
        thread.setPriority(10);
        thread.start();
    }
}