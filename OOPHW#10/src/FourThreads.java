/*
 * Write a program that has 4 threads and prints the letters of the alphabet 
in their correct order. So for eg, thread 1 wil print A, thread 2 will 
then print B, thread 3 then prints C, and finally thread 4 will print a D. 
At this point, thread 1 is activated and it prints an E etc. Keep going 
around in a loop like that until you run out of letters. Then exit 
gracefully.
 */
public class FourThreads {
	int count = 1;
	public static void main(String[] args) {
		FourThreads t = new FourThreads();
		
		ThreadOne thread1 = new ThreadOne(t);
		ThreadTwo thread2 = new ThreadTwo(t);
		ThreadThree thread3 = new ThreadThree(t);
		ThreadFour thread4 = new ThreadFour(t);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		

	}
}

class ThreadOne extends Thread{
	char[] letters = {'A','E','I','M','Q','U','Y'};
	FourThreads t; 
	
	ThreadOne(FourThreads t){
		this.t = t;
	}
	
	public void run(){
		try{
			synchronized(t){
				for(char c:letters){
					while(t.count!=1){
						t.wait();
					}
					System.out.print(c+" ");
					t.count=2;
					t.notifyAll();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class ThreadTwo extends Thread{
	char[] letters ={'B','F','J','N','R','V','Z'};
	FourThreads t;
	
	ThreadTwo(FourThreads t){
		this.t=t;
	}
	
	public void run(){
		try{
			synchronized(t){for(char c:letters){
				while(t.count!=2){
					t.wait();
				}
				System.out.print(c+" ");
				t.count=3;
				t.notifyAll();
			}
		}
				
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
	
	
class ThreadThree extends Thread{
	char[] letters = {'C','G','K','O','S','W'};
	FourThreads t;
	
	ThreadThree(FourThreads t){
		this.t=t;
	}
	public void run(){
		try{
			synchronized(t){for(char c:letters){
				while(t.count!=3){
					t.wait();
				}
				System.out.print(c+" ");
				t.count=4;
				t.notifyAll();
			}
		}
				
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
		
		

class ThreadFour extends Thread{
	char[] letters = {'D','H','L','P','T','X'};
	FourThreads t;
	
	ThreadFour(FourThreads t){
		this.t=t;
	}
	public void run(){
		try{
			synchronized(t){
				for(char c:letters){
					while(t.count!=4){
						t.wait();
					}
					System.out.print(c+" ");
					t.count=1;
					t.notifyAll();
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
	
