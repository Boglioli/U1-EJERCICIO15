public class Main {
    public static void main(String[] args) {
        TanqueAgua tanque = new TanqueAgua(1000, 400);
        tanque.llenar(300);
        tanque.consumir(200);
        System.out.println("Nivel actual de agua: " + tanque.getNivelActualLitros() + " litros");
        System.out.println("Porcentaje de llenado: " + tanque.calcularPorcentajeLlenado() + "%");
    }
}