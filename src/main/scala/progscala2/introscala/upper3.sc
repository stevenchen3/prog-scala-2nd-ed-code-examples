// src/main/scala/progscala2/introscala/upper1.sc

class Upperx {
  def toUpper(str: String): String = {
    // the same as str.toUpperCase()
    // if a function requires no argument, we can omit the parentheses
    str.toUpperCase
  }

  def upper(strings: String*): Seq[String] = {
    // Change function literal to explicit defined function
    strings.map(toUpper)
  }

  def lower(strings: String*): Seq[String] = strings.map(_.toLowerCase)
}

val up = new Upperx()
println(up.upper("Hello", "World!"))
println(up.lower("Hello", "World!"))
