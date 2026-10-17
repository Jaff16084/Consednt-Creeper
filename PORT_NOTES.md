# Port no oficial de Better Creeper Consent a Minecraft 1.21.1 (NeoForge)

Mod original: Better Creeper Consent 1.5.0 por wuritz (Apache-2.0)
https://github.com/wuritz/better-creeper-consent

## Cambios hechos para 1.21.1
- Proyecto multiloader (common/fabric/neoforge) unificado en un solo módulo NeoForge.
- Java 25 -> Java 21. Kotlin for Forge 6 ("klf") -> Kotlin for Forge 5.x ("kotlinforforge").
- `Identifier` -> `ResourceLocation`.
- `GuiGraphicsExtractor` / `extractRenderState` -> `GuiGraphics` / `render`.
- Matrices 2D (`pushMatrix/popMatrix`) -> `PoseStack` (`pushPose/popPose`); `graphics.text` -> `graphics.drawString`.
- Fondo de las pantallas movido a `renderBackground` (en 1.21.1 vanilla pinta blur encima).
- `gui.canInterruptScreen()` / `gui.setScreen()` -> chequeo manual de la pantalla actual / `Minecraft.setScreen()`.
- `ClientPacketDistributor.sendToServer` -> `PacketDistributor.sendToServer`.
- `ServerPlayer.level()` (ServerLevel) -> `serverLevel()`.
- Quitado `Biomes.SULFUR_CAVES` (no existe en 1.21.1).
- Clase `@Mod` convertida a `object` con `MOD_BUS`.
- Quitado `ScalableMultiLineTextWidget` (no se usaba).
- Se omitió la versión Fabric.
