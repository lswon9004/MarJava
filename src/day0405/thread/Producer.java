package day0405.thread;

public class Producer implements Runnable{  
    private Car car; 
    public Producer(Car car){
        this.car = car;
    }
    public void run(){   
        String carName=null;
        for (int i = 0; i < car.max; i++){            
            carName = car.getCar();         
            car.push(carName);         
            try{                
                Thread.sleep((int)(Math.random() * 200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }     
        }
        System.out.println("Producer end");        
    }     
}
