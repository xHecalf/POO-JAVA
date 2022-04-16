package practica2;

public class Puerta {
    public String color, material;
    public float longitud, ancho, volumen;

       public Puerta(){
           this.color = null;
           this.longitud = 0;
           this.ancho = 0;
           this.volumen = 0;
           this.material = null;
       }
       
        public Puerta(String color, float longitud, float ancho, float volumen, String material){
           this.color = color;
           this.longitud = longitud;
           this.ancho = ancho;
           this.volumen = volumen;
           this.material = material;
        }
        
        public String getColor(){
            return this.color;
        }
        public void setColor(String color){
            this.color = color;
        }
        
        public float getLongitud(){
            return this.longitud;
        }
        public void setLongitud (float longitud){
            this.longitud = longitud;
        }
        
        public float getAncho(){
            return this.ancho;
        }
        public void setAncho(float ancho){
            this.ancho = ancho;
        }
        
        public float getVolumen(){
            return this.volumen;
        }
        public void setVolumen(float volumen){
            this.volumen = volumen;
        }
        
        public String getMaterial(){
            return this.material;
        }
        public void setMaterial(String material){
            this.material = material;
        }
        
}