package day0405.thread;

class ATM implements Runnable {
	   private long depositeMoney = 15000;
	   @Override
	   public void run() {
	      synchronized (this) {//동기화 블럭
	         for (int i = 0; i < 10; i++) {
	            try {
	               Thread.sleep(100);
	            } catch (InterruptedException e) {
	               e.printStackTrace();
	            }
	            if (getDepositeMoney() <= 0)
	               break;
	            withDraw(1000);
	         }
	      }
	   }

	   public void withDraw(long howMuch) {
	      if (getDepositeMoney() >= howMuch) {
	         depositeMoney -= howMuch;
	         System.out.print(Thread.currentThread().getName() + " , ");
	         System.out.printf("잔액 : %,d 원 %n", getDepositeMoney());
	      } else {
	         System.out.print(Thread.currentThread().getName() + " , ");
	         System.out.println("잔액이 부족합니다.");
	      }
	   }
	   public long getDepositeMoney() {
	      return depositeMoney;
	   }
	}

	public class SynchronizedEx {
	   public static void main(String[] args) {
	      ATM atm = new ATM();
	      Thread mother = new Thread(atm, "mother");
	      Thread son = new Thread(atm, "son");
	      mother.start();
	      son.start();
	   }
	}
