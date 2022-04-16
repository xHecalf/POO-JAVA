package practica2;

public class Bicicleta {
    public String color, tipo, grupoEtario;
    public int rodado, velocidades;

       public Bicicleta(){
           this.color = null;
           this.tipo = null;
           this.grupoEtario = null;
           this.rodado = 0;
           this.velocidades = 0;
       }
       
        public Bicicleta(String color, String tipo, String grupoEtario, int rodado, int velocidades){
           this.color = color;
           this.tipo = tipo;
           this.grupoEtario = grupoEtario;
           this.rodado = rodado;
           this.velocidades = velocidades;
        }
        
        public String getColor(){
            return this.color;
        }
        public void setColor(String color){
            this.color = color;
        }
        
        public String getTipo(){
            return this.tipo;
        }
        public void setTipo (String tipo){
            this.tipo = tipo;
        }
        
        public String getGrupoEtario(){
            return this.grupoEtario;
        }
        public void setGrupoEtario(String grupoEtario){
            this.grupoEtario = grupoEtario;
        }
        
        public int getRodado(){
            return this.rodado;
        }
        public void setRodado(int rodado){
            this.rodado = rodado;
        }
        
        public int getVelocidades(){
            return this.velocidades;
        }
        public void setVelocidades(int velocidades){
            this.velocidades = velocidades;
        }
        
}