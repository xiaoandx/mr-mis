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

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * <p> 验证码生成工具 </p>
 * @version V1.0.0
 * @ClassName:CaptchaUtil
 * @author: WEI.ZHOU
 * @date: 2021/4/20 18:41
 */
public class CaptchaUtil {
    private BufferedImage image;
    private String str;
    private static char[] code =
            "abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ1234567890".toCharArray();

    private CaptchaUtil() {
        init();
    }

    /**
     * <p> 取得RandomNumUtil实例 </p>
     * @title: Instance
     * @date: 2021/4/20 20:08
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @return: club.xiaoandx.util.CaptchaUtil
     **/
    public static CaptchaUtil Instance() {
        return new CaptchaUtil();
    }

    /**
     * <p> 取得验证码图片 </p>
     * @title: getImage
     * @date: 2021/4/20 20:09
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @return: java.awt.image.BufferedImage
     **/
    public BufferedImage getImage() {
        return this.image;
    }

    /**
     * <p> 取得图片的验证码 </p>
     *
     * @title: getString
     * @date: 2021/4/20 20:09
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @return: java.lang.String
     **/
    public String getString() {
        return this.str;
    }

    /**
     * <p> 生成图形验证码 初始化方法 </p>
     * @title: init
     * @date: 2021/4/20 20:10
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @return: void
     **/
    private void init() {
        int width = 100, height = 38;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 获取图形上下文
        Graphics g = image.getGraphics();
        // 生成随机类
        Random random = new Random();
        // 设定背景色
        g.setColor(getRandColor(200, 250));
        g.fillRect(0, 0, width, height);
        // 设定字体
        g.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        // 随机产生155条干扰线，使图象中的认证码不易被其它程序探测到
        g.setColor(getRandColor(160, 200));
        for (int i = 0; i < 155; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            g.drawLine(x, y, x + xl, y + yl);
        }
        // 取随机产生的认证码(4位数字)
        String sRand = "";
        for (int i = 0; i < 4; i++) {
            String rand = String.valueOf(code[random.nextInt(code.length)]);
            sRand += rand;
            // 将认证码显示到图象中
            g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110),
                    20 + random.nextInt(110)));
            // 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成设置显示位置
            g.drawString(rand, 15 * i + 20, 30);
        }
        // 赋值验证码
        this.str = sRand;
        // 图象生效
        g.dispose();
        this.image = image;
    }

    /**
     * <p> 给定范围获得随机颜色 </p>
     *
     * @param fc
     * @param bc
     * @title: getRandColor
     * @date: 2021/4/20 20:09
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @return: java.awt.Color
     **/
    private Color getRandColor(int fc, int bc) {
        Random random = new Random();
        if (fc > 255) {
            fc = 255;
        }
        if (bc > 255) {
            bc = 255;
        }
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }
}

