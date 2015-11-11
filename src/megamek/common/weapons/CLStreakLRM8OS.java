/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons;

import megamek.common.TechConstants;

/**
 * @author Sebastian Brocks
 */
public class CLStreakLRM8OS extends StreakLRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 5240577239366457930L;

    /**
     *
     */
    public CLStreakLRM8OS() {
        super();
        techLevel.put(3071, TechConstants.T_CLAN_EXPERIMENTAL);
        name = "Streak LRM 8 (OS)";
        setInternalName("CLStreakLRM8OS");
        addLookupName("Clan Streak LRM-8 (OS)");
        addLookupName("Clan Streak LRM 8 (OS)");
        heat = 0;
        rackSize = 8;
        shortRange = 7;
        mediumRange = 14;
        longRange = 21;
        extremeRange = 28;
        tonnage = 3.7f;
        criticals = 1;
        bv = 137;
        cost = 120000;
        techRating = RATING_F;
        availRating = new int[] { RATING_X, RATING_X, RATING_F };
        introDate = 3065;
        techLevel.put(3065, techLevel.get(3071));
        techLevel.put(3079, TechConstants.T_CLAN_TW);
    }
}
