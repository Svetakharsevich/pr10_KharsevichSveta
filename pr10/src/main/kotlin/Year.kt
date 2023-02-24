class Year(var years:Int, name: String, price: Int, quantity: Int):TheProducts(name, price, quantity){
    fun NewFormula() {
        println("Введите год выпуска товара")
        years = readln().toInt()
        println("Введите текущий год")
        var year= readln().toInt()

        when {
            (year == 2023) -> {
                println("Качество объекта для текущего года =${(price / quantity) + 0.5 * (2023 - years)}")
            }
            else-> println("Текущий год не совпадает")
        }
    }

}