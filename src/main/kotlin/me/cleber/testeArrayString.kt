package me.cleber

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Carlos"

    for(nome in nomes){
        println(nome)
    }

    println("-----------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-----------------------")
    val nomes2 = arrayOf("Claus", "Zazá", "Lindo")
    nomes2.sort()
    nomes2.forEach { println(it) }

}