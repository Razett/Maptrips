package com.razett.maptrips.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * UsersDTO
 *
 * @since 2024-10-18 v1.0.0
 * @author JiwonJeong
 * @version 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersDTO implements Serializable {
    private static final long serialVersionUID = 1L; // 버전 관리용 ID

    private Long id;

    @NotBlank(message = "이메일 주소를 입력하세요.")
    @Email(message = "올바른 이메일 주소를 입력하세요.")
    private String email;

    @NotBlank(message = "Username을 입력하세요.")
    @Pattern(regexp = "[a-z\\\\d\\\\-_.]{6,14}", message = "Username은 6~14자리 이내 및 문자, 숫자, 특수문자(- _ .) 만 가능합니다.")
    private String username;

    @NotBlank(message = "패스워드는 8~16자리 이내 및 영문자, 숫자, 특수문자를 포함해야 합니다.")
    @Pattern(regexp = "^.*(?=^.{8,16}$)(?=.*\\\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&*+=]).*$", message = "패스워드는 8~16자리 이내 및 영문자, 숫자, 특수문자를 포함해야 합니다.")
    private String password;

    @NotBlank(message = "전화번호를 입력해 주세요.")
    @Pattern(regexp = "^(?:(\\+82|0)(?:-?)(?:2|10)-?)?(\\d{3,4})(?:-?)(\\d{4})$", message = "올바른 휴대전화 번호를 입력하세요.")
    private String phone;

    private String naverId;

    private UserInfoDTO userInfoDTO;
}
