package com.struggle.ojbackendjudgeservice.judge;


import com.struggle.ojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.struggle.ojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.struggle.ojbackendjudgeservice.judge.strategy.JudgeContext;
import com.struggle.ojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.struggle.ojbackendmodel.codesandbox.JudgeInfo;
import com.struggle.ojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * @author Mr.Chen
 * 判题（管理简化调用）
 */
@Service
public class JudgeManager {
    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
