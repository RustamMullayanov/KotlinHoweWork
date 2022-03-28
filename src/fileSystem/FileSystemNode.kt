package fileSystem

interface FileSystemNode {
    fun getRoot(): FileSystemNode
    fun setRoot(root: FileSystemNode)
    fun getName(): String
    fun getPath(): String
}