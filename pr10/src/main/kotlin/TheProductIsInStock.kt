abstract class WareHouseFurniture:Table {
    abstract val nomer:Int
    abstract val Lining:Boolean
    override fun Printl() {
        println("Фактура мебели = ${invoice}, Размер = ${size}")
    }
    override fun MaxSize() {
        when{
            (size>=140&&size<160)-> println("Стол")
            (size<150)-> println("Прикроватный столик")
            (size<10)-> println("Такой мебели нет на складе")
            else -> println("Нет такой мебели")
        }
    }

}