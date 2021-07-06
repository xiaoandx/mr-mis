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
package club.xiaoandx.entity;

/**
 * <p> 权限菜单 </p>
 * @version V1.0.0
 * @ClassName:RoleMenu
 * @author: WEI.ZHOU
 * @date: 2021/6/9 15:14
 */
public class RoleMenu {

    /**
     * 菜单id
     */
    private Integer mid;

    /**
     * 菜单名称
     */
    private String title;

    /**
     * 菜单icon
     */
    private String icon;

    /**
     * 链接地址
     */
    private String href;

    /**
     * 跳转方式
     */
    private String target;

    /**
     * 权限id
     */
    private Integer rid;

    private  Integer layer;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
                "mid=" + mid +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", href='" + href + '\'' +
                ", target='" + target + '\'' +
                ", rid=" + rid +
                ", layer=" + layer +
                '}';
    }
}
