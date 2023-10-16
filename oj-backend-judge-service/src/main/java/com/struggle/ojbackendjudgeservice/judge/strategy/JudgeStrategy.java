package com.struggle.ojbackendjudgeservice.judge.strategy;


import com.struggle.ojbackendmodel.codesandbox.JudgeInfo;

/**
 * @author Mr.Chen
 * 判题策略
 */
public interface JudgeStrategy {
    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);

}
