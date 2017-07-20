package com.example.thread.part1;
public class ThreadExamplte2 extends Thread{
    public void run(){
    	for(int i=1; i<=10; i++){
            System.out.println("ThreadExamplte2 : " + i+"번이 실행되었습니다.");
            try{
                sleep(1000);
            }catch(InterruptedException e){
            	
            }
        }
        System.out.println("ThreadExamplte2 종료");
    }
}
