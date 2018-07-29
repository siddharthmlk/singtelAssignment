package com.assignment.service;

/**
 * These enums are created to restrict the different sounds a rooster can make and different types Parrot bird
 * can have.
 * 
 * @author Siddharth.Malik
 *
 */

enum RoosterSound {

	DANISH("kykyliky"), DUTCH("kukeleku"), FINNISH("kukko kiekuu"), FRENCH("cocorico"), GERMAN("kikeriki"), GREEK(
			"kikiriki"), HEBREW("coo-koo-ri-koo"), URDU("kuklooku"), ENGLISH("Cock-a-doodle-doo"), HINDI("Cuckduuu Ku");

	private String value;

	private RoosterSound(String language) {
		this.value = language;
	}

	public String getValue() {
		return value;
	}
}

enum PARROTTYPE {

	PARROT_DOGS("Woof, woof"), PARROT_CATS("Meow"), PARROT_ROOSTER("Cock-a-doodle-doo");

	String value;

	private PARROTTYPE(String type) {
		this.value = type;
	}

	public String getValue() {
		return value;
	}
}
