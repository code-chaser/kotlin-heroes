
import java.util.Scanner
fun main(){
    val read = Scanner(System.`in`)
    var t=read.nextLong()
    while(t>0){
        var n:Int = read.nextInt()
        var k:Int = read.nextInt()
        var s:String = ""
        var cnt:Int = n/k
        for(i in 1..cnt){
            for(j in 1..k){
                var m:Char = 'a'-1+j
                s+=m
            }
        }
        cnt=n%k
        for(i in 1..cnt){
        	var m:Char = 'a'-1+i
        	s+=m
        }
        println(s)
        t=t-1
    }
}