fun main(args: Array<String>) {
    // No 1
    println("Task No.1")
    reverseString("NEGIE1")

    // No 2
    println()
    println("---------------------------------------------------------------")
    println("Task No.2")
    findLongestWord("Saya sangat senang mengerjakan soal algoritma")

    // No 3
    println("---------------------------------------------------------------")
    println("Task No.3")
    countWordAppear()

    //No 4
    println("---------------------------------------------------------------")
    println("Task No.4")
    val matrix = arrayOf(
        arrayOf(1, 2, 0),
        arrayOf(4, 5, 6),
        arrayOf(7,8,9))
    sumOfDiagonalMatrix(matrix,3)
}

fun reverseString(word:String){
    val theNumber=word.takeLast(1)
    val wordWithoutNumber = word.substringBefore(theNumber)
    print(wordWithoutNumber.reversed()+theNumber)
}

fun findLongestWord(sentence:String){
    val words = sentence.split("\\s+".toRegex()).map { word ->
        word.replace("""^[,\.]|[,\.]$""".toRegex(), "")
    }
    var longestWordTemp = words[0]
    words.forEach {
        if(longestWordTemp.length < it.length){
            longestWordTemp = it
        }
    }
    println(longestWordTemp)
}

fun countWordAppear(){
    val input = arrayOf("xc","dz", "bbb", "dz")
    val query = arrayOf("bbb", "ac", "dz")

    val output = arrayListOf<Int>()

    query.forEach {q ->
        var counter = 0
        input.forEach { i ->
            if(q == i){
                counter++
            }
        }
        output.add(counter)
    }
    println(output)
}

fun sumOfDiagonalMatrix(matrix: Array<Array<Int>>, size:Int){
    var firstDiagonal = 0
    var secondDiagonal = 0
    for (firstInitialCounter in 0 until size) {
        for (secondInitialCounter in 0 until size) {
            // Checking & sum for first diagonal
            if (firstInitialCounter == secondInitialCounter) firstDiagonal += matrix[firstInitialCounter][secondInitialCounter]
            // Checking & sum for second diagonal
            if ((firstInitialCounter + secondInitialCounter) == (size - 1)) secondDiagonal += matrix[firstInitialCounter][secondInitialCounter]
        }
    }

    println(
        "Sum of First Diagonal:"
                + firstDiagonal
    )

    println(
        ("Sum Of Second Diagonal:"
                + secondDiagonal)
    )

    println(
        ("Subtraction result:"
                + (firstDiagonal - secondDiagonal))
    )
}