public class App {
 public static void main(String[] args) throws Exception {
  int peso = 69;
  double estatura = 1.47;

  if (peso >= 60 && peso <= 68 && estatura >= 1.60 && estatura <= 1.69) {
   System.out.println("Usted mide "+estatura+" con "+peso+" Kgs. Posee estatura y peso normal");
  } else if (peso >= 50 && peso <= 59 && estatura >= 1.60 && estatura <= 1.69) {
   System.out.println("Usted mide "+estatura+" con "+peso+" Kgs. Tiene estatura promedio, pero bajo peso");
  } else if (peso >= 50 && peso <= 59 && estatura <= 1.60) {
   System.out.println("Usted mide "+estatura+" con "+peso+" Kgs. Tiene estatura baja y bajo peso");
  } else if (peso >= 69 && estatura <= 1.65) {
   System.out.println("Usted mide "+estatura+" con "+peso+" Kgs. Tiene sobre peso");
  } else {
   System.out.println("Información inválida");
  }
 }
}
