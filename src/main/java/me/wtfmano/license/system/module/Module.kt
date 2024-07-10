package me.wtfmano.license.system.module

import me.wtfmano.license.License
import me.wtfmano.license.system.module.enums.ModuleCategory

open class Module(val name: String, val category: ModuleCategory, var key: Int = 0) {
    var enabled = false

    fun getName(): String {
        return name
    }

    fun getCategory(): ModuleCategory {
        return category
    }

    fun getKey(): Int {
        return key
    }

    fun isEnabled(): Boolean {
        return enabled
    }

    fun setKey(key: Int) {
        this.key = key
    }

    fun enable() {
        this.enabled = true
        License.eventbus.subscribe(this)
        this.onEnable()
    }

    fun disable() {
        this.enabled = false
        License.eventbus.unsubscribe(this)
        this.onDisable()
    }

    fun toggle() {
        if (!enabled)
            this.enable()
        else
            this.disable()
    }

    fun onEnable() {}

    fun onDisable() {}
}