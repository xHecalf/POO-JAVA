package practica11;

public class String_Float {
    public static float convertirStringToFloat(String string){
        try{
            float number = Float.parseFloat(string);
            return number;
        }
        catch(NumberFormatException ex){
            ex.printStackTrace();
        }
        return 0;
    }
}
