package com.assignment.service;

/**
 * In Fish Model class, swimming animals and other below points are taken care of:
 * 
 * Model fish as well as other swimming animals
1. In addition to the birds, can you model a fish?
a. Fishes don’t sing
b. Fishes don’t walk
c. Fishes can swim

2. Can you specialize the fish as a Shark and as a Clownfish?
a. Sharks are large and grey
b. Clownfish are small and colourful (orange)
c. Clownfish make jokes
d. Sharks eat other fish

3. Dolphins are not exactly fish, yet, they are good swimmers
a. Can you model a dolphin that swims without inheriting from a fish class?
b. How do you avoid duplicating code or introducing unneeded overhead?
D. Model animals that change their behaviour over time

1. Can you model a butterfly?
a. A butterfly can fly
b. A butterfly does not make a sound

2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
a. A caterpillar cannot fly
b. A caterpillar can walk (crawl)

 * @author Siddharth.Malik
 *
 */

class Fish extends CanSwim {}

class CanSwim implements ICanSwim, Animal{

	@Override
	public void swim() {
		System.out.println("I can swim");
	}
}

class Shark extends Fish {

	public void specialization() {
		System.out.println("I am large and grey");
		System.out.println("I eat other fish");
	}
}

class ClownFish extends Fish {

	void specialization() {
		System.out.println("I am small and orange");
		System.out.println("I make Jokes");
	}
}

class Dolphin extends CanSwim {}


class Caterpillar implements Animal, ICanWalk {

	@Override
	public void walk() {
		System.out.println("I can walk");
	}

}

class Butterfly extends Caterpillar implements ICanFly {

	@Override
	public void fly() {
		System.out.println("I can fly");
	}

}