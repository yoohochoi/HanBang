package hanbang.domain;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Entity;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Entity
public class Member {
	
	@Column
	@NotNull
	@Size(min = 6, max = 10, message ="ID는 6-10자 이내로 입력해주세요.")
	private String id;
	@Column
	@NotNull
	@Pattern(regexp="^(?=.*\\d)(?=.*[a-z]).{8,12}$", message ="숫자,영어 조합으로 8-12자 이내로 입력해주세요.")
	private String password;
	@Column
	@NotNull
	@Size(min= 2, max = 8 ,message = "이름은 2-8자 이내로 입력해주세요.")
	private String name;
	private String phoneNumber;
	@Column
	@NotNull
	@Pattern(regexp="\\S", message = "이메일을 입력해주세요.")
	private String email;
	private int memberTypeId;
	
	public Member() {
	}
	
	public Member(String memberId, String password, String name, String phoneNumber, String email, int memberTypeId) {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMemberTypeId() {
		return memberTypeId;
	}

	public void setMemberTypeId(int memberTypeId) {
		this.memberTypeId = memberTypeId;
	}
	
}
