package fileSystem

abstract class AbstractFileSystemNode(
        private var name: String,
        private var root: FileSystemNode?
) : FileSystemNode {
    final override fun getRoot(): FileSystemNode = root!!
    final override fun setRoot(root: FileSystemNode) { this.root = root }
    override fun getName(): String = name
    final override fun getPath(): String {
        if(root == null)
            return getName()
        return "${root?.getPath()}/${getName()}"
    }

}