class Menu {

    fun menu() {

        var venta1 = Venta()
        println("....................................................................")
        println("........... FAVOR INGRESAR UNA DE LAS SIGUIENTES OPCIONES ..........")
        println("....................................................................")
        println("1. -venta nueva")
        println("2. -Consultar inventarios")
        println("3. -Cambiar contraseña")
        println("4. -salir del sistema")

        var opcion = readLine()!!.toInt()


        when (opcion) {
            1 -> {
                println("Bienvenido a venta nueva")
                venta1.cargar()
                venta1.listado()
                venta1.venta()
            }

            2 -> {
                println("Bienvenido a consulta de inventarios")
                venta1.cargar()
                venta1.listado()


            }

            3 -> {
                println("Usted seleccionó la opcion de cambio de contraseña")
            }

            4 -> {
                println("Gracias por ingresar a Farmacia Fiorella, que tenga un buen dia!")
            }

            else -> {
                println("Esta opcion no es valida")
            }
        }
    }

}