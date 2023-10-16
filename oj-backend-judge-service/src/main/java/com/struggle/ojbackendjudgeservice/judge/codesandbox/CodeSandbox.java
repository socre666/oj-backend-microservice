package com.struggle.ojbackendjudgeservice.judge.codesandbox;


import com.struggle.ojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.struggle.ojbackendmodel.codesandbox.ExecuteCodeResponse;

/**
 * @author Mr.Chen
 * 代码沙箱接口的定义
 */
public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
