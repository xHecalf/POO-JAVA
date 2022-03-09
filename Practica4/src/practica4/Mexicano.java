package practica4;

import java.util.Scanner;
import java.util.Random;

public class Mexicano {
    
    public String nombre1;
    public String nombre2;
    public String apellido1;
    public String apellido2;
    public String estado;
    public String genero;
    public String dia;
    public String mes;
    public String año;
    public String CURP;
    public String RFC;

    public Mexicano(String nombre1, String nombre2, String apellido1, String apellido2, String estado, String genero, String dia, String mes, String año, String CURP, String RFC) {
        this.nombre1 = nombre1;
        this.nombre2=nombre2;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.estado=estado;
        this.genero=genero;
        this.dia=dia;
        this.mes=mes;
        this.año=año;
        this.CURP=CURP;
        this.RFC=RFC;
    }

    public Mexicano() {
        this.nombre1 = null;
        this.nombre2=null;
        this.apellido1=null;
        this.apellido2=null;
        this.estado=null;
        this.genero=null;
        this.dia=null;
        this.mes=null;
        this.año=null;
        this.CURP= null;
        this.RFC= null;
    }
    
    public void asignarNombre1(String nombre1){
        this.nombre1 = nombre1;
    }
    public String getNombre1(){
        return this.nombre1;
    }
    
    public void asignarNombre2(String nombre2){
        this.nombre2 = nombre2;
    }
    public String getNombre2(){
        return this.nombre2;
    }
    
    public void asignarApellido1(String apellido1){
        this.apellido1 = apellido1;
    }
    public String getApellido1(){
        return this.apellido1;
    }
    
    public void asignarApellido2(String apellido2){
        this.apellido2 = apellido2;
    }
    public String getApellido2(){
        return this.apellido2;
    }
    
