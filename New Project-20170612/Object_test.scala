class Arrays {
  }
object Arrays {
    def main(args: Array[String]){
        val ar_obj = new Arrays
        ar_obj.arrays
         def arrays {
        var ar1 = Array("A", "B", "c")
        var ar2 = Array(1,2,3,4,5,6,7,8,9,10,11,12,25,67,89)
        var max: Int = 0
        var arr_total: Int = 0
        println("//Array Elements of ar1")
        for (i <- 0 to ar1.length - 1){
            println("Arrays:" + ar1(i))
        }
        println("//Totals of Array Elements of ar2")
        for (i <- 0 to ar2.length - 1) {
            arr_total += ar2(i)
//          println("Arrays:" + ar2(i))
//          println("Arrays_total:" + arr_total)
        }
        println("Arrays_total:" + arr_total)
        println("//Maximum number of array ar2")
        for (i <- 0 to ar2.length - 1) {
            if (max < ar2(i)) max = ar2(i)
//            println("Arrays2:" + ar2(i))
        }
            println("Arrays_max:" + max)
    }
    }
}
