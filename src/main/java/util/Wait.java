package util;

public class Wait {

    public void wait(int sec){
        try {
            Thread.sleep(1000 * sec);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
