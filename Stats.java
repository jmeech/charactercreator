/* Class to handle stats
 * Brian Eckenrode
 * February 2018
 */

import java.util.Scanner;

class Stats
{
	private int[] statList = new int[6];
	private String[] statNames = {"Strength    ", "Dexterity   ", "Constitution",
								  "Intelligence", "Wisdom      ", "Charisma    "};

	public Stats(int[] mods)
	{
		if (mods.length != 6)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			setStats(mods);
		}
	}

	public int getStr()
	{
		return statList[0];
	}

	public int getDex()
	{
		return statList[1];
	}

	public int getCon()
	{
		return statList[2];
	}

	public int getInt()
	{
		return statList[3];
	}

	public int getWis()
	{
		return statList[4];
	}

	public int getCha()
	{
		return statList[5];
	}

	public void setStr(int x)
	{
		if(x > 0 && x <= 20)
		{
			statList[0] = x;
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	public void setDex(int x)
	{
		if(x > 0 && x <= 20)
		{
			statList[1] = x;
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	public void setCon(int x)
	{
		if(x > 0 && x <= 20)
		{
			statList[2] = x;
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	public void setInt(int x)
	{
		if(x > 0 && x <= 20)
		{
			statList[3] = x;
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	public void setWis(int x)
	{
		if(x > 0 && x <= 20)
		{
			statList[4] = x;
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	public void setCha(int x)
	{
		if(x > 0 && x <= 20)
		{
			statList[5] = x;
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	public int[] getStats()
	{
		return statList;
	}

	public void printStats()
	{
		for(int i = 0; i != 6; ++i)
		{
			System.out.printf("%s : %d\n", statNames[i], statList[i]);
		}
		System.out.println();
	}

	private boolean selectMethod(Scanner in)
	{
		int choice;

		while(true)
		{
			System.out.println("Would you like to use default values (1) or rolled stats (2) ?");
			System.out.print("> ");

			choice = in.nextInt();

			if(choice == 1)
			{
				return true;
			}
			else if(choice == 2)
			{
				return false;
			}
			else
			{
				System.out.println("Invalid choice.");
			}
		}
	}

	private void setStats(int[] mods)
	{
		int choice;
		int last = 21;
		int[] values = {15, 14, 13, 12, 10, 8};
		Scanner in = new Scanner(System.in);

		if(selectMethod(in)) {}
		else
		{
			Dice dice = new Dice();
			values = new int[6];

			System.out.println("Your rolled stats are: ");

			for(int i = 0; i != 6; ++i)
			{
				values[i] = dice.getStat();
				System.out.print(values[i] + ((i < 5) ? ", " : "\n"));
			}
		}

		for(int i = 0; i != 5; ++i)
		{
			System.out.printf("What stat would you like to set at %d?\n", values[i]);
			for(int j = 0; j != 6; ++j)
			{
				if(statList[j] == 0)
				{
					System.out.printf("(%d) : %s\n", (j + 1), statNames[j]);
				}
			}

			while(true)
			{
				System.out.print("> ");

				choice = in.nextInt();
				last -= choice;

				--choice;

				if(choice >= 0 && choice <= 5 && statList[choice] == 0)
				{

					statList[choice] = (values[i] + mods[choice]);

					if (statList[choice] > 20)
					{
						statList[choice] = 20;
					}

					break;
				}
				else
				{
					System.out.println("Invalid choice.");
				}
			}
		}
		statList[--last] = values[5];
		in.close();
	}
}