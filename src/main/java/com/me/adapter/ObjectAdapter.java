package com.me.adapter;

/**
 * @Autor syl
 * @Date 2019/2/21 15:15
 **/
public class ObjectAdapter implements Job {
    Person person;

    public ObjectAdapter(Person person) {
        this.person = person;
    }

    @Override
    public void speakJapanese() {
        person.speakJapanese();
    }

    @Override
    public void speakEnglish() {
        person.speakEnglish();
    }

    @Override
    public void speakFrench() {

    }
}
