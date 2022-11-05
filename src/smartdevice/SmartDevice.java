package smartdevice;

public class SmartDevice {
    String celMarca, celModelo, celTamaño;

    public SmartDevice(){}

    public SmartDevice(String celMarca, String celModelo, String celTamaño){
        this.celMarca = celMarca;
        this.celModelo = celModelo;
        this.celTamaño = celTamaño;
    }

    public static class SmartPhone extends SmartDevice{
        String sistemaOperativo;
        int memoriaInterna;
        int memoriaExterna;

        public SmartPhone(){
            super();
        }

        public SmartPhone(String celMarca, String celModelo, String celTamaño,
                          String sistemaOperativo, int memoriaInterna, int memoriaExterna){
            super(celMarca, celModelo, celTamaño);
            this.sistemaOperativo = sistemaOperativo;
            this.memoriaInterna = memoriaInterna;
            this.memoriaExterna = memoriaExterna;
        }

        @Override
        public  String toString(){
            return "Marca: " + celMarca + " \n Modelo: "+  celModelo +
                  "\n Tamaño: " + celTamaño + "Sistema operativo: " + sistemaOperativo
                    + " Memoria interna: "
                  + memoriaInterna + " Memoria externa: " + memoriaExterna;
        }

    }

    public static class SmartWatch extends SmartDevice{
        String compañia;

        public SmartWatch(){
            super();
        }

        public SmartWatch(String celMarca, String celModelo, String celTamaño,
                          String compañia) {
            super(celMarca, celModelo, celTamaño);
            this.compañia = compañia;

        }

        @Override
        public String toString(){
            return "Marca: " + celMarca + " \n Modelo: "+  celModelo +
                    "\n Tamaño: " + celTamaño + " Compañia: " + compañia;
        }
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Huahuei, ", " y520", " 5 Pulgadas, ",
                " Android, ",
                254,512);
        SmartWatch smartWatch = new SmartWatch(" Samsung x, "," A10, ", " 5 Pulgadas, ", "Telcel");

        System.out.println(" \n Datos del telefono celular: ->" + smartPhone
                + "\n Los datos de la tablet son: -> " + smartWatch);
    }


}
