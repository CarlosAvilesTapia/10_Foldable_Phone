package com.example.a10foldablephone

// Escribe una clase FoldablePhone que se herede de la clase Phone.
class FoldablePhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {

    // Una propiedad que indique si el teléfono está plegado.
    var isFolded: Boolean = false

    // Un comportamiento de función switchOn() diferente del de la clase Phone para que
    // solo encienda la pantalla cuando el teléfono no esté plegado.
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    // Métodos para cambiar el estado de plegado.
    fun isClosed() {
        isFolded = true
    }

    fun isOpen() {
        isFolded = false
    }
}
