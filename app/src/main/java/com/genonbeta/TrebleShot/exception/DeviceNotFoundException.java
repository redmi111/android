/*
 * Copyright (C) 2019 Veli Tasalı
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.genonbeta.TrebleShot.exception;

import com.genonbeta.TrebleShot.object.Device;
import com.genonbeta.android.database.exception.ReconstructionFailedException;

/**
 * created by: Veli
 * date: 6.01.2018 22:26
 */

public class DeviceNotFoundException extends ReconstructionFailedException
{
    public Device device;

    public DeviceNotFoundException(Device device)
    {
        super(device.id + " doesn't point to a device");
        this.device = device;
    }
}
