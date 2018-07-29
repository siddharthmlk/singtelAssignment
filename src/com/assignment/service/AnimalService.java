package com.assignment.service;

import org.springframework.stereotype.Service;

/**
 * This class is responsible for creating instances of all the super and derived
 * classes.
 * 
 * We will also calculate the counts of different animals according to
 * the behavior implemented.
 * 
 * For the Chicken and Rooster, same Chicken.java class is used. If Chicken object is created with parameter,
 * where it only accepts RoosterSound Enum type values, then it behaves like Rooster object, otherwise without 
 * parameter its normal chicken object.
 * 
 * @author Siddharth.Malik
 *
 */

@Service
public class AnimalService {
	
	private static Animal[] animals=null;
	
	static {
		animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Chicken(RoosterSound.HINDI),
				new Parrot(PARROTTYPE.PARROT_CATS), new Fish(), new Shark(), new ClownFish(), new Dolphin(),
				new Butterfly(), };

	}

	public String getAnimalsBehaviorWiseCount() {
		int flyCount = 0, walkCount = 0, singCount = 0, swimCount = 0;
		for (Animal animal : animals) {
			if (animal instanceof ICanFly) {
				// ((ICanFly)animals[i]).fly();
				// System.out.println(((ICanFly)animals[i]).getClass().getName());
				flyCount++;
			}
		}

		for (Animal animal : animals) {
			if (animal instanceof ICanWalk) {
				walkCount++;
			}
		}

		for (Animal animal : animals) {
			if (animal instanceof ICanSwim) {
				swimCount++;
			}
		}

		for (Animal animal : animals) {
			if (animal instanceof ICanSing) {
				singCount++;
			}
		}

		return String.format("Animals Fly Count :: %s\nAnimals Sing Count :: "
						+ "%s\nAnimals Walk Count :: %s\nAnimals Swim Count :: %s",
				flyCount, singCount, walkCount, swimCount);
	}
	
	
	public static void main(String[] args) {
//		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Chicken(RoosterSound.HINDI),
//				new Parrot(PARROTTYPE.PARROT_CATS), new Fish(), new Shark(), new ClownFish(), new Dolphin(),
//				new Butterfly(), };
//		AnimalService sc = new AnimalService();
//		System.out.println(sc.getAnimalsBehaviorWiseCount(animals));
	}


}
