import java.util.Random;

public abstract class AnimalCalls{
	
	public abstract String call();
	
	public static class Fish extends AnimalCalls{
		
		private String fishSays;
		
		Fish() {
			fishSays = "bubble bubble";
		}
		
		public String call(){
			return fishSays;
		}
	
	}
	
	public static class Bird extends AnimalCalls{
		private String birdSays;
		
		Bird(){
			birdSays = "caw caw";
		}
		
		public String call(){
			return birdSays;
		}
	}
	
	
	public static void main(String args[]){
		
		Random r = new Random();
		
		
		Bird steve = new Bird();
		Fish steve1 = new Fish();
		
		AnimalCalls[] animals = {};

		animals = new AnimalCalls[100];
		
		for(int i = 0; i < 100; i++){
			int sel = r.nextInt(2);
			if (sel == 0)
				animals[i] = steve;
			else
				animals[i] = steve1;			
		}
		
		for(int i = 0; i < 100; i++){
			System.out.println(animals[i].call());
		}
		
		System.exit(0);
		
		
	}
	
}