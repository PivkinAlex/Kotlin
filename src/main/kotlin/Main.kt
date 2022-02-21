fun main() {
    var MaxValue = 5
    var ArrayName = arrayOfNulls<String>(MaxValue)
    var ArrayAge = arrayOfNulls<Int>(MaxValue)
    var i = 0

    while (i < ArrayAge.size) {
        println("${i+1} :")
        print("Enter age: ")
        val age = readLine()!!.toInt()
        print("Enter last name and first name: ")
        val name = readLine ()
        if (age < 14){
            println("call the police: $name")}
        else if ((age >= 14)&&(age < 18)){
            println("do not let: $name")}
        else{
            ArrayAge[i] = age
            ArrayName[i] = name
            i++}
    }
    ArrayAge.forEachIndexed { index, i ->
        println("${ArrayName[index]} name and surname ${ArrayAge[index]} age")}


}