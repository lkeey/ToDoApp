package components.counter

import com.arkivanov.decompose.value.Value

interface Counter {
    val models: Value<Model>

    fun onIncrementedClicked()
    fun onDecrementedClicked()

    data class Model(
        val count : Int = 0
    )

}