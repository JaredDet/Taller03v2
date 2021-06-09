import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionesTest {

    @Test
    @DisplayName("Test para verificar modelos vacíos")
    void modeloVacio() {

        assertFalse(Validaciones.validarModelo(""));
    }

    @Test
    @DisplayName("Test para verificar modelos con números")
    void modeloNumero() {

        assertTrue(Validaciones.validarModelo("Vx15"));
    }

    @Test
    @DisplayName("Test para verificar modelos en minúsculas")
    void modelosMinuscula() {

        assertTrue(Validaciones.validarModelo("vx15"));
    }

    @Test
    @DisplayName("Test para verificar modelos en mayúsculas")
    void modeloMayuscula() {

        assertTrue(Validaciones.validarModelo("VX15"));
    }

    @Test
    @DisplayName("Test para verificar modelos con guión bajo")
    void modeloGuionBajo() {

        assertTrue(Validaciones.validarModelo("Vx_15"));
    }

    @Test
    @DisplayName("Test para verificar modelos con caracteres no permitidos")
    void modeloNoPermitido() {

        assertFalse(Validaciones.validarModelo("Vx$15"));
    }

    @Test
    @DisplayName("Test para verificar marcas vacías")
    void marcaVacia() {

        assertFalse(Validaciones.validarMarca(""));
    }

    @Test
    @DisplayName("Test para verificar marcas con números")
    void marcaNumero() {

        assertFalse(Validaciones.validarMarca("Toshiba12"));
    }

    @Test
    @DisplayName("Test para verificar marcas en minúsculas")
    void marcaMinuscula() {

        assertTrue(Validaciones.validarMarca("toshiba"));
    }

    @Test
    @DisplayName("Test para verificar marcas en mayúsculas")
    void marcaMayuscula() {

        assertTrue(Validaciones.validarMarca("ACER"));
    }

    @Test
    @DisplayName("Test para verificar marcas con tilde")
    void marcaTilde() {

        assertFalse(Validaciones.validarMarca("Acér"));
    }

    @Test
    @DisplayName("Test para verificar memoria RAM vacía")
    void RAMVacia() {
        MemoriaRAM memoriaRAM = new MemoriaRAM();
        assertTrue(Validaciones.validarMemoriaRAM(memoriaRAM));
    }

    @Test
    @DisplayName("Test para verificar computador vacío")
    void ComputadorVacio() {
        Computador computador = new Computador();
        assertFalse(Validaciones.validarComputador(computador));
    }

    @Test
    @DisplayName("Test para verificar capacidad GB negativa")
    void capacidadGBVacia() {

        assertFalse(Validaciones.validarCapacidadGB(-5));
    }

    @Test
    @DisplayName("Test para verificar frecuencia hz negativa")
    void frecuenciaHzVacia() {

        assertFalse(Validaciones.validarFrecuenciaHZ(-5));
    }

}