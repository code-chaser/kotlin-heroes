
import java.util.*
fun main(){
    val read = Scanner(System.`in`)
    //var t=read.nextLong()
    var t=1
    while(t>0){
        var n:Int = read.nextInt()
        var v = Vector<Int>()
        var sum:Long = 0L
        var greatest:Int = 0
        var gind:Int = 0
        var sg:Int = 0
        var sgind:Int = 0
        var ans = Vector<Int>()
        for(i in 0..n-1){
            var ins:Int = read.nextInt()
            v.add(ins)
            if(ins>=greatest){
                greatest=ins
                gind=i
            }
            sum=sum+(ins.toLong())
        }
        for(i in 0..n-1){
            if(i!=gind){
                if(v[i]>sg){
                    sg=v[i]
                    sgind=i
                }
            }
        }
        sum=sum-(greatest.toLong());
        if((sum-(sg.toLong()))==(sg.toLong())){
            ans.add(gind)
        }
        for(i in 0..n-1){
            if(i!=gind){
                if((sum-(v[i].toLong()))==(greatest.toLong())){
                    ans.add(i)
                }
            }
        }
        println(ans.size)
        for(i in ans){
            print(i+1)
            print(" ")
        }
        t=t-1
    }
}