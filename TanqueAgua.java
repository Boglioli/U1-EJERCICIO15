public class TanqueAgua {
    private double capacidadMaximaLitros;
    private double nivelActualLitros;

    public TanqueAgua(double capacidadMaximaLitros) {
        this(capacidadMaximaLitros, 0);
    }

    public TanqueAgua(double capacidadMaximaLitros, double nivelActualLitros) {
        if (capacidadMaximaLitros < 0) {
           throw new IllegalArgumentException("la capacidad máxima debe ser positiva");
        }
        if (nivelActualLitros < 0) {
           throw new IllegalArgumentException("el nivel actual no puede ser negativo");
        }
        if (nivelActualLitros > capacidadMaximaLitros) {
           nivelActualLitros = capacidadMaximaLitros;
        }
        this.capacidadMaximaLitros = capacidadMaximaLitros;
        this.nivelActualLitros = nivelActualLitros;
    }

    public double getCapacidadMaximaLitros() {
        return capacidadMaximaLitros;
    }

    public double getNivelActualLitros() {
        return nivelActualLitros;
    }

    public void llenar(double litros) {
        if (litros < 0) {
           throw new IllegalArgumentException("la cantidad a llenar no puede ser negativa");
        }
        nivelActualLitros += litros;
        if (nivelActualLitros > capacidadMaximaLitros) {
           nivelActualLitros = capacidadMaximaLitros;
        }
    }

    public void consumir(double litros) {
        if (litros < 0) {
           throw new IllegalArgumentException("los litros no pueden ser negativos");
        }
        nivelActualLitros -= litros;
        if (nivelActualLitros < 0) {
           nivelActualLitros = 0;
        }
    }

    public double calcularPorcentajeLlenado() {
        if (capacidadMaximaLitros == 0) {
           return 0;
        }
        return (nivelActualLitros / capacidadMaximaLitros) * 100;
    }
}