package virtual_pet2;

public class VirtualPet {
	public int hungerLevel = 100;
	public int boredomLevel = 100;
	public int sleepynessLevel = 100;
	public int publicOpinionLevel = 100;
	public int clock = 0;
	public int publicScared = 10;
	public int tick = 5;
	public int clockIncrease = 100;
	public int feedDay = 10;
	public int feedNight = 20;
	public int catNap = 600;
	public int playCat = 10;
	public int opinionChange = 10;
	public String[] hungerMood = { "Full", "Sasiated", "Thirsty", "Famished", "Hunger", "Feral", "Somethings wrong" };
	public String[] boredomMood = { "Content", "Interested", "Excited", "Bored", "Troublesome", "Somethings wrong" };
	public String[] sleepMood = { "Well Rested", "Wide Awake", "Dozy", "Tired", "Can't keep eyes open",
			"Somethings wrong" };
	public String[] publicMood = { "Unaware", "Getting hints", "suspicion is rising", "On the lookout for strangeness",
			"Pitchforks: They know", "Somethings wrong" };
	public String[] clockTime = { "12:00 am", "1:00 am", "2:00 am", "3:00 am", "4:00 am", "5:00 am", "6:00 am",
			"7:00 am", "8:00 am", "9:00 am", "10:00 am", "11:00 am", "12:00 pm", "1:00 pm", "2:00 pm", "3:00 pm",
			"4:00 pm", "5:00 pm", "6:00 pm", "7:00 pm", "8:00 pm", "9:00 pm", "10:00 pm", "11:00 pm" };
	public String[] possibleResponces = { "Oh no! The public saw Orgalorg feed!!!",
			"Ah Orgalorg has feasted on the blood of the mortals",
			"What an enjoyable game of plotting your neighbor's death",
			"You may call it a cat nap but Orgalorg is only plotting with his eyes closed!",
			"Orgalorg does not enjoy being shown off in this manner! Bow to Orgalorg" };

	// day feeding
	public int feedPetDay() {
		art(5);
		System.out.println(possibleResponces[0]);
		if (hungerLevel < 100) {
			hungerLevel = hungerLevel + feedDay;
		} else {
			hungerLevel = 100;
		}
		publicOpinionLevel = publicOpinionLevel - publicScared;
		return hungerLevel;
	}

	// night feeding
	public int feedPetNight() {
		art(1);
		System.out.println(possibleResponces[1]);
		if (hungerLevel < 100) {
			hungerLevel = hungerLevel + feedNight;
		} else {
			hungerLevel = 100;
		}
		return hungerLevel;
	}

	// play with
	public int playWithPet() {
		art(3);
		System.out.println(possibleResponces[2]);
		if (boredomLevel < 100) {
			boredomLevel = boredomLevel + playCat;
		} else {
			boredomLevel = 100;
		}
		sleepynessLevel = sleepynessLevel - playCat;
		return boredomLevel;
	}

	// sleep
	public int putPetToSleep() {
		art(2);
		System.out.println(possibleResponces[3]);
		if (sleepynessLevel < 100) {
			sleepynessLevel = sleepynessLevel + playCat;
		} else {
			sleepynessLevel = 100;
		}
		clock = clock + catNap;
		return sleepynessLevel;
	}

	// opinion
	public int publicOpinion() {
		publicOpinionLevel = publicOpinionLevel - opinionChange;
		return publicOpinionLevel;
	}

	// tick
	public int tick() {
		clock = clock + clockIncrease;
		if (clock > 2300) {
			clock = 0;
		}
		hungerLevel = hungerLevel - tick;
		boredomLevel = boredomLevel - tick;
		sleepynessLevel = sleepynessLevel - tick;
		return clock;
	}

	// is it day
	public Boolean isItDay() {
		if (clock >= 700 && clock <= 1700) {
			return true;
		} else {
			return false;
		}
	}

	// show off cat
	public int showOffCat() {
		art(4);
		System.out.println(possibleResponces[4]);
		if (publicOpinionLevel < 100) {
			publicOpinionLevel = publicOpinionLevel + opinionChange;
		} else {
			publicOpinionLevel = 100;
		}
		boredomLevel = boredomLevel - opinionChange;
		return publicOpinionLevel;
	}

