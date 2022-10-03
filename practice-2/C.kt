import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val arr = LongArray(n)
    for(i in 0 until n) {
        arr[i] = sc.nextLong()
    }
    arr.sort()
    if(k<n && arr[k]==arr[k-1]) println(-1)
    else println(arr[k-1])
    sc.close()
}