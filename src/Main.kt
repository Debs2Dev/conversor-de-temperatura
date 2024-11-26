//Conversor de temperatura, celsius para fahrenheit ou kelvin
fun main() {
    var continuar = true
    while (continuar) {
        // Exibir o menu de opções
        println("Escolha uma opção abaixo:")
        println("1. Converter de Celsius para Fahrenheit")
        println("2. Converter de Celsius para Kelvin")
        println("3. Sair")

        // Ler a opção escolhida pelo usuário
        print("Digite o número da opção: ")
        var opcao = readLine()?.toIntOrNull() ?: 0 // Caso o usuário digite algo que não seja número, a opção será 0 (zero)

        when (opcao) {
            1 -> {
                // Converte de Celsius para Fahrenheit
                print("Digite a temperatura em Celsius: ")
                var celsius = readLine()?.toDoubleOrNull()
                if (celsius != null) {
                    val fahrenheit = (celsius * 9/5) + 32
                    println("$celsius°C é igual a $fahrenheit°F")
                } else {
                    println("Entrada inválida!")
                }
            }
            2 -> {
                // Converter de Celsius para Kelvin
                print("Digite a temperatura em Celsius: ")
                var celsius = readLine()?.toDoubleOrNull()
                if (celsius != null) {
                    var kelvin = celsius + 273.15
                    println("$celsius°C é igual a $kelvin K")
                } else {
                    println("Entrada inválida!")
                }
            }
            3 -> {
                // Mensagem informando que está saindo do programa
                println("Saindo...")
                continuar = false
            }
            else -> {
                // Mensagem de seleção de opção inválida
                println("Opção inválida! Tente novamente.")
            }
        }
    }
}
