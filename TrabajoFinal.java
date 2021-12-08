public class TrabajoFinal {
    public static double Dsct2(String talla, int cantidad, String tipoPanal){
        double precioUni = precioUnitario(tipoPanal,talla);
        double total = 0.0;
        for (int i = 1; i <= cantidad; i++) {
            if (i <= 99) total = total +precioUni;
            else if (i>99 && i < 150) total= total +precioUni*(1-0.005);
            else if (i>= 150 && i <200) total= total +precioUni*(1-0.007);
            else if (i >= 200 && i < 300) total= total +precioUni*(1-0.025);
            else total= total +precioUni*(1-0.05);
        }
        return total;
    }
    public static double Dsct1(String talla, int cantidad, String tipoPanal){
        double precioSinDsct = preciopanal(tipoPanal,talla, cantidad);
        double precio = precioSinDsct ;
        for (int i = 1; i <= cantidad ; i++) {
            if ( i <= 99) precio = precio;
            else if (i >99 && i <150) precio = precio -  1.00 ;
            else if (i >= 150 && i < 200) precio = precio -  1.20;
            else if (i >= 200 && i <300) precio= precio - 1.50;
            else precio = precio - 2.00;
        }
        return precio;
    }


    public static double preciopanal(String tipoPanal,String talla, int cantidad){
        double precio;
        if (tipoPanal.equals("Huggies") && talla.equals("G")) precio = 53.90;
        else if (tipoPanal.equals("Huggies") && talla.equals("XG")) precio = 55.30;
        else if (tipoPanal.equals("Huggies") && talla.equals("XXG")) precio = 57.90;
        else if (tipoPanal.equals("Pampers") && talla.equals("G")) precio = 51.90;
        else if (tipoPanal.equals("Pampers") && talla.equals("XG")) precio = 53.20;
        else if (tipoPanal.equals("Pampers") && talla.equals("XXG")) precio = 56.50;
        else if (tipoPanal.equals("BabySec") && talla.equals("G")) precio = 53.80;
        else if (tipoPanal.equals("BabySec") && talla.equals("XG")) precio = 55.90;
        else precio = 56.40;
        precio = precio * cantidad;
        return precio;
    }
    public static double precioUnitario (String tipoPanal,String talla){
        double precio = 0.0;
        if (tipoPanal.equals("Huggies") && talla.equals("G")) precio = 53.90;
        else if (tipoPanal.equals("Huggies") && talla.equals("XG")) precio = 55.30;
        else if (tipoPanal.equals("Huggies") && talla.equals("XXG")) precio = 57.90;
        else if (tipoPanal.equals("Pampers") && talla.equals("G")) precio = 51.90;
        else if (tipoPanal.equals("Pampers") && talla.equals("XG")) precio = 53.20;
        else if (tipoPanal.equals("Pampers") && talla.equals("XXG")) precio = 56.50;
        else if (tipoPanal.equals("BabySec") && talla.equals("G")) precio = 53.80;
        else if (tipoPanal.equals("BabySec") && talla.equals("XG")) precio = 55.90;
        else precio = 56.40;
        return precio;
    }

    public static void TFinal(){
        String tipoPanal = "BabySec";
        String talla = "XG";
        int cantidad  = 800;
        double precioSinDsct = preciopanal(tipoPanal,talla, cantidad);
        System.out.println(" El precio normal sin descuento es S/. " +precioSinDsct);
        double precioDsct1 = Dsct1(talla, cantidad, tipoPanal);
        System.out.println(" El precio a pagar utilizando el descuento 1 S/. " + precioDsct1);
        double precioDsct2 = Dsct2(talla, cantidad, tipoPanal);
        System.out.println(" El precio a pagar utilizando el descuento 2 S/. " +precioDsct2);
        if (precioDsct1 < precioDsct2) System.out.println( "Si el cliente compra " + cantidad + " pañales tipo " + tipoPanal + " es mas favorable el descuento 1");
        else System.out.println( "Si el cliente compra"   + cantidad + "pañales tipo " + tipoPanal + " es mas favorable el descuento 2");


    }
       public static void main(String[] args) {
        TFinal();
    }


}
