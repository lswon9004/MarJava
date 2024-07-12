package day0405.thread;

public class ProducerCustomerEx{  
    public static void main(String[] args){ 
        Car c = new Car(20);      
        Producer producer = new Producer(c);         
        Thread tProducer = new Thread (producer);     
        Customer customer = new Customer(c);       
        Thread tCustomer = new Thread (customer);    
        tProducer.start();      
        tCustomer.start();  
    }
}
