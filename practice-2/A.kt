import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var n = sc.nextLong()
    var k = sc.nextInt()
    while(k-- > 0) {
        if(n%10==0L)
            n/=10
        else
            n--
    }
    println(n)
    sc.close()
}