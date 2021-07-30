package subtask2

class SquareDecomposer {
    fun decomposeNumber(number: Int): Array<Int>? {
        return squareDecomposer(number.toLong(), number.toLong() * number.toLong())?.dropLast(1)?.toTypedArray()
    }

    private fun squareDecomposer(number: Long, remainder: Long): MutableList<Int>? {
        if (remainder == 0L) {
            return mutableListOf(number.toInt())
        } else {
            for (item in number - 1 downTo 1) {
                if (remainder - item * item >= 0) {
                    squareDecomposer(item, remainder - item * item)?.apply {
                        add(number.toInt())
                        return this
                    }
                }
            }
        }
        return null
    }
}
