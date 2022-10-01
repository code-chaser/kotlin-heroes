
import java.util.Scanner
fun main(){
    val read=Scanner(System.`in`)
    var t=read.nextInt()
    while(t>0){
        var a:Int = read.nextInt()
        var b:Int = read.nextInt()
        println(a + b)
        t=t-1
    }
}