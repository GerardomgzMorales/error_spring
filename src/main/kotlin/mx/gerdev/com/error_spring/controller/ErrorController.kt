package mx.gerdev.com.error_spring.controller

import mx.gerdev.com.error_spring.error_usuario.ErrorUsuario
import mx.gerdev.com.error_spring.services.UsuarioI
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable


@Controller
class ErrorController {

    @Autowired
    private val servicioUsr: UsuarioI? = null

    @SuppressWarnings("unused")
    @GetMapping("/index")
    fun index(modelo: Model): String {
        //val divide = 100 / 0
        //val numero = "10v".toInt()
        return "index"
    }

    @GetMapping("/ver/{id}")
    fun verUsuario(@PathVariable id: Int, vista: Model): String {
       // val usuario: Usuario? = servicioUsr?.buscarUsuario(id)

      /*  if (usuario != null) {
            vista.addAttribute("usuario", usuario)
        } else {
            throw  ErrorUsuario(id.toString())
        }*/


        val usuario = servicioUsr!!.buscarUsuarioIDOptional(id).orElseThrow {
            ErrorUsuario(id.toString())
        }
        vista.addAttribute("usuario", usuario)

        return "ver"
    }



}