    public void asignarGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }
    
    public void asignarEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return this.estado;
    }

    public void asignarDia(String dia){
        this.dia = dia;
    }
    public String getDia(){
        return this.dia;
    }
    
    public void asignarMes(String mes){
        this.mes = mes;
    }
    public String getMes(){
        return this.mes;
    }
    
    public void asignarAño(String año){
        this.año = año;
    }
    public String getAño(){
        return this.año;
    }
    
    public String getVocal1(){
        String vocal1 = apellido1.toUpperCase();
        for(int i=0; i<vocal1.length(); i++) {
            if(vocal1.substring(i,i+1) == "A"||
               vocal1.substring(i,i+1) == "E"|| 
               vocal1.substring(i,i+1) == "I"||
               vocal1.substring(i,i+1) == "O"|| 
               vocal1.substring(i,i+1) == "U")
               {
               return vocal1 = vocal1.substring(i,i+1);
            }
        }
        return vocal1;
    }
    
    public String getConsonanteApellido1(){
        String consonante1 = apellido1.toUpperCase();
        for(int i=0; i<consonante1.length(); i++) {
            if(consonante1.substring(i,i+1) != "A"||
               consonante1.substring(i,i+1) != "E"|| 
               consonante1.substring(i,i+1) != "I"||
               consonante1.substring(i,i+1) != "O"|| 
               consonante1.substring(i,i+1) != "U")
               {
               consonante1 = consonante1.substring(i,i+1);
            }
        }
        return consonante1;
    }
        
    public String getConsonanteApellido2(){
        String consonante2 = apellido2.toUpperCase();
        for(int i=0; i<consonante2.length(); i++) {
            if(consonante2.substring(i,i+1) != "A"||
               consonante2.substring(i,i+1) != "E"|| 
               consonante2.substring(i,i+1) != "I"||
               consonante2.substring(i,i+1) != "O"|| 
               consonante2.substring(i,i+1) != "U")
               {
               consonante2 = consonante2.substring(i,i+1);
            }
        }
        return consonante2;
    }
        
    public String getConsonanteNombre1(){
        String consonante3 = nombre1.toUpperCase();
        for(int i=0; i<consonante3.length(); i++) {
            if(consonante3.substring(i,i+1) != "A"||
               consonante3.substring(i,i+1) != "E"|| 
               consonante3.substring(i,i+1) != "I"||
               consonante3.substring(i,i+1) != "O"|| 
               consonante3.substring(i,i+1) != "U")
               {
               consonante3 = consonante3.substring(i,i+1);
            }
        }
        return consonante3;
    }
            
    public String getRandom(){
        char [] chars = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".toCharArray();
        int charsLength = chars.length;
        
        Random random = new Random();
        char instancia = (chars[random.nextInt(charsLength)]);
        String random1 = String.valueOf(instancia);
        return random1;
    }
    
    public String getClaveEstado(){
        String claveEstado = this.estado.toUpperCase();
        if(claveEstado == "AGUASCALIENTES"){claveEstado = "AS";}
        if(claveEstado == "BAJA CALIFORNIA SUR"){claveEstado = "BS";}
        if(claveEstado == "COAHUILA"){claveEstado = "CL";}
        if(claveEstado == "CHIAPAS"){claveEstado = "CS";}
        if(claveEstado == "DISTRITO FEDERAL"){claveEstado = "DF";}
        if(claveEstado == "GUANAJUATO"){claveEstado = "GT";}
        if(claveEstado == "HIDALGO"){claveEstado = "HG";}
        if(claveEstado == "MÉXICO" || claveEstado == "MEXICO"){claveEstado = "MC";}
        if(claveEstado == "MORELOS"){claveEstado = "MS";}
        if(claveEstado == "NUEVO LEÓN" || claveEstado == "NUEVO LEON"){claveEstado = "NL";}
        if(claveEstado == "PUEBLA"){claveEstado = "OL";}
        if(claveEstado == "QUINTANA ROO"){claveEstado = "QR";}
        if(claveEstado == "SINALOA"){claveEstado = "SL";}
        if(claveEstado == "TLAXCALA"){claveEstado = "TL";}
        if(claveEstado == "YUCATAN" || claveEstado == "YUCATAN"){claveEstado = "YN";}
        if(claveEstado == "BAJA CALIFORNIA"){claveEstado = "BC";}
        if(claveEstado == "CAMPECHE"){claveEstado = "CC";}
        if(claveEstado == "COLIMA"){claveEstado = "CM";}
        if(claveEstado == "CHIHUAHUA"){claveEstado = "CH";}
        if(claveEstado == "DURANGO"){claveEstado = "DG";}
        if(claveEstado == "GUERRERO"){claveEstado = "GR";}
        if(claveEstado == "JALISCO"){claveEstado = "JC";}
        if(claveEstado == "MICHOACÁN" || claveEstado == "MICHOACAN"){claveEstado = "MN";}
        if(claveEstado == "NAYARIT"){claveEstado = "NT";}
        if(claveEstado == "OAXACA"){claveEstado = "OC";}
        if(claveEstado == "QUERÉTARO" || claveEstado == "QUERETARO"){claveEstado = "QT";}
        if(claveEstado == "SAN LUIS POTOSÍ" || claveEstado == "SAN LUIS POTOSI"){claveEstado = "SP";}
        if(claveEstado == "SONORA"){claveEstado = "SR";}
        if(claveEstado == "TAMAULIPAS"){claveEstado = "TS";}
        if(claveEstado == "VERACRUZ"){claveEstado = "VZ";}
        if(claveEstado == "ZACATECAS"){claveEstado = "ZS";}
        if(claveEstado == "NACIDO EN EL EXTRANJERO"){claveEstado = "NE";}
        
        return claveEstado;
    }
    
    
    public void metodoCurp(String nombre1, String nombre2, String apellido1, String apellido2, String genero, String estado, String dia, String mes, String año){
        String L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17,L18;
        L1 = apellido1.substring(0,1);
        L2 = getVocal1();
        L3 = apellido2.substring(0,1);
        L4 = nombre1.substring(0,1);
        L5 = año.substring(2,3);
        L6 = año.substring(3,4);
        L7 = mes.substring(0,1);
        L8 = mes.substring(1,2);
        L9 = dia.substring(0,1);
        L10 = dia.substring(1,2);
        L11 = genero.substring(0,1);
        L12 = getClaveEstado().substring(0,1);
        L13 = getClaveEstado().substring(1,2);
        L14 = getConsonanteApellido1();
        L15 = getConsonanteApellido2();
        L16 = getConsonanteNombre1();
        L17 = getRandom();
        L18 = getRandom();
        this.CURP = L1 + L2 + L3 + L4 + L5 + L6 + L7 + L8 + L9 + L10 + L11 + L12 + L13 + L14 + L15 + L16 + L17 + L18;
        this.CURP = CURP.toUpperCase();
        System.out.println("Su CURP es:"+CURP);
    }
    
    public void metodoRFC(String nombre1, String nombre2, String apellido1, String apellido2, String genero, String estado, String dia, String mes, String año){
        String RFC, rand1, rand2, rand3;
        rand1 = getRandom();
        rand2 = getRandom();
        rand3 = getRandom();
        RFC = this.CURP.substring(0,9) + rand1 + rand2 + rand3;
        System.out.println("Su RFC es:"+RFC);
    }
}

