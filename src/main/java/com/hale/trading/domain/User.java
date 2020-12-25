package com.hale.trading.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    private String phone;
    @NotEmpty
    private  String password;
    @NotEmpty
    private String firstName;
    @NotBlank
    private String lastName;

    @NotNull
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate birthday;

    @Size(min = 9, max = 9, message = "Size must be 9 characters")
    private String licenseNum;
    @Enumerated(EnumType.STRING)
    private ProfileVerificationType profileVerificationType = ProfileVerificationType.NEED_TO_VERIFY;
    private String verificationCode = null;

    @Enumerated(EnumType.STRING)
    private UserVerificationType userVerificationType = UserVerificationType.NEED_TO_VERIFY;
    private LocalDateTime verificationCreationTime = LocalDateTime.now();
    private Integer failedVerificationCount = 0;
    private Boolean enable = true;
    private Boolean isResetPassword = false;

    @Enumerated(EnumType.STRING)
    private Role role;
}