	// do nothing
	public void doNothing() {
		art(1);
	}

	// change number to string description
	public String hungerDescription() {
		if (hungerLevel >= 90) {
			return hungerMood[0];
		} else if (hungerLevel >= 80 && hungerLevel < 90) {
			return hungerMood[1];
		} else if (hungerLevel >= 60 && hungerLevel < 80) {
			return hungerMood[2];
		} else if (hungerLevel >= 40 && hungerLevel < 60) {
			return hungerMood[3];
		} else if (hungerLevel >= 20 && hungerLevel < 40) {
			return hungerMood[4];
		} else if (hungerLevel < 20) {
			return hungerMood[5];
		} else {
			return hungerMood[6];
		}
	}

	// change number to string description
	public String boredomDescription() {
		if (boredomLevel >= 90) {
			return boredomMood[0];
		} else if (boredomLevel >= 80 && boredomLevel < 90) {
			return boredomMood[1];
		} else if (boredomLevel >= 60 && boredomLevel < 80) {
			return boredomMood[2];
		} else if (boredomLevel >= 40 && boredomLevel < 60) {
			return boredomMood[3];
		} else if (boredomLevel >= 20 && boredomLevel < 40) {
			return boredomMood[4];
		} else if (boredomLevel < 20) {
			return boredomMood[5];
		} else {
			return boredomMood[6];
		}
	}

	// change number to string description
	public String sleepDescription() {
		if (sleepynessLevel >= 90) {
			return sleepMood[0];
		} else if (sleepynessLevel >= 80 && sleepynessLevel < 90) {
			return sleepMood[1];
		} else if (sleepynessLevel >= 60 && sleepynessLevel < 80) {
			return sleepMood[2];
		} else if (sleepynessLevel >= 40 && sleepynessLevel < 60) {
			return sleepMood[3];
		} else if (sleepynessLevel >= 20 && sleepynessLevel < 40) {
			return sleepMood[4];
		} else if (sleepynessLevel < 20) {
			return sleepMood[5];
		} else {
			return sleepMood[6];
		}
	}

	// change number to string description
	public String publicOpinionDescription() {
		if (publicOpinionLevel >= 90) {
			return publicMood[0];
		} else if (publicOpinionLevel >= 80 && publicOpinionLevel < 90) {
			return publicMood[1];
		} else if (publicOpinionLevel >= 60 && publicOpinionLevel < 80) {
			return publicMood[2];
		} else if (publicOpinionLevel >= 40 && publicOpinionLevel < 60) {
			return publicMood[3];
		} else if (publicOpinionLevel >= 20 && publicOpinionLevel < 40) {
			return publicMood[4];
		} else if (publicOpinionLevel < 20) {
			return publicMood[5];
		} else {
			return publicMood[6];
		}
	}

	// is the cat influencing player choice
	public Boolean playertOverrideCat() {
		if ((hungerLevel < 20) || (boredomLevel < 20) || (sleepynessLevel < 20)) {
			return false;
		} else {
			return true;
		}
	}

	// if the cat does influence player choice
	public int catOveride() {
		System.out.println("");
		System.out.println("Orgalorg cannot be constrained by a meer mortal!");
		if (hungerLevel < 20) {
			System.out.println("Orgalorg must feed!");
			return 1;
		} else if (sleepynessLevel < 20) {
			System.out.println("Orgalorg must slumber!");
			return 3;
		} else if (boredomLevel < 20) {
			System.out.println("Orgalorg must play!");
			return 2;
		} else {
			return 2;
		}
	}

	// public knows
	public Boolean PublicKnowledge() {
		if (publicOpinionLevel < 20) {
			return true;
		} else {
			return false;
		}
	}

	// player choice
	public void userInput(int user) {
		switch (user) {
		case 1:
			if (isItDay()) {
				// System.out.println("It is day");
				feedPetDay();
			} else {
				// System.out.println("It is night");
				feedPetNight();
			}
			break;
		case 2:
			playWithPet();
			break;
		case 3:
			putPetToSleep();
			break;
		case 4:
			showOffCat();
			break;
		case 5:
			doNothing();
			break;
		case 6:
			feedPetNight();
			break;
		default:
			doNothing();
			break;
		}
	}

