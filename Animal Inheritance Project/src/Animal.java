//if you have an abstract method make an abstract class
public abstract class Animal
	{
		protected String name;
		protected String food;
		
		//it is abstracted because we want it overriden
		//can not instantiate it so abstract
		public abstract void bearsYoung();
		
		public abstract void makesNoise();
	
		public void eats()
		{
			System.out.println("The " + name + " is looking forward to eating some " + food + ".");
		}
	}
