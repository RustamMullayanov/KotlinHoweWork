package fileSystem

class Folder(
        name: String,
        root: FileSystemNode?,
        private vararg var childElements: FileSystemNode?
) : AbstractFileSystemNode(name, root) {
    init {
        for(child in childElements)
            child?.setRoot(this)
    }

    fun getChildElements(): Array<out FileSystemNode?> = childElements
}