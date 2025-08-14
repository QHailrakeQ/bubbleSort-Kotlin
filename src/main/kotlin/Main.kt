fun bubbleSort(arr: IntArray) {
    for(i in 0 until arr.size - 1) {
        for(j in 0 until arr.size - i - 1) {
            if(arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}
fun main() {
   val nums = intArrayOf(1, 5, 7, 4, 9, 10)
    bubbleSort(nums)
    println("Sorted array: $nums")
}