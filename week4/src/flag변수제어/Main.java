	package flag변수제어;
	
	public class Main {
	    public static void main(String[] args) throws InterruptedException {
	        ControlledThread t = new ControlledThread();
	        t.start();
	        
	        while(true){
	            Thread.sleep(3000); // 3초 후 종료 요청
	            System.out.println("인터럽트 신호보내기 전 :"+ t.isInterrupted());
	            t.interrupt();
	            System.out.println("인터럽트 신호처리 중 :"+ t.isInterrupted());         

	            //t.interrupt(); //메소드로 종료요청
	            System.out.println("--------------");
	            t.stopRunning();// 플래그로 종료 요청
	         }
	             
	/*
	        Thread.sleep(3000); // 3초 후 종료 요청
	        System.out.println("인터럽트 신호보내기 전 :"+ t.isInterrupted());
	        t.interrupt();
	        System.out.println("인터럽트 신호처리 중 :"+ t.isInterrupted());
	        t.stopRunning();    // 플래그로 종료 요청
	        
				//t.interrupt(); //메소드로 종료요청
	*/
	
	    }
	}