package subtask1

class Combinator {
    fun checkChooseFromArray(array: Array<Int>): Int? {
        return calculate(array[0], array[1])
    }

    private fun factorial (number: Int): Long {
        var num: Long = number.toLong()
        if (number > 1)  {
            num *= factorial(number-1)
        }
        return num
    }

    fun calculate (m: Int, n:Int) : Int? {
        var x : Int?
            if (m >= n) {
            for (count in 1..(n-1)) {
                x = (factorial(n) / (factorial(n - count) * factorial(count))).toInt()
                if (x == m) return count
            }
        }

        return null
    }
}
