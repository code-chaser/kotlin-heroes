import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    sc.nextLine()
    val s = sc.nextLine()
    val m = mutableMapOf<String,Int>()
    for(i in 0 until (n-1)) {
        var a = s[i].toString() + s[i+1].toString()
        m.put(a,m.getOrDefault(a,0)+1)
    }
    var ans = ""
    var maxi = 0
    for(i in m) {
        if(i.component2() > maxi) {
            maxi = i.component2()
            ans = i.component1()
        }
    }
    println(ans)
    sc.close()
}