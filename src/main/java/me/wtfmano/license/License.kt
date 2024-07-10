package me.wtfmano.license

import me.austin.rush.FastEventBus
import me.wtfmano.license.system.module.ModuleManager
import java.util.concurrent.ThreadLocalRandom

open class License {
    companion object {
        @JvmStatic
        val eventbus = FastEventBus()

        @JvmStatic
        val moduleManager = ModuleManager()

        @JvmStatic
        val clientName = "License"

        @JvmStatic
        val clientVersion = "B1"

        val list = arrayOf(
            "Africa tem mais ebola q o mundo todo com covid",
            "Meu penis tem 32 cm!",
            "Thais Carla falou que ia fazer dieta, por isso não tem mais mato na amazonia",
            "Pov: você tá morrendo de fome e vive no Brasil. faz o L",
            "Descanse em paz, CP Siqueira",
            "O bom de criança com hidrocefalia, é q tem caixa d'agua com água de graça"
        )

        @JvmStatic
        fun init() {
            moduleManager.loadModules()
        }

        @JvmStatic
        fun comentarioDesnecessario(): String {
            return list[ThreadLocalRandom.current().nextInt(list.size, 0)]
        }
    }
}