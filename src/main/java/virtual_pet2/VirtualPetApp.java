package virtual_pet2;

import java.util.Scanner;

public class VirtualPetApp {
	public static void main(String[] args) {
		VirtualPet vp = new VirtualPet();
		Scanner input = new Scanner(System.in);

		System.out.println("It looks like your new pet is here!");
		// pet image
		System.out.println(
				"Aww what an adorable cat! \n...\nThat doesn't look like a normal cat...\nOrgalorg the Vampire Cat Appears! \nWhat a challenge you have! \nYou'll have to take care of Orgalorg while hiding from the public! \nWho knows what will happen if they learn about Orgalorg! ");
		Boolean test = true;
		while (test) {
			System.out.println("");
			System.out.println("It is " + vp.militaryTimetoClock() + " and Orgalor needs attending to! \n");
			System.out.println("Orgalorg");
			System.out.println("Thirst for Blood: " + vp.hungerDescription() + "\nBoredom: " + vp.boredomDescription()
					+ "\nTiredness: " + vp.sleepDescription() + "\nPublic Opinion: " + vp.publicOpinionDescription());
			System.out.println("");

			System.out.println(
					"What do you want to do? \n1. Let Orgalorg feed \n2. Play with Orgalorg \n3. Let Orgalorg slumber \n4. Show off your NORMAL cat to the public \n5. Do Nothing???");
			int playerChoice = input.nextInt();

			if (vp.playertOverrideCat()) {
				vp.userInput(playerChoice);
			}
			// else {
			// vp.catOveride();
			// }
			vp.tick();

		}
		if (vp.publicOpinionLevel < 20)

		{
			System.out.println("You were found out!");

		}
	}
}
