fun main(args: Array<String>) {
    var studentIsKenyan = true
    var studentPhoneNumbers = arrayOf(254721453787, 254787655929, 254711111111, 25487990087)
    var studentAges = arrayOf(18, 19, 20, 20)
    var studentWeightInKg = arrayOf(60, 54, 60, 65)

    var kenya = arrayOf("Joy Kenya ", studentAges[0], studentPhoneNumbers[0], studentWeightInKg[0], studentIsKenyan)
    println(kenya.contentToString())
    var rwanda = arrayOf("Joyce Rwanda", studentAges[1], studentPhoneNumbers[1], studentWeightInKg[1], !studentIsKenyan)
    println(rwanda.contentToString())
    var uganda= arrayOf("Maria Uganda", studentAges[2], studentPhoneNumbers[2], studentWeightInKg[2], !studentIsKenyan)
    println(uganda.contentToString())
    var tanzania = arrayOf("Jenifer Tanzania", studentAges[3], studentPhoneNumbers[3], studentWeightInKg[3], !studentIsKenyan)
    println(tanzania.contentToString())
}