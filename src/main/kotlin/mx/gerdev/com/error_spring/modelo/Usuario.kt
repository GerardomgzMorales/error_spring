package mx.gerdev.com.error_spring.modelo

class Usuario() {
    var idUsuario: Int? = null
    var nombreUsuario: String? = null
    var apellidoUsuario: String? = null

    constructor(id: Int, nombre: String, apellido: String) : this() {

        this.idUsuario = id
        this.nombreUsuario = nombre
        this.apellidoUsuario = apellido
    }

}