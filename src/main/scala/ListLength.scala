import scala.annotation.tailrec

class ListLength{
  @tailrec
  final def length[T](listInput: Iterable[T], accumulator: Int = 0) : Int =
    if(listInput.isEmpty) accumulator
    else length(listInput.tail, accumulator + 1)
}

//class ListLength2 {
//  def length[T](listInput: Iterable[T]): Int = {
//    @tailrec
//    def lengthCalculator(listInput: Iterable[T], accumulator: Int = 0): Int =
//      if(listInput.isEmpty) accumulator
//      else listInput match {
//        case listHead :: listTail => lengthCalculator(listTail, accumulator + 1)
//        // For every head of every tail, until tail == Nil => accumulator will get +1
//      }
//    lengthCalculator(listInput)
//  }
//}