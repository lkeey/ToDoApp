package components.page

import components.counter.Counter
import components.editor.Editor
import components.itemList.ItemList

interface Page {

    val counter: Counter
    val editor: Editor
    val itemList: ItemList

}