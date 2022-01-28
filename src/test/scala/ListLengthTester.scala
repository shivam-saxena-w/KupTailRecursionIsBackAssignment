import org.scalatest.funsuite.AnyFunSuite

class ListLengthTester extends AnyFunSuite {
//  Object Creation
  val listLengthObject = new ListLength

  /**Test cases for List**/
  test("Calculating basic list length of type String"){
    assert(listLengthObject.length(List("scala","sbt","jvm")) == 3)
  }

  test("Calculating basic list length of type Integer"){
    assert(listLengthObject.length(List(1,2,3,4)) == 4)
  }

  test("Calculating length of an empty list"){
    assert(listLengthObject.length(Nil) == 0)
  }

  /**Test cases for Set**/
  test("Calculating basic set length of type String"){
    assert(listLengthObject.length(Set("scala","sbt","jvm")) == 3)
  }

  test("Calculating basic set length of type Integer"){
    assert(listLengthObject.length(Set(1,2,3,4)) == 4)
  }

  test("Calculating length of an empty set"){
    assert(listLengthObject.length(Set()) == 0)
  }

  /**Test cases for Seq**/
  test("Calculating basic seq length of type String"){
    assert(listLengthObject.length(Seq("scala","sbt","jvm")) == 3)
  }

  test("Calculating basic seq length of type Integer"){
    assert(listLengthObject.length(Seq(1,2,3,4)) == 4)
  }

  test("Calculating length of an empty seq"){
    assert(listLengthObject.length(Seq()) == 0)
  }
}
