package animal;

import animal.Chicken.GenderOption;

public class Solution {
	 public static void main(String[] args) {
	 Bird bird = new Bird();
	 bird.walk();
	 bird.fly();
	 bird.sing();
	 
	 
	 
	 Animal[] animals = new Animal[]{
			 new Bird(),
			 new Duck(),
			 new Chicken(),
			 new Chicken(GenderOption.MALE),
			 new Parrot(),
			 new Shark(),
			 new ClownFish(),
			 new Dolphin(),
			 new Butterfly()
			};
	 int fly=0;
	 int walk =0;
	 int sing=0;
	 int swim=0;
	 for(Animal a : animals)
	 {
		 if(a.fly()!=null)
			 fly++;
		 if(a.walk()!=null)
			 walk++;
		 if(a.sing()!=null)
			 sing++;
		 if(a.swim()!=null)
			 swim++;
	 }
	 System.out.println("Fly :"+fly+ "\n walk :"+walk+"\n Sing :"+sing+"\n Swim :"+swim);
	 }
	}
