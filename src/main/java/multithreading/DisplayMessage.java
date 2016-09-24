package multithreading;

/**
 * Created by Nozomi on 2016/9/18.
 */
public class DisplayMessage implements Runnable {
    private String message;
    public DisplayMessage(String message){
        this.message=message;
    }

    public void run(){
        while (true )
        {
            System.out.println(message);
        }
    }
}
