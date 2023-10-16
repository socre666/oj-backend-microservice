package com.struggle.ojbackendmodel.model.enums;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户角色枚举
 *
 *
 */
public enum JudgeInfoMessageEnum {

    ACCEPTED("成功", "Accepted"),
    WRONG_ANSWER("答案错误", "WRONG_ANSWER"),
    COMPTLE_ERROR("内存溢出", "COMPTLE_ERROR"),
    MEMORY_LIMIT_EXCEEDED("超时", "MEMORY_LIMIT_EXCEEDED"),
    TIME_LIMIT_EXCEEDED("展示错误", "TIME_LIMIT_EXCEEDED"),
    PRESENTATION_ERROR("展示错误", "PRESENTATION_ERROR"),
    WAITING("展示错误", "WAITING"),
    OUTPUT_LIMIT_EXCEEDED("展示错误", "OUTPUT_LIMIT_EXCEEDED"),
    DANGEROUS_OPERATION("输出溢出", "DANGEROUS_OPERATION"),
    RUNTIME_ERRO("危险操作", "RUNTIME_ERRO"),
    SYSTEM_ERRO("运行错误", "SYSTEM_ERRO");

    private final String text;

    private final String value;

    JudgeInfoMessageEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<String> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value
     * @return
     */
    public static JudgeInfoMessageEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (JudgeInfoMessageEnum anEnum : JudgeInfoMessageEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
