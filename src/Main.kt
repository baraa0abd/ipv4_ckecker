fun isValidIPv4(ip: String): Boolean {
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