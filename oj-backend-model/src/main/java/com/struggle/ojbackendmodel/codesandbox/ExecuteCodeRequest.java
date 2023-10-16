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
public class ExecuteCodeRequest {
    //接收一组题目输入的数据
    private List<String> inputList;

    //接收代码
    private String code;

    //接收执行的编程语言
    private String language;
}
