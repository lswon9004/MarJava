package day0405.thread;

public class Customer implements Runnable { 
	private Car car; 
    public Customer (Car car){
        this.car = car;
    }
    public void run(){          
        @SuppressWarnings("unused")
		String carName = null;         
        for (int i = 0; i <car.max; i++){               
            carName = car.pop();               
            try{                    
                Thread.sleep((int)(Math.random() * 200));               
            } catch (InterruptedException e) { 
                e.printStackTrace();
            }        
        }
        System.out.println("Customer end");
    }
}
