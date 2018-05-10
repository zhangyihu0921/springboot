package z_msb.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class User {
	private int id;
	private String name;
	@JSONField(format="yyyy-MM-dd HH:mm")
	private Date birthday;
	@JSONField(serialize=false)
	private String remark;
	

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
