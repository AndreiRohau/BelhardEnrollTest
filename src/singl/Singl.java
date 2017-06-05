package singl;

/**
 * Created by rohau.andrei on 24.05.2017.
 */
public class Singl {

    private static Singl instance;
    private static int name;
    private static int pwrd;



    private Singl(int name, int pwrd){
        this.name = name;
        this.pwrd = pwrd;
    }

    public static int getName() {
        return name;
    }

    public static void setName(int name) {
        Singl.name = name;
    }

    public static int getPwrd() {
        return pwrd;
    }

    public static void setPwrd(int pwrd) {
        Singl.pwrd = pwrd;
    }

    @Override
    public String toString(){
        System.out.println(name + " " + pwrd);
        return null;
    }


    public static Singl getInstance(){
        if(instance == null){
            instance = new Singl(name, pwrd);
        }
        return instance;
    }

}
