import java.util.Scanner

fun main() {

    var resultado: Float = 0.0F
    var operacaoSucesso: Boolean = false
    var valor1: Float = 0.0F
    var valor2: Float = 0.0F

    println("CALCULADORA")
    val scan = Scanner(System.`in`)

    print("Primeiro valor da operação: ")
    valor1 = scan.nextFloat()

    println("Seleciona a operação: (Adição: +) (Subtração: -) (Multiplicação: *) (Divisão: /) (Resto: %) ")

    print("Digite a operação: ")
    val operacao = scan.next()

    operacaoSucesso = operacao == "+" || operacao == "-" || operacao == "*" || operacao == "/" || operacao == "%"

    if(operacaoSucesso){
        print("Segundo valor da operação: ")
        valor2 = scan.nextFloat()

        when (operacao) {
            "+" -> {
                resultado = soma(valor1 = valor1, valor2 = valor2)
                operacaoSucesso = true
            }
            "-" -> {
                resultado = subtracao(valor1 = valor1, valor2 = valor2)
                operacaoSucesso = true
            }
            "*" -> {
                resultado = multiplicacao(valor1 = valor1, valor2 = valor2)
                operacaoSucesso = true
            }
            "/" -> {
                resultado = divisao(valor1 = valor1, valor2 = valor2)
                operacaoSucesso = true
            }
            "%" -> {
                resultado = resto(valor1 = valor1, valor2 = valor2)
                operacaoSucesso = true
            }
        }
    }

    if(operacaoSucesso) {
        println("O resultado de ${valor1} ${operacao} ${valor2} = ${resultado}")
    } else {
        println(erroOperacao(operacao = operacao))
    }
}

fun soma(valor1: Float, valor2: Float): Float {
    return valor1 + valor2
}

fun subtracao(valor1: Float, valor2: Float): Float {
    return valor1 - valor2
}

fun multiplicacao(valor1: Float, valor2: Float): Float {
    return valor1 * valor2
}

fun divisao(valor1: Float, valor2: Float): Float {
    return valor1 / valor2
}

fun resto(valor1: Float, valor2: Float): Float {
    return valor1 % valor2
}

fun erroOperacao(operacao: String): String {
    return "Operação digitada (${operacao}) é invalida!"
}