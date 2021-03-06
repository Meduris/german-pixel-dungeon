/*
 * Pixel Dungeon
 * Copyright (C) 2012-2014  Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.sarius.germanpixeldungeon.items;

import com.sarius.germanpixeldungeon.sprites.ItemSpriteSheet;

public class Ankh extends Item {

	{
		stackable = true;
		name = "Ankh";
		image = ItemSpriteSheet.ANKH;
	}
	
	@Override
	public boolean isUpgradable() {
		return false;
	}
	
	@Override
	public boolean isIdentified() {
		return true;
	}
	
	@Override
	public String info() {
		return 
			"Das antike Symbol der Unsterblichkeit garantiert die Faehigkeit nach dem Tod wieder Aufzuerstehen. " +
			"Bei der Auferstehung gehen alle nicht ausgeruesteten Gegenstaende verloren.";
	}
	
	@Override
	public int price() {
		return 50 * quantity;
	}
}
