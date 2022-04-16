package practica2;

public class Calculadora {
    public String modelo, marca, alimentacion;
    public int digitos, cantidadFunciones;

       public Calculadora(){
           this.modelo = null;
           this.marca = null;
           this.alimentacion = null;
           this.digitos = 0;
           this.cantidadFunciones = 0;
       }
       
        public Calculadora(String modelo, String marca, String alimentacion, int digitos, int cantidadFunciones){
           this.modelo = modelo;
           this.marca = marca;
           this.alimentacion = alimentacion;
           this.digitos = digitos;
           this.cantidadFunciones = cantidadFunciones;
        }
        
        public String getModelo(){
            return this.modelo;
        }
        public void setModelo(String modelo){
            this.modelo = modelo;
        }
        
        public String getMarca(){
            return this.marca;
        }
        public void setMarca (String marca){
            this.marca = marca;
        }
        
        public String getAlimentacion(){
            return this.alimentacion;
        }
        public void setAlimentacion(String alimentacion){
            this.alimentacion = alimentacion;
        }
        
        public int getDigitos(){
            return this.digitos;
        }
        public void setDigitos(int digitos){
            this.digitos = digitos;
        }
        
        public int getCantidadFunciones(){
            return this.cantidadFunciones;
        }
        public void setCantidadFunciones(int cantidadFunciones){
            this.cantidadFunciones = cantidadFunciones;
        }
        
}