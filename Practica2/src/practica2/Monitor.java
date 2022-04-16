package practica2;

public class Monitor {
    public String tipo, marca, resolucion;
    public int pulgadas, herzios;

       public Monitor(){
           this.tipo = null;
           this.marca = null;
           this.resolucion = null;
           this.pulgadas = 0;
           this.herzios = 0;
       }
       
        public Monitor(String tipo, String marca, String resolucion, int pulgadas, int herzios){
           this.tipo = tipo;
           this.marca = marca;
           this.resolucion = resolucion;
           this.pulgadas = pulgadas;
           this.herzios = herzios;
        }
        
        public String getTipo(){
            return this.tipo;
        }
        public void setTipo(String tipo){
            this.tipo = tipo;
        }
        
        public String getMarca(){
            return this.marca;
        }
        public void setMarca (String marca){
            this.marca = marca;
        }
        
        public String getResolucion(){
            return this.resolucion;
        }
        public void setResolucion(String resolucion){
            this.resolucion = resolucion;
        }
        
        public int getPulgadas(){
            return this.pulgadas;
        }
        public void setPulgadas(int pulgadas){
            this.pulgadas = pulgadas;
        }
        
        public int getHerzios(){
            return this.herzios;
        }
        public void setHerzios(int herzios){
            this.herzios = herzios;
        }
        
}