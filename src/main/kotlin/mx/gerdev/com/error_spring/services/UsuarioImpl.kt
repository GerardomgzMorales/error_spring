package mx.gerdev.com.error_spring.services

import mx.gerdev.com.error_spring.modelo.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioImpl : UsuarioI {

    private var listaUsuario: MutableList<Usuario>? = null

    private fun listaCompletaUsuarios() {
        listaUsuario = mutableListOf()
        listaUsuario!!.add(Usuario(1, "Gerardo Morales", "Gomez"))
        listaUsuario!!.add(Usuario(2, "Israel Morales", "Gomez"))
        listaUsuario!!.add(Usuario(3, "Brenda Lee Morales", "Gomez"))
        listaUsuario!!.add(Usuario(4, "Irene Morales", "Gomez"))
        listaUsuario!!.add(Usuario(5, "Miguel Morales", "Gomez"))
    }


    override fun listarUsuario(): List<Usuario>? {
        listaCompletaUsuarios()
        return listaUsuario
    }

    override fun buscarUsuario(id: Int): Usuario? {
        listaCompletaUsuarios()

        var usuarioRetorno: Usuario? = null

        if (listaUsuario != null) {
            for (usr in listaUsuario!!) {
                if (usr.idUsuario == id) {
                    usuarioRetorno = usr
                    break
                }
            }
        }
        return usuarioRetorno
    }

    override fun buscarUsuarioIDOptional(id: Int): Optional<Usuario> {
        val usuario: Usuario? = this.buscarUsuario(id)
        return Optional.ofNullable(usuario) // se invoca el metodo of se conbierte a un tipo optional  y esta acepat Nulos
    }
}