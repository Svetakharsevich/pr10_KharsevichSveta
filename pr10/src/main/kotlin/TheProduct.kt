open class TheProducts(var name:String, var price:Int, var quantity:Int ):WareHouseFurniture() {
    override val nomer=324432
    override val Lining=true
    override val size=100
    override val invoice="Дуб"
    fun Formula(){
        var Q=price/quantity
        println("Качество объекта = ${Q}")
        when{
            (Q<=0)-> println("Плохое качество")
            (Q>0)-> println("Среднее качество")
            (Q>=50)-> println("Выскокое качество")
        }
            println("Название - ${name}")
            println("Цена - ${price}")
            println("Количество - ${quantity}")
        }
}