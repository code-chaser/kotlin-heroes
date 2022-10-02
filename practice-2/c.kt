import java.util.*
fun main(){
    val read = Scanner(System.`in`)
        var n:Int = read.nextInt()
        var k:Int =read.nextInt()
        
        var ar=Vector<Int>()
        for(i in 1..n){
            var ins:Int = read.nextInt()
            ar.add(ins)
        }
        ar.sort()
        if(ar[k-1]==ar[k])
          print("-1")
        else
          print(ar[k-1])
        
}
