package com.struggle.ojbackendjudgeservice.judge.strategy;

import com.struggle.ojbackendmodel.codesandbox.JudgeInfo;
import com.struggle.ojbackendmodel.model.dto.question.JudgeCase;
import com.struggle.ojbackendmodel.model.entity.Question;
import com.struggle.ojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * @author Mr.Chen
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private Question question;

    private List<JudgeCase> judgeCasesList;

    private QuestionSubmit questionSubmit;

}
