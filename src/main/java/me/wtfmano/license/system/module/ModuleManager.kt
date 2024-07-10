package me.wtfmano.license.system.module

import me.wtfmano.license.system.module.enums.ModuleCategory
import java.util.stream.Collectors

open class ModuleManager {
    var modules: ArrayList<Module> = ArrayList()

    fun loadModules() {
        this.modules.addAll(arrayOf(

        ))
    }

    fun getModules(): ArrayList<Module> {
        return modules
    }

    fun getModulesByCategory(category: ModuleCategory): MutableList<Module>? {
        return modules.stream().filter{it.getCategory() == category }.collect(Collectors.toList())
    }
}