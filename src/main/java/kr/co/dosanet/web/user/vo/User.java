package kr.co.dosanet.web.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class User {

	
	@NonNull
	private String id;
	
	private String name;
	
}
