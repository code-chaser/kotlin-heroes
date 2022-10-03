import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = LongArray(n)
    for(i in 0 until n) {
        arr[i] = sc.nextLong()
    }
    val ans = arr.sortedWith { a, b ->
        var n1 = a
        var n2 = b
        var two1 = 0
        var three1 = 0
        while(n1%2==0L || n1%3==0L){
            if(n1%3==0L) {
                n1 /= 3
                three1++
            }
            if(n1%2==0L) {
                n1 /= 2
                two1++;
            }
        }
        var two2 = 0
        var three2 = 0
        while(n2%2==0L || n2%3==0L){
            if(n2%3==0L) {
                n2 /= 3
                three2++
            }
            if(n2%2==0L) {
                n2 /= 2
                two2++;
            }
        }
        when {
            two1 == two2 -> three2 - three1
            else -> two1 - two2
        }
    }
    for(a in ans) {
        print(a.toString()+" ")
    }
    println()
    sc.close()
}