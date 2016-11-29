package jp.techacademy.haruki.saburi.javalog;

import android.util.Log;

/**
 * Created by tgaiacontentsdev on 2016/11/21.
 */

public class BigDog extends Dog {
    static String to_jp = "大型犬";

    public BigDog(String name, int age){
        super(name,age);
    }

    public static void introduce(){
        Log.d("jabatest","これは大型犬クラスです。");
    }
}
