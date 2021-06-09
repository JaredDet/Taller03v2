public class VentanaConsola {

    private final Computador computador = new Computador();

    public void crearComputador() {
        if(Validaciones.validarComputadorVivo(computador)) {
            computador.setMarca(agregarMarca());
            computador.setModelo(agregarModelo());
            crearRAM();
        }
    }

    public void modificarComputador() {
        if (Validaciones.validarComputador(computador)) {
            int opcion;

            do {
                mostrarInfoEdicionComputador();
                opcion = Validaciones.entradaInt();

                switch (opcion) {
                    case 1 -> {
                        String marca = agregarMarca();
                        computador.setMarca(marca);
                    }
                    case 2 -> {
                        String modelo = agregarModelo();
                        computador.setModelo(modelo);
                    }
                    case 3 -> modificarRAM();
                    case 4 -> System.out.println("Saliendo del editor...");
                    default -> System.out.println("Fallo al elegir la opción");
                }
            } while (opcion != 4);
        }
    }

    public void crearRAM() {
        System.out.println("Bienvenido al menú para crear RAM");
        String marca = agregarMarca();
        int capacidadGB = agregarCapacidadGB();
        int frecuenciaHZ = agregarFrecuenciaHz();
        MemoriaRAM memoriaRam = new MemoriaRAM(marca, capacidadGB, frecuenciaHZ);
        computador.setMemoriaRAM(memoriaRam);
    }

    public void modificarRAM() {
        if (Validaciones.validarMemoriaRAM(computador.getMemoriaRAM())) {
            int opcion;

            do {
                mostrarInfoEdicion();
                opcion = Validaciones.entradaInt();

                switch (opcion) {
                    case 1 -> {
                        String marca = agregarMarca();
                        computador.getMemoriaRAM().setMarca(marca);
                    }
                    case 2 -> {
                        int capacidadGB = agregarCapacidadGB();
                        computador.getMemoriaRAM().setCapacidadGB(capacidadGB);
                    }
                    case 3 -> {
                        int frecuenciaHz = agregarFrecuenciaHz();
                        computador.getMemoriaRAM().setFrecuenciaHz(frecuenciaHz);
                    }
                    case 4 -> System.out.println("Saliendo del editor...");
                    default -> System.out.println("Fallo al elegir la opción");
                }
            } while (opcion != 4);
        }
    }

    private void mostrarInfoEdicionComputador() {
        System.out.println("Bienvenido al menú del computador");
        System.out.println("Elija una opción" + "\n");
        System.out.println("[1] Modificar marca");
        System.out.println("[2] Modificar modelo");
        System.out.println("[3] Modificar memoria RAM");
        System.out.println("[4] Salir" + "\n");
    }

    private void mostrarInfoEdicion() {
        System.out.println("Bienvenido al menú de la RAM");
        System.out.println("Elija una opción" + "\n");
        System.out.println("[1] Modificar marca");
        System.out.println("[2] Modificar capacidad GB");
        System.out.println("[3] Modificar frecuencia Hz");
        System.out.println("[4] Salir" + "\n");
    }

    public String agregarModelo() {
        String modelo;
        do {
            System.out.println("\n" + "Ingrese el modelo: ");
            modelo = Validaciones.entradaString();
        } while (!Validaciones.validarModelo(modelo));
        return modelo;
    }

    public String agregarMarca() {
        String marca;
        do {
            System.out.println("\n" + "Ingrese la marca: ");
            marca = Validaciones.entradaString();
        } while (!Validaciones.validarMarca(marca));
        return marca;
    }

    public int agregarCapacidadGB() {
        int capacidadGB;
        do {
            System.out.println("\n" + "Ingrese la capacidad GB: ");
            capacidadGB = Validaciones.entradaInt();
        } while (!Validaciones.validarCapacidadGB(capacidadGB));
        return capacidadGB;
    }

    public int agregarFrecuenciaHz() {
        int frecuenciaHz;
        do {
            System.out.println("\n" + "Ingrese la frecuencia Hz: ");
            frecuenciaHz = Validaciones.entradaInt();
        } while (!Validaciones.validarFrecuenciaHZ(frecuenciaHz));
        return frecuenciaHz;
    }

    private void mostrarDatosComputador() {
        if(Validaciones.validarMemoriaRAM(computador.getMemoriaRAM())) {
            System.out.println("Los datos del computador son: " + "\n");
            System.out.println(computador.toString());
        }
    }

    public void mostrarMenu() {

        System.out.println("""

                Bienvenido al menú
                """);
        System.out.println("Elija una opción" + "\n");
        System.out.println("[1] Crear el computador");
        System.out.println("[2] Editar el computador");
        System.out.println("[3] Mostrar componentes del computador");
        System.out.println("[4] Salir" + "\n");
    }

    public void iniciar() {
        int opcion;

        do {
            mostrarMenu();
            opcion = Validaciones.entradaInt();

            switch (opcion) {
                case 1 -> crearComputador();
                case 2 -> modificarComputador();
                case 3 -> mostrarDatosComputador();
                case 4 -> {
                    System.out.println("Gracias por utilizar el programa");
                    System.out.println("Adiós...");
                }
                default -> System.out.println("Fallo al elegir la opción");
            }
        } while (opcion != 4);
    }
}