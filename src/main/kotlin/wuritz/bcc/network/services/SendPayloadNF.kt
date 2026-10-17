/*
 * Copyright (c) 2026. wuritz
 * SPDX-License-Identifier: Apache-2.0
 */

package wuritz.bcc.network.services

import net.minecraft.network.protocol.common.custom.CustomPacketPayload
import net.neoforged.neoforge.network.PacketDistributor
import wuritz.bcc.platform.interfaces.SendPayload

class SendPayloadNF : SendPayload {

    override fun sendPayload(payload: CustomPacketPayload) {
        PacketDistributor.sendToServer(payload)
    }

}