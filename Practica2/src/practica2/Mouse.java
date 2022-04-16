package practica2;

public class Mouse {
    public String color, marca, RGB;
    public int botones, DPI;

       public Mouse(){
           this.color = null;
           this.marca = null;
           this.RGB = null;
           this.botones = 0;
           this.DPI = 0;
       }
       
        public Mouse(String color, String marca, String RGB, int botones, int DPI){
           this.color = color;
           this.marca = marca;
           this.RGB = RGB;
           this.botones = botones;
           this.DPI = DPI;
        }
        
        public String getColor(){
            return this.color;
        }
        public void setColor(String color){
            this.color = color;
        }
        
        public String getMarca(){
            return this.marca;
        }
        public void setMarca (String marca){
            this.marca = marca;
        }
        
        public String getRGB(){
            return this.RGB;
        }
        public void setRGB(String RGB){
            this.RGB = RGB;
        }
        
        public int getBotones(){
            return this.botones;
        }
        public void setBotones(int botones){
            this.botones = botones;
        }
        
        public int getDPI(){
            return this.DPI;
        }
        public void setDPI(int DPI){
            this.DPI = DPI;
        }
        
}
