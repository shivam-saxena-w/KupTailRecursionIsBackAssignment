class ListLength {
  def length[T](listInput: List[T]): Int = {
    def lengthCalculator(listInput: List[T], accumulator: Int): Int =
      listInput match {
        case Nil => accumulator
        case listHead :: listTail => lengthCalculator(listTail, accumulator + 1)
        // For every head of every tail, until tail == Nil => accumulator will get +1
      }
    lengthCalculator(listInput, 0)
  }
}