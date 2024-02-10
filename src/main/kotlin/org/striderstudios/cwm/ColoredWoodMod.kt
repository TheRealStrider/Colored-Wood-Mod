package org.striderstudios.cwm

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object ColoredWoodMod : ModInitializer {
	const val MOD_ID = "cwm"
	private val logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
	}
}