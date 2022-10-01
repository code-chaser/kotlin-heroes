
import java.util.*
fun main(){
    val read = Scanner(System.`in`)
    var t=1
    while(t>0){
        var n:Int = read.nextInt()
        var skills = Vector<Int>()
        for(i in 1..n){
            var ins:Int = read.nextInt()
            skills.add(ins)
        }
        skills.sort()
        var ans:Int = 0
        var i:Int = 0
        while(i<n){
            ans+=(skills[i+1]-skills[i])
            i=i+2
        }
        println(ans)
        t=t-1
    }
}