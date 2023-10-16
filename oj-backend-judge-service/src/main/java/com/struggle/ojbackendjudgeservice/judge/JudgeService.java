package com.struggle.ojbackendjudgeservice.judge;


import com.struggle.ojbackendmodel.model.entity.QuestionSubmit;

/**
 * @author Mr.Chen
 * 判题服务
 */
public interface JudgeService {
    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
