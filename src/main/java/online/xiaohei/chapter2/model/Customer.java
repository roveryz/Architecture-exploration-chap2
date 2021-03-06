package online.xiaohei.chapter2.model;
/*
 * @author zy
 * @date 2018/6/10 22:58
 * @desc 客户
 */

import lombok.ToString;

@ToString
public class Customer {
    private long id;
    private String name;
    private String contact;// 联系人
    private String telephone;
    private String email;
    private String remark;// 备注

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
