package jp.techacademy.haruki.saburi.javalog;

import android.util.Log;

/**
 * Created by tgaiacontentsdev on 2016/11/21.
 */

public class Human extends Animal implements Thinkable {

    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say(){
        Log.d("javatest","「私の名前は" + this.name + "です。年は" + this.age + "歳です。」");
    }

    @Override
    public void think(){
        Log.d("javatest","「私は" + this.hobby + "について考える」");
    }
}
