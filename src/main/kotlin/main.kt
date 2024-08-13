fun main() {
    println("Введите сумму перевода (в руб.) :")
    val amount = readln().toInt()
    var transferFee: Double = amount * 0.75 / 100
    if (transferFee < 35) {
        transferFee = 35.0
    }
    val totalPrice = amount + transferFee

    println("Сумма перевода (в руб.) : $amount")
    println("Комиссия за перевод составит (в руб.): $transferFee")
    println("Итого сумма к оплате (в руб.) : $totalPrice")
}