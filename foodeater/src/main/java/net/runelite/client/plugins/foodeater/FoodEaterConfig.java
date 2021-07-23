package net.runelite.client.plugins.foodeater;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("foodeater")
public interface FoodEaterConfig extends Config
{

	@ConfigItem(
		keyName = "foodToEat1",
		name = "Food 1",
		description = "the exact name of the food to eat (not case sensitive)",
		position = 1
	)
	default String foodToEat1()
	{
		return "lobster";
	}
	@ConfigItem(
		keyName = "foodToEat2",
		name = "Food 2",
		description = "the exact name of the food to eat (not case sensitive)",
		position = 2
	)
	default String foodToEat2()
	{
		return "Cooked karambwan"
	}
	@ConfigItem(
		keyName = "minimumHealth",
		name = "Minimum Health",
		description = "The minimum health to eat at",
		position = 3
	)
	default int minimumHealth()
	{
		return 20;
	}
}
