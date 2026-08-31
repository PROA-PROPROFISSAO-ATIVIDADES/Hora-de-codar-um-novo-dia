package Utils

fun askToContinue(): Boolean {
    println("Digite PARE para encerrar ou qualquer coisa para continuar: ")
    return readln().uppercase() != "PARE"
}