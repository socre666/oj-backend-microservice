package com.struggle.ojbackendmodel.codesandbox;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Mr.Chen
 */
@Data
//构造器的写法来创建对象
@Builder
//声明无参的构造条件
@NoArgsConstructor
//所有参数都有的构造函数
@AllArgsConstructor
public class ExecuteCodeResponse {
    /**
     * 接收一组题目输入的数据
     */
    private List<String> outputList;

    /**
     * 接口信息
     */

    private String message;

    /**
     * 执行状态
     */
    private Integer status;

    /**
     * 判题的信息
     */
    private JudgeInfo judgeIno;
}
