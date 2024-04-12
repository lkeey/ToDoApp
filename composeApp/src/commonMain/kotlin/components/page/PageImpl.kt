package components.page

import components.counter.Counter
import components.counter.CounterComponent
import components.editor.Editor
import components.editor.EditorComponent
import components.itemList.ItemList
import components.itemList.ItemListComponent

class PageImpl : Page {
    override val counter: Counter = CounterComponent()
    override val editor: Editor = EditorComponent()
    override val itemList: ItemList = ItemListComponent()
}
