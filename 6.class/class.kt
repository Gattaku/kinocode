class Student(var name: String) {
    fun ave(math:Int, english:Int){
        val result = (math+english)/2;
        println("${name}の平均点は${result}です。")
    }
}

fun main(){
    val a001=Student("Nomu-Nomu");

    a001.ave(50,60);
}