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
	private boolean addOptionsButton = true;
	private boolean removeOptionsButton = false;

	public NinjaHack()
	{
		super("Ninja");
		setCategory(Category.RENDER);
	}

	public boolean addOptionsButton() {
		boolean t = addOptionsButton;
		addOptionsButton = false;
		return t;
	}

	public boolean removeOptionsButton() {
		boolean t = removeOptionsButton;
		removeOptionsButton = false;
		return t;
	}

	@Override
	protected void onEnable()
	{
		addOptionsButton = false;
		removeOptionsButton = true;
	}
	
	@Override
	protected void onDisable()
	{
		addOptionsButton = true;
		removeOptionsButton = false;
	}
}
