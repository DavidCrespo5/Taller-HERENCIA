public class Vehiculo {
  String marca;
  String modelo;

  public Vehiculo(String marca, String modelo) {
      this.marca = marca;
      this.modelo = modelo;
  }

  public void acelerar() {
      System.out.println("El vehículo está acelerando.");
  }

  public void frenar() {
      System.out.println("El vehículo está frenando.");
  }

  // Métodos get y set para marca y modelo
  public String getMarca() {
      return marca;
  }

  public void setMarca(String marca) {
      this.marca = marca;
  }

  public String getModelo() {
      return modelo;
  }

  public void setModelo(String modelo) {
      this.modelo = modelo;
  }
}

class Automovil extends Vehiculo {
  int numeroPuertas;

  public Automovil(String marca, String modelo, int numeroPuertas) {
      super(marca, modelo);
      this.numeroPuertas = numeroPuertas;
  }

  public void encender() {
      System.out.println("El automóvil está encendido.");
  }

  public void apagar() {
      System.out.println("El automóvil está apagado.");
  }

  // Métodos get y set para numeroPuertas
  public int getNumeroPuertas() {
      return numeroPuertas;
  }

  public void setNumeroPuertas(int numeroPuertas) {
      this.numeroPuertas = numeroPuertas;
  }
}

class Motocicleta extends Vehiculo {
  boolean tieneCasco;

  public Motocicleta(String marca, String modelo, boolean tieneCasco) {
      super(marca, modelo);
      this.tieneCasco = tieneCasco;
  }

  public void conducir() {
      System.out.println("La motocicleta está siendo conducida.");
  }

  public void estacionar() {
      System.out.println("La motocicleta está estacionada.");
  }

  // Métodos get y set para tieneCasco
  public boolean isTieneCasco() {
      return tieneCasco;
  }

  public void setTieneCasco(boolean tieneCasco) {
      this.tieneCasco = tieneCasco;
  }
}

class Camion extends Vehiculo {
  double capacidadCarga;

  public Camion(String marca, String modelo, double capacidadCarga) {
      super(marca, modelo);
      this.capacidadCarga = capacidadCarga;
  }

  public void cargar() {
      System.out.println("El camión está siendo cargado.");
  }

  public void descargar() {
      System.out.println("El camión está siendo descargado.");
  }

  // Métodos get y set para capacidadCarga
  public double getCapacidadCarga() {
      return capacidadCarga;
  }

  public void setCapacidadCarga(double capacidadCarga) {
      this.capacidadCarga = capacidadCarga;
  }
}

class Bicicleta extends Vehiculo {
  int numeroMarchas;

  public Bicicleta(String marca, String modelo, int numeroMarchas) {
      super(marca, modelo);
      this.numeroMarchas = numeroMarchas;
  }

  public void pedalear() {
      System.out.println("La bicicleta está siendo pedaleada.");
  }

  public void frenar() {
      System.out.println("La bicicleta está frenando.");
  }

  // Métodos get y set para numeroMarchas
  public int getNumeroMarchas() {
      return numeroMarchas;
  }

  public void setNumeroMarchas(int numeroMarchas) {
      this.numeroMarchas = numeroMarchas;
  }
}

class Patineta extends Vehiculo {
  boolean tieneLuces;

  public Patineta(String marca, String modelo, boolean tieneLuces) {
      super(marca, modelo);
      this.tieneLuces = tieneLuces;
  }

  public void patinar() {
      System.out.println("La patineta está patinando.");
  }

  public void frenar() {
      System.out.println("La patineta está frenando.");
  }

  // Métodos get y set para tieneLuces
  public boolean isTieneLuces() {
      return tieneLuces;
  }

  public void setTieneLuces(boolean tieneLuces) {
      this.tieneLuces = tieneLuces;
  }
}

public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Toyota", "Corolla", 4);
        Motocicleta motocicleta = new Motocicleta("Honda", "CBR", true);
        Camion camion = new Camion("Volvo", "FH16", 5000.0);
        Bicicleta bicicleta = new Bicicleta("Trek", "Mountain Bike", 21);
        Patineta patineta = new Patineta("SkatePro", "Freestyle", true);

        automovil.encender();
        automovil.acelerar();
        automovil.frenar();
        automovil.apagar();

        System.out.println("Marca del automóvil: " + automovil.getMarca());
        System.out.println("Modelo del automóvil: " + automovil.getModelo());
        System.out.println("Número de puertas del automóvil: " + automovil.getNumeroPuertas());

        System.out.println();

        motocicleta.conducir();
        motocicleta.acelerar();
        motocicleta.frenar();
        motocicleta.estacionar();

        System.out.println("Marca de la motocicleta: " + motocicleta.getMarca());
        System.out.println("Modelo de la motocicleta: " + motocicleta.getModelo());
        System.out.println("¿Tiene casco la motocicleta?: " + motocicleta.isTieneCasco());

        System.out.println();

        camion.cargar();
        camion.acelerar();
        camion.frenar();
        camion.descargar();

        System.out.println("Marca del camión: " + camion.getMarca());
        System.out.println("Modelo del camión: " + camion.getModelo());
        System.out.println("Capacidad de carga del camión: " + camion.getCapacidadCarga());

        System.out.println();

        bicicleta.pedalear();
        bicicleta.acelerar();
        bicicleta.frenar();

        System.out.println("Marca de la bicicleta: " + bicicleta.getMarca());
        System.out.println("Modelo de la bicicleta: " + bicicleta.getModelo());
        System.out.println("Número de marchas de la bicicleta: " + bicicleta.getNumeroMarchas());

        System.out.println();

        patineta.patinar();
        patineta.frenar();

        System.out.println("Marca de la patineta: " + patineta.getMarca());
        System.out.println("Modelo de la patineta: " + patineta.getModelo());
        System.out.println("¿Tiene luces la patineta?: " + patineta.isTieneLuces());
    }
}
