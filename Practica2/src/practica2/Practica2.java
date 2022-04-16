package practica2;
//Hector Alfonso

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        int op;
        
        Puerta[] puerta = new Puerta[6];
        puerta[0] = new Puerta("Blanco",2,1,200,"PVC");
        puerta[1] = new Puerta("Cafe", (float) 1.8, (float) 0.8,120,"Madera");
        puerta[2] = new Puerta("Negro", (float) 2.2, (float) 1.05,200,"Acero");
        puerta[3] = new Puerta();
        puerta[4] = new Puerta();
        puerta[5] = new Puerta();
        
        Mouse[] mouse = new Mouse[6];
        mouse[0] = new Mouse("Negro","Gamercraft","Sí",7,4800);
        mouse[1] = new Mouse("Blanco","Logitech","No",3,2600);
        mouse[2] = new Mouse("Gris metalico","Free wolf","Sí",5,3600);
        mouse[3] = new Mouse();
        mouse[4] = new Mouse();
        mouse[5] = new Mouse();
        
        Bicicleta[] bicicleta = new Bicicleta[6];
        bicicleta[0] = new Bicicleta("Rojo","Montaña","Adulto",30,21);
        bicicleta[1] = new Bicicleta("Rosa","Urbano","Niños",18,3);
        bicicleta[2] = new Bicicleta("Verde","Montaña","Adulto",29,18);
        bicicleta[3] = new Bicicleta();
        bicicleta[4] = new Bicicleta();
        bicicleta[5] = new Bicicleta();
        
        Monitor[] monitor = new Monitor[6];
        monitor[0] = new Monitor("LED","HP","1920x1080",23,60);
        monitor[1] = new Monitor("LCD","Asus","1680x1080",20,59);
        monitor[2] = new Monitor("LED","Acer","3840x2160",26,144);
        monitor[3] = new Monitor();
        monitor[4] = new Monitor();
        monitor[5] = new Monitor();
        
        Calculadora[] calculadora = new Calculadora[6];
        calculadora[0] = new Calculadora("Cientifica","Casio","Pila",12,24);
        calculadora[1] = new Calculadora("Básica","Truper","Solar",10,5);
        calculadora[2] = new Calculadora("Impresora","Canon","Pila",16,6);
        calculadora[3] = new Calculadora();
        calculadora[4] = new Calculadora();
        calculadora[5] = new Calculadora();
        
        while(!salir){
            
            System.out.println("\n----Eliga una clase----");
            System.out.println("1| Puerta");
            System.out.println("2| Mouse");
            System.out.println("3| Bicicleta");
            System.out.println("4| Monitor");
            System.out.println("5| Calculadora");
            System.out.println("0| Salir");
            op = scan.nextInt();
            
            switch(op){
                case 1:System.out.println("----Eliga que desea hacer----");
                       System.out.println("1| Capturar atributos");
                       System.out.println("2| Imprimir objetos");
                       op = scan.nextInt();
                       switch(op){
                           case 1:for(int i=3; i<6; i++){
                           System.out.println("----Objeto "+(i+1)+"----\nColor:"); puerta[i].setColor(scan.next());
                           System.out.println("Longitud:"); puerta[i].setLongitud(scan.nextFloat());
                           System.out.println("Ancho:"); puerta[i].setAncho(scan.nextFloat());
                           System.out.println("Volumen:"); puerta[i].setVolumen(scan.nextFloat());
                           System.out.println("Material:"); puerta[i].setMaterial(scan.next());
                           } break;
                           case 2:for(int i=0; i<6; i++){
                           System.out.println("\n----Objeto:"+(i+1)+"----\nColor:"+puerta[i].getColor()+"\nLongitud:"+puerta[i].getLongitud()
                           +"\nAncho:"+puerta[i].getAncho()+"\nVolumen:"+puerta[i].getVolumen()+"\nMaterial:"+puerta[i].getMaterial());}break;
                       }
                break;
                case 2:System.out.println("----Eliga que desea hacer----");
                       System.out.println("1| Capturar atributos");
                       System.out.println("2| Imprimir objetos");
                       op = scan.nextInt();
                       switch(op){
                           case 1:for(int i=3; i<6; i++){
                           System.out.println("----Objeto "+(i+1)+"----\nMarca:"); mouse[i].setMarca(scan.next());
                           System.out.println("Color:"); mouse[i].setColor(scan.next());
                           System.out.println("DPI:"); mouse[i].setDPI(scan.nextInt());
                           System.out.println("Botones:"); mouse[i].setBotones(scan.nextInt());
                           System.out.println("RGB:"); mouse[i].setRGB(scan.next());
                           } break;
                           case 2:for(int i=0; i<6; i++){
                           System.out.println("\n----Objeto:"+(i+1)+"----\nMarca:"+mouse[i].getMarca()+"\nColor:"+mouse[i].getColor()
                           +"\nDPI:"+mouse[i].getDPI()+"\nBotones:"+mouse[i].getBotones()+"\nRGB:"+mouse[i].getRGB());}break;
                       }
                break;
                case 3:System.out.println("----Eliga que desea hacer----");
                       System.out.println("1| Capturar atributos");
                       System.out.println("2| Imprimir objetos");
                       op = scan.nextInt();
                       switch(op){
                           case 1:for(int i=3; i<6; i++){
                           System.out.println("----Objeto "+(i+1)+"----\nTipo:"); bicicleta[i].setTipo(scan.next());
                           System.out.println("Color:"); bicicleta[i].setColor(scan.next());
                           System.out.println("Rodado:"); bicicleta[i].setRodado(scan.nextInt());
                           System.out.println("Velocidades:"); bicicleta[i].setVelocidades(scan.nextInt());
                           System.out.println("Grupo Etario:"); bicicleta[i].setGrupoEtario(scan.next());
                           } break;
                           case 2:for(int i=0; i<6; i++){
                           System.out.println("\n----Objeto:"+(i+1)+"----\nTipo:"+bicicleta[i].getTipo()+"\nColor:"+bicicleta[i].getColor()
                           +"\nRodado:"+bicicleta[i].getRodado()+"\nVelocidades:"+bicicleta[i].getVelocidades()+"\nGrupo Etario:"+bicicleta[i].getGrupoEtario());}break;
                       }
                break;
                case 4:System.out.println("----Eliga que desea hacer----");
                       System.out.println("1| Capturar atributos");
                       System.out.println("2| Imprimir objetos");
                       op = scan.nextInt();
                       switch(op){
                           case 1:for(int i=3; i<6; i++){
                           System.out.println("----Objeto "+(i+1)+"----\nMarca:"); monitor[i].setMarca(scan.next());
                           System.out.println("Herzios:"); monitor[i].setHerzios(scan.nextInt());
                           System.out.println("Tipo:"); monitor[i].setTipo(scan.next());
                           System.out.println("Resolución:"); monitor[i].setResolucion(scan.next());
                           System.out.println("Pulgadas:"); monitor[i].setPulgadas(scan.nextInt());
                           } break;
                           case 2:for(int i=0; i<6; i++){
                           System.out.println("\n----Objeto:"+(i+1)+"----\nMarca:"+monitor[i].getMarca()+"\nHerzios:"+monitor[i].getHerzios()
                           +"\nTipo:"+monitor[i].getTipo()+"\nResolucion:"+monitor[i].getResolucion()+"\nPulgadas:"+monitor[i].getPulgadas());}break;
                       }
                break;
                case 5:System.out.println("----Eliga que desea hacer----");
                       System.out.println("1| Capturar atributos");
                       System.out.println("2| Imprimir objetos");
                       op = scan.nextInt();
                       switch(op){
                           case 1:for(int i=3; i<6; i++){
                           System.out.println("----Objeto "+(i+1)+"----\nMarca:"); calculadora[i].setMarca(scan.next());
                           System.out.println("Modelo:"); calculadora[i].setModelo(scan.next());
                           System.out.println("Cantidad de funciones:"); calculadora[i].setCantidadFunciones(scan.nextInt());
                           System.out.println("Digitos:"); calculadora[i].setDigitos(scan.nextInt());
                           System.out.println("Alimentación:"); calculadora[i].setAlimentacion(scan.next());
                           } break;
                           case 2:for(int i=0; i<6; i++){
                           System.out.println("\n----Objeto:"+(i+1)+"----\nMarca:"+calculadora[i].getMarca()+"\nModelo:"+calculadora[i].getModelo()
                           +"\nCantidad de funciones:"+calculadora[i].getCantidadFunciones()+"\nDigitos:"+calculadora[i].getDigitos()+"\nAlimentacion:"+calculadora[i].getAlimentacion());}break;
                       }
                break;
                case 0: salir=true; break;
                }
            } 
    }
}
