fun isValidIPv4(s: String): Boolean {
    val sList = s.split(".")
    if (sList.size != 4) return false
    for(string in sList) {
        if(string.isEmpty()) return false
        if(string[0] == '0' && string.length > 1) return false
        var tempNum = 0
        for(char in string) {
            if(!(char.isDigit())) return false
            tempNum = tempNum*10 + char.digitToInt()
        }
        if(!(tempNum in 0..255)) return false
    }
    return true
}
fun check(name: String , result : Boolean , correctresult:Boolean){
    if (result == correctresult){
        println("sucess $name")
    }else{
        println("failed $name")
    }
}
fun main() {
    check(name = "when part size is more than 4"
        ,result = isValidIPv4("12.12.12.12.12"),
        correctresult = false)
    check(name = "when there is zero in the left"
        ,result = isValidIPv4("12.01.12.12"),
        correctresult = false)
    check(name = "when there is number more than 255"
        ,result = isValidIPv4("12.12.12.455"),
        correctresult = false)
    check(name = "when part size is less than 4"
        ,result = isValidIPv4("12.12.12"),
        correctresult = false)
    check(name = "when there are 4 parts with three dots only"
        ,result = isValidIPv4("12.12.12.12"),
        correctresult = true)
    check(name = "when the address is empty"
        ,result = isValidIPv4(""),
        correctresult = false)
}