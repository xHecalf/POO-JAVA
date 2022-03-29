package practica7;

public class Bird {
    
    public int velocidad, peso, tamaño, alcance;
    public String ataque, nombre;

       public Bird(){
           this.velocidad = 0;
           this.peso = 0;
           this.tamaño = 0;
           this.alcance = 0;
           this.ataque = null;
           this.nombre = null;
       }
       
        public Bird(int tamaño, int velocidad, int peso, int alcance, String ataque, String nombre){
            this.tamaño = tamaño;
            this.peso = peso;
            this.velocidad = velocidad;
            this.alcance = alcance;
            this.ataque = ataque;
            this.nombre = nombre;
    }
        public String getAtaque(){
            return this.ataque;
        }
        public void setAtaque(String ataque){
            this.ataque = ataque;
        }
        
        public String getNombre(){
            return this.nombre;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        
        public int getVelocidad(){
            return this.velocidad;
        }
        public void setVelocidad(int velocidad){
            this.velocidad = velocidad ;
        }
        
        public int getPeso(){
            return this.peso;
        }
        public void setPeso(int peso){
            this.peso = peso;
        }
        
        public int getAlcance(){
            return this.alcance;
        }
        public void setAlcance(int alcance){
            this.alcance = alcance;
        }
        
        public int getTamaño(){
            return this.tamaño;
        }
        public void setTamaño(int tamaño){
            this.tamaño = tamaño;
        }
        
        static public class BlueBird extends Bird{
            public BlueBird(){
                setNombre("Jay, Jake y Jim");
                setAtaque("divide en tres");
        // 1 = pequeño, debil, lento | 2 = mediano | 3 = grande, fuerte, rapido
                setAlcance(1);
                setPeso(1);
                setTamaño(1);
                setVelocidad(2);
            }
        }
        
        static public class RedBird extends Bird{
            public RedBird(){
                setNombre("Red");
                setAtaque("endurece");
        // 1 = pequeño, debil, lento | 2 = mediano | 3 = grande, fuerte, rapido
                setAlcance(2);
                setPeso(2*2);
                setTamaño(2);
                setVelocidad(2);
            }
        }
        static public class YellowBird extends Bird{
            public YellowBird(){
                setNombre("Chuck");
                setAtaque("aumento de velocidad");
        // 1 = pequeño, debil, lento | 2 = mediano | 3 = grande, fuerte, rapido
                setAlcance(2);
                setPeso(2);
                setTamaño(2);
                setVelocidad(2*3);
            }
}
}