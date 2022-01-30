import scala.annotation.tailrec

class ListLength{
  @tailrec
  final def length[T](listInput: Iterable[T], accumulator: Int = 0) : Int =
    if(listInput.isEmpty) accumulator
    else length(listInput.tail, accumulator + 1)
}
