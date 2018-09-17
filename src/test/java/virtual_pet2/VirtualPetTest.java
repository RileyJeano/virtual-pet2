package virtual_pet2;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
	// user feed during day
	@Test
	public void feedPetDay() {
		VirtualPet underTest = new VirtualPet();
		int foodNumber = underTest.feedPetDay();
		Assert.assertEquals("Should be 100", 100, foodNumber);

	}

	// user feed during night
	@Test
	public void feedPetNight() {
		VirtualPet underTest = new VirtualPet();
		int foodNumber = underTest.feedPetNight();
		Assert.assertEquals("Should be 100", 100, foodNumber);
	}

	// user bored
	@Test
	public void playWithPet() {

		VirtualPet underTest = new VirtualPet();
		int boredomeNumber = underTest.playWithPet();
		Assert.assertEquals("Should be 100", 100, boredomeNumber);
	}

	// user sleepy
	@Test
	public void putPetToSleep() {
		VirtualPet underTest = new VirtualPet();
		int sleepNumber = underTest.putPetToSleep();
		Assert.assertEquals("Should be 100", 100, sleepNumber);
	}

	// public opinion
	@Test
	public void publicOpinion() {
		VirtualPet underTest = new VirtualPet();
		int publicOpinionNumber = underTest.publicOpinion();
		Assert.assertEquals("Should be 90", 90, publicOpinionNumber);
	}

	// tick
	@Test
	public void tickCounter() {
		VirtualPet underTest = new VirtualPet();
		int tickCounterNumber = underTest.tick();
		Assert.assertEquals("Should be 100", 100, tickCounterNumber);
	}

	// day or night
	@Test
	public void isItDay() {
		VirtualPet underTest = new VirtualPet();
		Boolean dayOrNightNumber = underTest.isItDay();
		Assert.assertEquals("Should be false", false, dayOrNightNumber);
	}

	// show off normal cat

	@Test
	public void showOffCat() {
		VirtualPet underTest = new VirtualPet();
		int showOffCatNumber = underTest.showOffCat();
		Assert.assertEquals("Should be 100", 100, showOffCatNumber);
	}

	// change hunger to string
	@Test
	public void hungerDescription() {
		VirtualPet underTest = new VirtualPet();
		String petFeeling = underTest.hungerDescription();
		Assert.assertEquals("Should be Full", "Full", petFeeling);
	}

	// change boredom to string
	@Test
	public void boredomDescription() {
		VirtualPet underTest = new VirtualPet();
		String boredomeFeeling = underTest.boredomDescription();
		Assert.assertEquals("Should be Content", "Content", boredomeFeeling);
	}

	// change sleepyness to string
	@Test
	public void sleepDescription() {
		VirtualPet underTest = new VirtualPet();
		String sleepFeeling = underTest.sleepDescription();
		Assert.assertEquals("Should be Well Rested", "Well Rested", sleepFeeling);
	}

	// change public opinion
	@Test
	public void publicOpinionDescription() {
		VirtualPet underTest = new VirtualPet();
		String opinionFeeling = underTest.publicOpinionDescription();
		Assert.assertEquals("Should be Unaware", "Unaware", opinionFeeling);
	}

	// change clock to readable number
	@Test
	public void militaryTimetoClock() {
		VirtualPet underTest = new VirtualPet();
		String properTime = underTest.militaryTimetoClock();
		Assert.assertEquals("Should be 12:00 am", "12:00 am", properTime);
	}

	// check if player has a choice
	@Test
	public void playertOverrideCat() {
		VirtualPet underTest = new VirtualPet();
		Boolean playerOverride = underTest.playertOverrideCat();
		Assert.assertEquals("Should be true", true, playerOverride);
	}

	// the cat does it's own thing
	@Test
	public void catOveride() {
		VirtualPet underTest = new VirtualPet();
		int catChoice = underTest.catOveride();
		Assert.assertEquals("Should be 2", 2, catChoice);
	}

	// the public knows end game
	@Test
	public void publicKnows() {
		VirtualPet underTest = new VirtualPet();
		Boolean publicKnowledge = underTest.PublicKnowledge();
		Assert.assertEquals("Should be false", false, publicKnowledge);
	}

	// test user input
	@Test
	public void userInput() {
		VirtualPet underTest = new VirtualPet();

	}

	// feed either other cat or dog

}
