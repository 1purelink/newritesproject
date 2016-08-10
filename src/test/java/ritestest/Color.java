package ritestest;

/**
 * Created by man on 7/21/16.
 */
public enum Color {
    RED(255,0,0), GREEN(0,255,255), BLUE(0,0,255);

    private int red;
    private int green;
    private int blue;

    private Color(int r, int g, int b){
        red = r;
        green = g;
        blue = b;
    }

    public String rgbValue(){
        return String.format("(%d, %d, %d)", red, green, blue);
    }

    @Override
    public String toString(){
        String consName = super.toString();
        return consName.substring(0, 1) + consName.substring(1).toLowerCase();
    }

}
