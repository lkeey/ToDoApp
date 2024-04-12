package components.counter

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.decompose.value.update

class CounterComponent : Counter {
    private val _models = MutableValue(Counter.Model())
    override val models : Value<Counter.Model> = _models

    override fun onIncrementedClicked() {
        _models.update {
            it.copy(
                count = it.count + 1
            )
        }
    }

    override fun onDecrementedClicked() {
        _models.update {
            it.copy(
                count = it.count + 1
            )
        }
    }
}