	// changing military time to standard time
	public String militaryTimetoClock() {
		if (clock == 0) {
			return clockTime[0];
		} else if (clock == 100) {
			return clockTime[1];
		} else if (clock == 200) {
			return clockTime[2];
		} else if (clock == 300) {
			return clockTime[3];
		} else if (clock == 400) {
			return clockTime[4];
		} else if (clock == 500) {
			return clockTime[5];
		} else if (clock == 600) {
			return clockTime[6];
		} else if (clock == 700) {
			return clockTime[7];
		} else if (clock == 800) {
			return clockTime[8];
		} else if (clock == 900) {
			return clockTime[9];
		} else if (clock == 1000) {
			return clockTime[10];
		} else if (clock == 1100) {
			return clockTime[11];
		} else if (clock == 1200) {
			return clockTime[12];
		} else if (clock == 1300) {
			return clockTime[13];
		} else if (clock == 1400) {
			return clockTime[14];
		} else if (clock == 1500) {
			return clockTime[15];
		} else if (clock == 1600) {
			return clockTime[16];
		} else if (clock == 1700) {
			return clockTime[17];
		} else if (clock == 1800) {
			return clockTime[18];
		} else if (clock == 1900) {
			return clockTime[19];
		} else if (clock == 2000) {
			return clockTime[20];
		} else if (clock == 2100) {
			return clockTime[21];
		} else if (clock == 2200) {
			return clockTime[22];
		} else if (clock == 2300) {
			return clockTime[23];
		} else {
			return null;
		}
	}

	public void art(int selection) {
		if (selection == 1) {
			System.out.println("  _._     _,-''''''-.");
			System.out.println(" (,-.`._,'(       |\\`-/| ");
			System.out.println("    `-.-' \\ )-`( , o o)");
			System.out.println("          `-    \\`_`''-");
		}
		if (selection == 2) {
			System.out.println("      |\\      _,,,---,,_");
			System.out.println("ZZZzz /,`.-'`'    -.    ;-;;,_");
			System.out.println("     |,4-  ) )-,_. ,\\ (  `'-'");
			System.out.println("    '---''(_/--'  `-'\\_)  ");
		}
		if (selection == 3) {
			System.out.println("    |\\__/,|   (`\\");
			System.out.println("  _.|o o  |_   ) )");
			System.out.println(" -(((---(((--------");

		}
		if (selection == 4) {
			System.out.println(" |\\'/-..--.");
			System.out.println(" / _ _   ,  ;");
			System.out.println("`~=`Y'~_<._./");
			System.out.println("<`-....__.'");
		}

		if (selection == 5) {
			System.out.println("       >\\\\\\|/<");
			System.out.println("       |_\"\"\"_|");
			System.out.println("        (O) (o)");
			System.out.println("+----OOO--(_)--OOOo----");
			System.out.println("");

		}
		if (selection == 6) {
			System.out.println("	          ///\"\\");
			System.out.println("	          |6 6|");
			System.out.println("	          \\ - /");
			System.out.println("	   .@@@. __) (__");
			System.out.println("	   @6 6@/  \\./  \\");
			System.out.println("	   @ = @ :  :  : \\");
			System.out.println("	   _) (_'|  :  |) )");
			System.out.println("	 /' \\./ '\\  :  |_/");
			System.out.println("        / /\\ _ /\\ \\=o==|)");
			System.out.println("        \\ \\)  (/ /%|%%'");
			System.out.println("	'7/    \\7%%|%%'");
			System.out.println("	  |    |`%%|%%'");
			System.out.println("	  |    |`%%|%%'");
			System.out.println("	  |    |`%%|%%'");
			System.out.println("	  |_.._| /_|_\\");

		}
	}
	// is it night
	// public Boolean isItNight() {
	// if ((clock >= 1800 && clock <= 2300) || (clock >= 0 && clock <= 600)) {
	// return true;
	// } else {
	// return false;
	// }
	// }
}
