import org.scalatest.funsuite.AnyFunSuite

class ListLengthTester extends AnyFunSuite {
//  Object Creation
  val listLengthObject = new ListLength
  test("Calculating basic list length of type String"){
    assert(listLengthObject.length(List("scala","sbt","jvm")) == 3)
  }

  test("Calculating basic list length of type Integer"){
    assert(listLengthObject.length(List(1,2,3,4)) == 4)
  }

  test("Calculating length of an empty list"){
    assert(listLengthObject.length(Nil) == 0)
  }
}
