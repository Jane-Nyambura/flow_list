fun main() {
println(isEven(8))
    println(isEven(11))
    var item=Item("Geisha",23.00,230.00,"groceries")
  println(itemCategory(item))
    fruit("banana")
    num(arrayListOf("jane","kamau"))


}
fun isEven(num:Int):Boolean{
    return num%2==0
}
data class Item(var name:String,var weight:Double,var price:Double,var category:String)
//data class ItemsLists(
    //var hygieneList: List<Item>,
    //var groceriesList: List<Item>,
  //  var otherList: List<Item>
//)
fun itemCategory(item: Item){
    var groceriesList = mutableListOf<Item>()
    var hygieneList = mutableListOf<Item>()
    var otherList = mutableListOf<Item>()
    when (item.category) {
        "groceries" -> groceriesList.add(item)
        "hygiene" -> hygieneList.add(item)
        else -> otherList.add(item)
    }
//    var itemCategory = ItemsLists(groceriesList, hygieneList, otherList)
 println(hygieneList)
    println(groceriesList)
}
fun fruit(characters:String):String{
    var evenCharacters=0
    for (character in characters){
        if(characters.indexOf(character)%2==0){
            print(character)
        }
    }
    return characters

}
fun num( name:ArrayList<String>){
    for( names in name){
        if (names.length % 2==0)
            println(name)

    }

}
