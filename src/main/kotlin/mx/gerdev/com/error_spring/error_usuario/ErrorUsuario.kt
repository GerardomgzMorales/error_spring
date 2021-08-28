package mx.gerdev.com.error_spring.error_usuario


class ErrorUsuario(message: String) : RuntimeException("Usuario con el ID: $message no existe en el sistema") {

}