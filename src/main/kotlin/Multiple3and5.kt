object Multiple3and5 {

    fun findMultiplesSum(number:Int) : Int {
        var sum : Int = 0;
        repeat(number) {
            if ( ((it % 3) == 0) || ((it % 5) == 0) ) {
                print("$it, ")
                sum += it
            }
        }
        return sum
    }

}