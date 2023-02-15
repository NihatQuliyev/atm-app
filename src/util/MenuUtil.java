package util;
import static util.InputUtil.byteInput;
public class MenuUtil {
    public static byte entry  (){
        System.out.println("1. Cashing out (Nəğdləşdirmə)\n" +
                "2. Exit \n");

        return byteInput("Option: ");
    }


}
