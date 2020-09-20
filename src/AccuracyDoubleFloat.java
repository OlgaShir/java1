public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double v = 4/3.0*3.14*(radius*radius*radius);
        System.out.println(v);
        return v;
    }
    public static float volumeBallFloat(float radius){
        float v1 = 4/3.0f*3.14f*((float)radius*(float)radius*(float)radius);
        System.out.println(v1);
        return v1;
    }
    public static double calculateAccuracy(double radius){
        System.out.println(volumeBallDouble (6371.2) - volumeBallFloat(6371.2f));
        return volumeBallDouble ((float)radius) - volumeBallFloat((float) radius);
    }

    public static void main(String[] args) {
        volumeBallDouble(6371.2);
        volumeBallFloat(6371.2f);

    }
}
