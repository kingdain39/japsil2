package flag변수제어;

public class ControlledThread extends Thread{
	
	 private volatile boolean running = true; // 플래그 변수

	    public void stopRunning() {
	    	if(running == true) running = false;
	    	else running = false;
	    }

	    public void run() {
	        while (running) {
	            System.out.println("작업 중...");
							//stopRunning()가 호출되면 쉬는 동안 runnung의 값이 false로 바뀌고, 
							//바뀌는 순간 바로 무한루프를 탈출하여 종료한다.
							//외부에서 interrupt()요청이 와도 멈출 수 있다.
	            try {
	                Thread.sleep(500);   
	            } catch (InterruptedException e) {
	                System.out.println("인터럽트 발생!");
	                System.out.println("인터럽트 신호처리 후 :"+ this.isInterrupted());
	                //return;                
	            }
	        }
	        System.out.println("쓰레드 종료됨.");
	    }
	}


