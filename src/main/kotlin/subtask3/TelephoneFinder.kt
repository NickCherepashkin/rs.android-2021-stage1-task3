package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        return finder(number)
    }

    private fun finder(number: String) :Array<String>? {
        val resultList: MutableList<String> = mutableListOf()

        val nearbyNumbers = mapOf(
            '0' to arrayOf("8"),
            '1' to arrayOf("2","4"),
            '2' to arrayOf("1","3","5"),
            '3' to arrayOf("2","6"),
            '4' to arrayOf("1","5","7"),
            '5' to arrayOf("2","4","6","8"),
            '6' to arrayOf("3","5","9"),
            '7' to arrayOf("4","8"),
            '8' to arrayOf("5","7","0","9"),
            '9' to arrayOf("6","8")
        )

        for(numeric in number.indices) {
            val listOfNumbers = nearbyNumbers[number[numeric]]
            if (listOfNumbers != null) {
                for (digit in listOfNumbers){
                    resultList.add(number.substring(0,numeric) + digit + number.substring(numeric + 1))
                }
            } else {
                return null
            }
        }
        return resultList.toTypedArray()
    }

}
