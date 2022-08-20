
class persona{



    var user1  = arrayListOf("admin","admin123")
    var user2 = arrayListOf("vendedor","vendedor123")
    var user3 = arrayListOf("invitado","invitado123")



    fun user () {


        println("Ingrese su nombre de usuario")
        user1 [0] = readln()!!.toString()

        println("Ingrese su contraseña")
        user1 [1] = readLine()!!.toString()

        user2 [0] = readln()!!.toString()

        println("Ingrese su contraseña")
        user2 [1] = readLine()!!.toString()

        user3 [0] = readln()!!.toString()

        println("Ingrese su contraseña")
        user3 [1] = readLine()!!.toString()

        if ((user1[0]== "admin")&& (user1[1]=="admin123")){
            print("Su usuario es correcto")
    }
        else{
            println("Su usuario es incorrecto")

        }


        if ((user2[0]== "vendedor")&& (user2[1]=="vendedor123")){
            print("Su usuario es correcto")
        }
        else{
            println("Su usuario es incorrecto")
        }

        if ((user3[0]== "invitado")&& (user3[1]=="invitado123")){
            print("Su usuario es correcto")
        }
        else{
            println("Su usuario es incorrecto")
        }


    }

    }
fun main(parametro:Array<String>){
    println (".....................................................")
      println(".... BIENVENIDO AL SISTEMA DE FARMACIA FIORELLA.....")
    println("........... FAVOR INGRESAR SUS CREDENCIALES ..........")
    println (".....................................................")
    val usuario = persona()
    usuario.user1
    usuario.user()
    usuario.user2
    usuario.user3



}