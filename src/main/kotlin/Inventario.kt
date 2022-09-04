open class Inventario(val nombre:String,val precio: Float, val cantidad: Int)


fun cargar(inventario:MutableMap<Int,Inventario>){
    inventario[0] = Inventario("Sanabucal",7.12f,600)
    inventario[1] = Inventario("Tosil",5.10f,500)
    inventario[2] = Inventario("Ambroxol",5.06f,800)
    inventario[3] = Inventario("Antigrip A",44.25f,200)
    inventario[4] = Inventario("Brondex",3.60f,800)
    inventario[5] = Inventario("Cetafren",20.11f,400)
    inventario[6] = Inventario("Dologrip",16f,100)
    inventario[7] = Inventario("Palagrip",3.20f,400)
    inventario[8] = Inventario("Panadol dia",2.94f,500)
    inventario[9] = Inventario("Panadol noche",2.94f,500)
    inventario[10] = Inventario("Panadol Multisintomas",3.46f,400)

}
/*Mostrar todo los productos*/

fun listado(inventario: MutableMap<Int, Inventario>) {
    println("Listado de nuestros productos")
    for ((codigo, inventario) in inventario)
        println("Codigo: $codigo  Descripcion ${inventario.nombre}  Precio: ${inventario.precio}  Stock Actual: ${inventario.cantidad}")
    println()
}

//consultar productos y hacer venta
fun venta(inventario: MutableMap<Int, Inventario>) {
    print("Ingrese el codigo del producto que desea comprar:")
    val codigo = readLine()!!.toInt()

    if (codigo in inventario) {
        println("Nombre: ${inventario[codigo]?.nombre}  Precio:${inventario[codigo]?.precio}  Stock:${inventario[codigo]?.cantidad}")
        for (i in 1..10) {
            if (codigo === i) {
                print("Cuantos productos desea")
                val cant= readLine()!!.toInt()
            }

        }


    } else
        println("No existe producto con dicho codigo")


//checar si tenemos productos en stock

    fun noStock(inventario: MutableMap<Int, Inventario>) {
        val cant = inventario.count { it.value.cantidad == 0 }
        println("cantidad de articulos en stock: $cant")

    }

    fun main() {
        val inventario: MutableMap<Int, Inventario> = mutableMapOf()
        cargar(inventario);
        listado(inventario)
        venta(inventario)
        noStock(inventario)
    }
}
