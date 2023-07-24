class Student (var name: String) {
    fun calAve(data:IntArray):Int {
        var sum =0;
        for (score in data) {
            sum += score;
        }
        var avg = sum / data.count();
        return avg;
    }
    fun judge (avg: Int): String {
        var result:String;
        if (avg >=60) {
            result = "passed";
        } else {
            result = "failed";
        }
        return result;
    }
}

fun main() {
    val a1 = Student("kotlin");
    val testResult = intArrayOf(80,40,50,60,70);
    println(a1.judge(a1.calAve(testResult)));
}