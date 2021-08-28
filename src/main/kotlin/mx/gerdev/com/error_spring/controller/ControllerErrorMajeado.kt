package mx.gerdev.com.error_spring.controller

import mx.gerdev.com.error_spring.error_usuario.ErrorUsuario
import org.springframework.http.HttpStatus
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.util.*
import kotlin.NumberFormatException

@ControllerAdvice
class ControllerErrorMajeado {

    @ExceptionHandler(ArithmeticException::class)
    fun errorAritmetico(ex: ArithmeticException, vista: Model): String {

        vista.addAttribute(
            "errorMatematico",
            "Error al procesar una operacion matematica o los calores no son numericos"
        )

        vista.addAttribute("msgError", ex.message)
        vista.addAttribute("msgError1", HttpStatus.INTERNAL_SERVER_ERROR.value())
        vista.addAttribute("msgError2", Date())

        return "error/aritmetica"
    }


    @ExceptionHandler(NumberFormatException::class)
    fun errorConvetNumerico(ex: NumberFormatException, vista: Model): String {

        vista.addAttribute(
            "errorMatematico",
            "Los valores numeric no son numeric"
        )

        vista.addAttribute("msgError", ex.message)
        vista.addAttribute("msgError1", HttpStatus.INTERNAL_SERVER_ERROR.value())
        vista.addAttribute("msgError2", Date())

        return "error/aritmetica"
    }


    @ExceptionHandler(ErrorUsuario::class)
    fun errorNullUsuario(ex: ErrorUsuario, vista: Model): String {

        vista.addAttribute(
            "errorMatematico",
            "El usuario no fue encontrado en la lista"
        )

        vista.addAttribute("msgError", ex.message)
        vista.addAttribute("msgError1", HttpStatus.INTERNAL_SERVER_ERROR.value())
        vista.addAttribute("msgError2", Date())

        return "error/aritmetica"
    }

}