package com.struggle.ojbackendjudgeservice.judge.codesandbox.impl;


import com.struggle.ojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.struggle.ojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.struggle.ojbackendmodel.codesandbox.ExecuteCodeResponse;

/**
 * @author Mr.Chen
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
