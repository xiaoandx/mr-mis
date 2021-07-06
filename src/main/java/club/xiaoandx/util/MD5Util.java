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
package club.xiaoandx.util;

import java.security.MessageDigest;

/**
 * <p> MD5加密工具类  </p>
 * MD5加密
 * @version V1.0.0
 * @ClassName:MD5Util
 * @author: WEI.ZHOU
 * @date: 2021/6/27 18:01
 */
public class MD5Util {

    private static final String KEY_MD5 = "MD5";

    private static final String[] strDigits = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    /**
     * <p> 返回形式为数字跟字符串 </p>
     * @title: byteToArrayString
     * @date: 2021/6/27 18:03
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param bByte
     * @return: java.lang.String
     **/
    private static String byteToArrayString(byte bByte) {
        int iRet = bByte;
        if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }

    /**
     * <p> 转换字节数组为16进制字串 </p>
     * @title: byteToString
     * @date: 2021/6/27 18:04
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param bByte
     * @return: java.lang.String
     **/
    private static String byteToString(byte[] bByte) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    /**
     * <p> MD5加密 </p>
     * @title: GetMD5Code
     * @date: 2021/6/27 18:04
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param strObj
     * @return: java.lang.String
     **/
    public static String GetMD5Code(String strObj) throws Exception {
        MessageDigest md = MessageDigest.getInstance(KEY_MD5);
        return byteToString(md.digest(strObj.getBytes()));
    }
}