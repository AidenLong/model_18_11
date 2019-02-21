package com.me.adapter;

/**
 * @Autor syl
 * @Date 2019/2/21 15:18
 **/
public class AdapterTest {

    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.speakEnglish();

        Person person = new Person();
        ObjectAdapter objectAdapter = new ObjectAdapter(person);
        objectAdapter.speakJapanese();
    }
}
