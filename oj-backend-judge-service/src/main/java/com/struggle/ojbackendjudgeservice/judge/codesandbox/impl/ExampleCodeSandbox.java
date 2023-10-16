package com.struggle.ojbackendjudgeservice.judge.codesandbox.impl;


import com.struggle.ojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.struggle.ojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.struggle.ojbackendmodel.codesandbox.ExecuteCodeResponse;
import com.struggle.ojbackendmodel.codesandbox.JudgeInfo;
import com.struggle.ojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.struggle.ojbackendmodel.model.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author Mr.Chen
 * 示例代码沙箱（ 示例仅为了跑通业务流程）
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {

        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        List<String> inputList = executeCodeRequest.getInputList();

        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);

        executeCodeResponse.setJudgeIno(judgeInfo);

        return executeCodeResponse;
    }
}
