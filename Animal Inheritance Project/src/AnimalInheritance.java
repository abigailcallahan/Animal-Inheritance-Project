
public class AnimalInheritance
	{
		static Animal[] zoo = new Animal[4];
		
		public static void main(String[] args)
			{
				zoo[0] = new Cow();
				zoo[1] = new Penguin();
				zoo[2] = new Robin();
				zoo[3] = new Bat();
				
				for(Animal a: zoo)
					{
						a.bearsYoung();
						a.eats();
						a.makesNoise();
						System.out.println();
					}
			}


		
	}
