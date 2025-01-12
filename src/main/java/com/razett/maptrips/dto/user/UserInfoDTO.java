package com.razett.maptrips.dto.user;

import com.razett.maptrips.type.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * UserInfoDTO
 *
 * @since 2024-10-18 v1.0.0
 * @author JiwonJeong
 * @version 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L; // 버전 관리용 ID

    private String firstName;

    private String lastName;

    private Gender gender;

    private Integer age;

    private String postcode;

    private String mainAddr;

    private String subAddr;

    private LocalDate birthday;
}
