/* RaceList class
 * Brian Eckenrode
 * February 2018
 */

import java.util.ArrayList;

class RaceObject
{
	private int id;
	private String name;
	private int speed;
	private int[] modifiers;
	private int[] languages;
	private boolean subraces;

	public RaceObject(int idIn, String nameIn, int speedIn, 
		int[] modsIn, int[] langIn, boolean subIn)
	{
		id = idIn;
		name = nameIn;
		speed = speedIn;
		modifiers = modsIn;
		languages = langIn;
		subraces = subIn;
	}

	public int getID()
	{
		return id;
	}

	public String getRace()
	{
		return name;
	}

	public int getSpeed()
	{
		return speed;
	}

	public int[] getMods()
	{
		return modifiers;
	}

	public int[] getLanguages()
	{
		return languages;
	}

	public boolean getSubraces()
	{
		return subraces;
	}
}

class Race
{
	ArrayList<RaceObject> list = new ArrayList<RaceObject>();

	public Race()
	{
		list.add(new RaceObject(0, "Aarakocra", 25,
			new int[]{0, 2, 0, 0, 1, 0}, new int[]{5, 0, 3}, false));
		list.add(new RaceObject(1, "Aasimar", 30, 
			new int[]{0, 0, 0, 0, 1, 2}, new int[]{5, 4}, true));
		list.add(new RaceObject(2, "Bugbear", 30,
			new int[]{2, 1, 0, 0, 0, 0}, new int[]{5, 13}, false));
		list.add(new RaceObject(3, "Dragonborn", 30, 
			new int[]{2, 0, 0, 0, 0, 1}, new int[]{5, 7}, true));
		list.add(new RaceObject(4, "Dwarf", 25,
			new int[]{0, 0, 2, 0, 0, 0}, new int[]{5, 9}, true));
		list.add(new RaceObject(5, "Elf", 30,
			new int[]{0, 2, 0, 0, 0, 0}, new int[]{5, 10}, true));
		list.add(new RaceObject(6, "Firbolg", 30,
			new int[]{1, 0, 0, 0, 2, 0}, new int[]{5, 10, 11}, false));
		list.add(new RaceObject(7, "Genasi", 30,
			new int[]{0, 0, 2, 0, 0, 0}, new int[]{5, 19}, true));
		list.add(new RaceObject(8, "Gnome", 25, 
			new int[]{0, 0, 0, 2, 0, 0}, new int[]{5, 12}, true));
		list.add(new RaceObject(9, "Goblin", 30,
			new int[]{0, 2, 1, 0, 0, 0}, new int[]{5, 13}, false));
		list.add(new RaceObject(10, "Goliath", 30,
			new int[]{2, 0, 1, 0, 0, 0}, new int[]{5, 11}, false));
		list.add(new RaceObject(11, "Half-Elf", 30,
			new int[]{0, 0, 0, 0, 0, 2}, new int[]{5, 10}, false));
		list.add(new RaceObject(12, "Halfling", 25,
			new int[]{0, 2, 0, 0, 0, 0}, new int[]{5, 15}, true));
		list.add(new RaceObject(13, "Half-Orc", 30,
			new int[]{2, 0, 1, 0, 0, 0}, new int[]{5, 18}, false));
		list.add(new RaceObject(14, "Hobgoblin", 30, 
			new int[]{0, 0, 2, 1, 0, 0}, new int[]{5, 13}, false));
		list.add(new RaceObject(15, "Human", 30, 
			new int[]{1, 1, 1, 1, 1, 1}, new int[]{5}, false));
		list.add(new RaceObject(16, "Kenku", 30, 
			new int[]{0, 2, 0, 0, 1, 0}, new int[]{5, 3}, false));
		list.add(new RaceObject(17, "Kobold", 30, 
			new int[]{-2, 2, 0, 0, 0, 0}, new int[]{5, 7}, false));
		list.add(new RaceObject(18, "Lizardfolk", 30, 
			new int[]{0, 0, 2, 0, 1, 0}, new int[]{5, 7}, false));
		list.add(new RaceObject(19, "Orc", 30, 
			new int[]{2, 0, 1, 0, 0, 0}, new int[]{5, 18}, false));
		list.add(new RaceObject(20, "Tabaxi", 30, 
			new int[]{0, 2, 0, 0, 0, 1}, new int[]{5}, false));
		list.add(new RaceObject(21, "Tiefling", 30,
			new int[]{0, 0, 0, 1, 0, 2}, new int[]{5, 17}, true));
		list.add(new RaceObject(22, "Tortle", 30, 
			new int[]{2, 0, 0, 0, 1, 0}, new int[]{5, 2}, true));
		list.add(new RaceObject(23, "Triton", 30,
			new int[]{1, 0, 1, 0, 0, 1}, new int[]{5, 19}, true));
		list.add(new RaceObject(24, "Yuan-Ti Pureblood", 30, 
			new int[]{0, 0, 0, 1, 0, 2}, new int[]{5, 1, 7}, false));
	}

	public int size()
	{
		return list.size();
	}

	public RaceObject get(int i)
	{
		return list.get(i);
	}
}