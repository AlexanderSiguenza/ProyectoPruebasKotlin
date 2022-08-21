fun main() {
    println("Bienvenido al catalogo")
    println("Ingrese el numero de lo que busca")
    println("1.productos en descuento")

    println("2.Productos de conveniencia")

    println("3.medicamentos")

    println("4.salir")

    var opt = readLine()!!.toInt();

    when(opt){
        1 -> {
            println("productos en descuento")
        }
        2 -> {
            println("Productos de conveniencia")
        }
        3 -> {
            println("medicamentos")
        }
        4 -> {
            println("salir")
        }
    }
}