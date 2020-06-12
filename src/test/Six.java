package test;

public class Six {
	public static void main(String[] args) {
		
		boolean isRainy = true;
		boolean hasUmbrella = false;
		
		if (isRainy && hasUmbrella == true) {      //and
			System.out.println("Take your umbrella");			
        } else if (isRainy == true|| hasUmbrella == true) {//or
        	System.out.println("It is either raining, or you have an umbrella, or both");
        } else {
        	System.out.println("It is not raining");
        }
		
   }

}