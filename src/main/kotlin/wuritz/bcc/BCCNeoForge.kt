/*
 * Copyright (c) 2026. wuritz
 * SPDX-License-Identifier: Apache-2.0
 */

package wuritz.bcc

import net.neoforged.fml.common.Mod
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS
import wuritz.bcc.network.IncomingConnectionNF
import wuritz.bcc.utils.Constants

// Kotlin for Forge 5.x (1.21.1): la clase @Mod es un `object` y el bus del mod se obtiene con MOD_BUS
@Mod(Constants.MOD_ID)
object BCCNeoForge {

    init {
        BCCCommon.init()
        Constants.LOG.info("Initializing on server-side...")

        MOD_BUS.register(IncomingConnectionNF)

        Constants.LOG.info("Server-side initialized!")
    }

}
