//> using scala 2.13
//> using dep com.lihaoyi::requests:0.9.0


object App {
  def main(args: Array[String]) = {
    println("Hello World")
    val res = requests.get("https://httpbin.dev/uuid")
    println(res.text)
}
}
