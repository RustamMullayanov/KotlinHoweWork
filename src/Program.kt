import fileSystem.File
import fileSystem.FileSystemNode
import fileSystem.Folder

fun main(){
    val opera = File("opera", null, "exe")
    val childFolders : Array<FileSystemNode> = arrayOf(
        Folder("Chrome", File("chrome", null, "exe")),
        Folder(
                "Opera",
                opera,
        ),
        File("tools", null, "txt"),
        Folder("FireFox", File("fireFox", null,"exe"))
    )
    val root : Folder = Folder("browsers", null, *childFolders)
    println(childFolders[2].getPath())
    println(opera.getExtension())
    println(opera.getPath())
}

