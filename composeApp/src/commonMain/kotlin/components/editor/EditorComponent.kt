package components.editor

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.decompose.value.update

class EditorComponent : Editor {

    private val _models = MutableValue(Editor.Model())
    override val models : Value<Editor.Model> = _models

    override fun onTextChanged(text: String) {
        _models.update {
            it.copy(
                text = text
            )
        }
    }
}