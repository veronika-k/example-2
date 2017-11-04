(1 to 5).map(_*2)
def lambda = { x: Int =>
  x + 1
}
val `result1andhalf` = lambda.apply(3)
val result1andhalf1 = lambda(3)

var incrementer = 1

def closure = { x: Int =>
  x + incrementer
}
def makeUpper(xs: List[String]) = xs map (_.toUpperCase)
makeUpper(List("abc", "xyz", "123"))

def makeWhatEverYouLike(xs: List[String], sideEffect: String ⇒ String) =
  xs map sideEffect

makeWhatEverYouLike(List("ABC", "XYZ", "123"), ( x ⇒ x.toLowerCase))

val myName = (name: String) => "My name is "+name

makeWhatEverYouLike(List("John", "Mark"), myName)
val l = List("Scala", "Erlang", "Clojure")  groupBy (_.length)
val m = for ((x,y) <- l) yield x -> y.head
List("Scala", "Erlang", "Clojure") map (_.length)

val a = (1 to 5).toList
