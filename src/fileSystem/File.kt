package fileSystem

class File(
        name: String,
        root:FileSystemNode?,
        private var extension: String
) : AbstractFileSystemNode(name, root) {
    fun getExtension() : String = extension
    override fun getName(): String = "${super.getName()}.${getExtension()}"
}