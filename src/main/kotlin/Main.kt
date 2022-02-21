fun main () {

    print ("Enter last name and first name")

    val name = readLine ()
    print ("Enter the age")
    val age = readLine()!!.toInt()

    if (age < 14){
        println("call the police: $name")}
    else if ((age >= 14)&&(age < 18)){
        println("do not let: $name")}
    else{println ("Welcome: $name")}
}