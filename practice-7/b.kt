import java.util.Scanner
fun main(){
    val read = Scanner(System.`in`)
    var t=read.nextLong()
    while(t>0){
        var a:Long = read.nextLong()
        var b:Long = read.nextLong()
        var k:Long = read.nextLong()
        var ans:Long = 0
        if((k%2)==1L){
            ans=ans+a*((k+1)/2)
            ans=ans-b*((k-1)/2)
        }
        else{
            ans=ans+a*(k/2)
            ans=ans-b*(k/2)
        }
        println(ans)
        t=t-1
    }
}