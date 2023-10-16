package com.struggle.ojbackendjudgeservice.judge.codesandbox;


import com.struggle.ojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.struggle.ojbackendmodel.codesandbox.ExecuteCodeResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Mr.Chen
 */
@Slf4j
public class CodeSandboxProxy implements  CodeSandbox {
    private final CodeSandbox codeSandbox;
    public CodeSandboxProxy(CodeSandbox codeSandbox){
        this.codeSandbox=codeSandbox;

    }
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("代码沙箱请求信息"+executeCodeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        log.info("代码沙箱响应信息"+executeCodeResponse.toString());
        return executeCodeResponse;

    }
}
