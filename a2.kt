import java.util.*
fun main(){
    val read = Scanner(System.`in`)
        var n:Int = read.nextInt()
        var k:Int =read.nextInt()
        var ans:Int =n
        var count:Int =0
        while(count<k){
           if(ans%10==0){
           ans/=10
           count+=1
           }
           else{
           var c:Int =ans%10
           if(c>k-count)
             c=k-count
           ans-=c
           count+=c
           }
        }
        print(ans)
}
