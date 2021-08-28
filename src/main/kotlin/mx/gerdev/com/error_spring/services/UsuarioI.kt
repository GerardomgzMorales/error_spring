package mx.gerdev.com.error_spring.services

import mx.gerdev.com.error_spring.modelo.Usuario
import java.util.*

interface UsuarioI {
    fun listarUsuario(): List<Usuario>?
    fun buscarUsuario(id: Int): Usuario?
    fun buscarUsuarioIDOptional(id: Int): Optional<Usuario>
}