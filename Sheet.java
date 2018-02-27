/* Sheet class
 * Brian Eckenrode
 * February 2018
 */

import java.util.Scanner;

class Sheet
{
	private String charName;
	private String playerName;
	private int raceID;
	private Stats stats;
	private int initiativeMod;

	private Race raceList = new Race();
	private Scanner in = new Scanner(System.in).useDelimiter("\\n");

	public Sheet()
	{
		charName = getString("Please enter your character's name.", in);
		playerName = getString("Please enter your actual name.", in);
		raceID = selectRace(in);
		stats = new Stats(raceList.get(raceID).getMods());
		initiativeMod = getDexMod();
	}

	public String getName()
	{
		return charName;
	}

	public int[] getStats()
	{
		return stats.getStats();
	}

	public int getStr()
	{
		return stats.getStr();
	}

	public int getDex()
	{
		return stats.getDex();
	}

	public int getCon()
	{
		return stats.getCon();
	}

	public int getInt()
	{
		return stats.getInt();
	}

	public int getWis()
	{
		return stats.getInt();
	}

	public int getCha()
	{
		return stats.getCha();
	}

	public int getStrMod()
	{
		return calcMod(stats.getStr());
	}

	public int getDexMod()
	{
		return calcMod(stats.getDex());
	}

	public int getConMod()
	{
		return calcMod(stats.getCon());
	}

	public int getIntMod()
	{
		return calcMod(stats.getInt());
	}

	public int getWisMod()
	{
		return calcMod(stats.getWis());
	}

	public int getChaMod()
	{
		return calcMod(stats.getCha());
	}

	private int calcMod(int baseStat)
	{
		return ((baseStat - 10) / 2);
	}

	private String getString(String prompt, Scanner in)
	{
		System.out.println(prompt);
		System.out.print("> ");

		return in.next();
	}

	private int selectRace(Scanner in)
	{
		System.out.println("Please select your race.");
		System.out.println();

		for(int i = 0; i != raceList.size(); ++i)
		{
			System.out.printf("(%2d) : %s\n", (i + 1), raceList.get(i).getRace());
		}

		System.out.print("> ");

		return (in.nextInt() - 1);
	}

	public void printSheet()
	{
		System.out.println("Character name: " + charName);
		System.out.println("Player's name : " + playerName);
		System.out.println("Race : " + raceList.get(raceID).getRace());
		stats.printStats();
	}
}