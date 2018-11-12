package com.me.proxy.demo;

// 代表诉讼的接口
public interface ILawSuit {

    void submit(String proof);  // 提起诉讼
    void defend();             // 法律辩护
}
