package com.sdju.common.exception;

import com.sdju.common.constants.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Ygn
 * @since 2020-04-02
 */
@Data
@ApiModel(value = "自定义全局异常类")
public class SdjuException extends RuntimeException {
    @ApiModelProperty(value = "状态码")
    private Integer code;

    /**
     * 接收状态码和错误消息
     *
     * @param code
     * @param message
     */
    public SdjuException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SdjuException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "SdjuException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}

