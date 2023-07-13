package com.example.a10foldablephone

class FoldablePhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {

    var isFolded: Boolean = false

    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun abrir() {
        isFolded = true
    }

    fun cerrar() {
        isFolded = false
    }
}
