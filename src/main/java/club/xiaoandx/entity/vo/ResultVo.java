/*
 * Copyright (c) 2021 WEI.ZHOU. All rights reserved.
 * The following code is only used for learning and communication, not for illegal and
 * commercial use.
 * If the code is used, no consent is required, but the author has nothing to do with any problems
 * and consequences.
 * In case of code problems, feedback can be made through the following email address.
 *
 *                        <xiaoandx@gmail.com>
 */
package club.xiaoandx.entity.vo;

/**
 * <p> 返回对象 </p>
 * @version V1.0.0
 * @ClassName:ResultVo
 * @author: WEI.ZHOU
 * @date: 2021/6/10 17:15
 */
public class ResultVo {
    private Integer status;
    private String message;
    private Object data;

    public ResultVo(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResultVo() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
