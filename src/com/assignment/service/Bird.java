package com.assignment.service;

/**
 * All modelling related to different birds are taken care of in this class.
 * 
 * @author Siddharth.Malik
 *
 */
class Bird implements Animal, ICanFly, ICanSing, ICanWalk {

	public void walk() {
		System.out.println("I can walk");
	}

	public void fly() {
		System.out.println("I can fly");
	}

	public void sing() {
		System.out.println("I can sing");
	}
}

class Duck extends Bird implements ICanSwim {

	@Override
	public void sing() {
		System.out.println("Quack,quack");
	}

	@Override
	public void swim() {
		System.out.println("I can swim");
	}
}

class Chicken extends Bird implements ICanSing {

	private RoosterSound language;

	public Chicken() {
		super();
	}

	public Chicken(RoosterSound language) {
		super();
		this.language = language;
	}

	@Override
	public void sing() {
		if (null != language)
			System.out.println(language.getValue());
		else
			System.out.println("Cluck, cluck");
	}

}

class Parrot extends Bird {

	PARROTTYPE type;

	public Parrot(PARROTTYPE type) {
		this.type = type;
	}

	@Override
	public void sing() {
		System.out.println(type.getValue());
	}

}
