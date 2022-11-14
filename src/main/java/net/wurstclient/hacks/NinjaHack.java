/*
 * Copyright (c) 2014-2022 Wurst-Imperium and contributors.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.hacks;

import net.wurstclient.Category;
import net.wurstclient.SearchTags;
import net.wurstclient.hack.Hack;

@SearchTags({"ninja", "hud", "hide", "logo"})
public final class NinjaHack extends Hack
{

	public NinjaHack()
	{
		super("Ninja");
		setCategory(Category.RENDER);
	}

	@Override
	protected void onEnable()
	{
	}
	
	@Override
	protected void onDisable()
	{
	}
}
