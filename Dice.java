/* Dice class for character creator
 * Brian Eckenrode
 * February 2018
 */

import java.util.Random;
import java.util.Date;

class Dice
{

	private Random rand = new Random();
	private int sum;

	public Dice()
	{
		rand.setSeed(new Date().getTime());
	}

	public int d4()
	{
		return (rand.nextInt(4) + 1);
	}

	public int d4(int n)
	{
		sum = 0;
		if(n > 0)
		{
			for(int i = 0; i != n; ++i)
			{
				sum += (rand.nextInt(4) + 1);
			}
		}
		return sum;
	}

	public int d6()
	{
		return (rand.nextInt(6) + 1);
	}

	public int d6(int n)
	{
		sum = 0;
		if(n > 0)
		{
			for(int i = 0; i != n; ++i)
			{
				sum += (rand.nextInt(6) + 1);
			}
		}
		return sum;
	}

	public int d8()
	{
		return (rand.nextInt(8) + 1);
	}

	public int d8(int n)
	{
		sum = 0;
		if(n > 0)
		{
			for(int i = 0; i != n; ++i)
			{
				sum += (rand.nextInt(8) + 1);
			}
		}
		return sum;
	}

	public int d10()
	{
		return (rand.nextInt(10) + 1);
	}

	public int d10(int n)
	{
		sum = 0;
		if(n > 0)
		{
			for(int i = 0; i != n; ++i)
			{
				sum += (rand.nextInt(10) + 1);
			}
		}
		return sum;
	}

	public int d12()
	{
		return (rand.nextInt(12) + 1);
	}

	public int d12(int n)
	{
		sum = 0;
		if(n > 0)
		{
			for(int i = 0; i != n; ++i)
			{
				sum += (rand.nextInt(12) + 1);
			}
		}
		return sum;
	}

	public int d20()
	{
		return (rand.nextInt(20) + 1);
	}

	public int d20(int n)
	{
		sum = 0;
		if(n > 0)
		{
			for(int i = 0; i != n; ++i)
			{
				sum += (rand.nextInt(20) + 1);
			}
		}
		return sum;
	}

	public int d100()
	{
		return (rand.nextInt(100) + 1);
	}

	public int d100(int n)
	{
		sum = 0;
		if(n > 0)
		{
			for(int i = 0; i != n; ++i)
			{
				sum += (rand.nextInt(100) + 1);
			}
		}
		return sum;
	}

	public int dX(int x)
	{
		return (rand.nextInt(x) + 1);
	}

	public int dX(int x, int n)
	{
		sum = 0;
		if(n > 0)
		{
			for(int i = 0; i != n; ++i)
			{
				sum += (rand.nextInt(x) + 1);
			}
		}
		return sum;
	}	

	public int getStat()
	{
		sum = 0;
		int roll;
		int min = 6;

		for(int i = 0; i != 4; ++i)
		{
			roll = d6();
			if(roll < min)
			{
				min = roll;
			}
			sum += roll;
		}
		sum -= min;
		return sum;
	}
}