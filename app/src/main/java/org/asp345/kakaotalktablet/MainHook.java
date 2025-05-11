/*
 * WearableSpoof
 * Copyright (C) 2023 Simon1511
 * CaimanSpoof
 * Copyright (C) 2024 RisenID
 * GalaxyTabSpoof
 * Copyright (C) 2025 asp345
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.asp345.kakaotalktablet;

import android.os.Build;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {

        // ro.product.manufacturer
        XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", "samsung");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "MODEL", "SM-X616B");

        // ro.product.brand
        XposedHelpers.setStaticObjectField(Build.class, "BRAND", "samsung");

        // ro.product.device
        XposedHelpers.setStaticObjectField(Build.class, "DEVICE", "essi");

        // ro.build.id
        XposedHelpers.setStaticObjectField(Build.class, "ID", "UP1A.231005.007");

        // ro.build.fingerprint
        XposedHelpers.setStaticObjectField(Build.class, "FINGERPRINT",
                "samsung/gts9fepxx/essi:14/UP1A.231005.007/X616BXXS7BYB6:user/release-keys");
    }
}