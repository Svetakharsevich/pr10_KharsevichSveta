class dataInterface:Table {
    override val size=0
    override val  invoice=""
    override fun Printl() { println("Введите размер")
        size==readln().toInt()
        println("Введите фактуру мебели")
        invoice==readln().toString()
    }
    override fun MaxSize(){
        when{
            (size>200)->println("Такого размера нет")
            (size<=200)->println("Размер соответствует")
        }

    }

}