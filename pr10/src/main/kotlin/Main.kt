
fun main() = try {
  var chair=Tables("Стул")
 chair.Printl()
 chair.MaxSize()
 var chairs=Year(2005,"Стул",1300, 23)
 chairs.NewFormula()
 var chai=TheProducts("Стул", 1300, 23 )
 chai.Formula()
 chai.Printl()
 chai.MaxSize()

}
catch (e: Exception){
    println("Ошибка. Введите корректные данные")
}
